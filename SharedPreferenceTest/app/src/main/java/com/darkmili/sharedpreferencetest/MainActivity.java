package com.darkmili.sharedpreferencetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button_login = null;
    EditText editText_user = null;
    EditText editText_pass = null;
    CheckBox checkBox_save = null;
    CheckBox checkBox_auto = null;
    SharedPreferences preferences = null;
    SharedPreferences.Editor editor = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //通过Context获取Preference对象
        preferences = getSharedPreferences("data", MODE_PRIVATE);
        button_login = findViewById(R.id.button_login);
        editText_user = findViewById(R.id.username_edit);
        editText_pass = findViewById(R.id.password_edit);
        checkBox_save = findViewById(R.id.checkbox_save);
        checkBox_auto=findViewById(R.id.checkbox_auto_load);
        //首先应该读取preference里面的用户复选框状态，如果复选框为ture,则表示用户上一次登录成功，并且将用户密码等保存了；所以此时无需判断直接跳转
        boolean check = preferences.getBoolean("check", false);//默认为没有false
        final boolean auto_load = preferences.getBoolean("auto_load", false);
        if (check) {
            //显示preference里面保存的数据
            if (auto_load){
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
            editText_user.setText(preferences.getString("name", ""));
            editText_pass.setText(preferences.getString("pass", ""));
            checkBox_save.setChecked(true);
        }
        //自动登录必须要记住密码和自动登录复选框同时选中才生效
        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //执行登录判断，首先判断密码是否正确，决定是否跳转，在判断复选框是否选择，然后决定是否保存，而且如果它密码正确，
                // 并且复选框没有选择，需要清除preference里面的数据
                String pass_string = editText_pass.getText().toString();
                String user_string = editText_user.getText().toString();

                if ("123".equals(user_string) && "123".equals(pass_string)) {
                    editor = preferences.edit();
                    //账号密码正确，
                    if (checkBox_save.isChecked()) {
                        //选择保存密码
                        editor.putString("name", user_string);
                        editor.putString("pass", pass_string);
                        editor.putBoolean("check", checkBox_save.isChecked());
                        editor.putBoolean("auto_load",checkBox_auto.isChecked());
                    } else {
                        //选择不保存密码
                        editor.clear();
                    }
                    editor.apply();
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(intent);

                } else {
                    //账号密码错误
                    //既不保存数据,也不保存数据，发出提示
                    Toast.makeText(MainActivity.this, "账号密码错误", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
