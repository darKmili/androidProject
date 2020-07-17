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

public class MainActivity extends AppCompatActivity {
    Button button_login=null;
    EditText editText_user=null;
    EditText editText_pass=null;
    CheckBox checkBox_save=null;
    SharedPreferences preferences=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences= getSharedPreferences("data",MODE_PRIVATE);
        button_login=findViewById(R.id.button_login);
        editText_user=findViewById(R.id.username_edit);
        editText_pass=findViewById(R.id.password_edit);
        checkBox_save=findViewById(R.id.checkbox_save);

//
        if (preferences.getBoolean("check",false)){
            editText_user.setText(preferences.getString("username",""));
            editText_pass.setText(preferences.getString("password",""));
            checkBox_save.setChecked(true);

        }else {
            checkBox_save.setChecked(false);
        }
        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (check(editText_user,editText_pass)){
                    startActivity(new Intent(MainActivity.this,Main2Activity.class));
                }
            }
        });
    }

    public boolean check(EditText editTextu,EditText editTextp){
        SharedPreferences.Editor edit = preferences.edit();
        if (checkBox_save.isChecked()){
            edit.putString("username",editTextu.getText().toString());
            edit.putString("password",editTextp.getText().toString());
            edit.putBoolean("check",true);

        }else {
            edit.putString("username","");
            edit.putString("password","");
            edit.putBoolean("check",false);

        }
        edit.apply();
        if ("lyh".equals(editTextu.getText().toString())&&"123".equals(editTextp.getText().toString())){

            return true;
        }
        return false;
    }

}
