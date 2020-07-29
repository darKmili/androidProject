package com.darkmili.materialtest;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.SharedPreferencesCompat;

import com.darkmili.materialtest.entity.MyApplication;
import com.darkmili.materialtest.utils.LoginUtil;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bt_login, bt_register, bt_error;
    private EditText ed_name, ed_pass;
    private final static int LOGIN_ENABLE = 1;
    private final static int LOGIN_UNABLF = 2;
    private final static int PASS_ERROR = 3;
    private final static int NAME_ERROR = 4;  //上面是消息的常量值
    private CheckBox checkBox;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        if (Build.VERSION.SDK_INT >= 21){
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        bt_login = findViewById(R.id.bt_login);
        bt_login.setOnClickListener(this);
        bt_register=findViewById(R.id.bt_register);
        bt_register.setOnClickListener(this);
        ed_name = findViewById(R.id.ed_name);
        ed_pass = findViewById(R.id.ed_pass);
        //判断复选框是否选择保存密码
        checkBox=findViewById(R.id.remember_checkbox);
        sharedPreferences=getSharedPreferences("user",MODE_PRIVATE);
        if (sharedPreferences.getBoolean("check",false)){
            Intent intent=new Intent(LoginActivity.this,MainActivity.class);
            ed_name.setText(sharedPreferences.getString("user",""));
            ed_pass.setText(sharedPreferences.getString("pass",""));
            checkBox.setChecked(true);
            MyApplication.setGlobalvariable(sharedPreferences.getString("user",""));
            startActivity(intent);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_login:

                //验证密码是否正确
                String name = ed_name.getText().toString();
                String pass = ed_pass.getText().toString();
                //pass_check为true表示登录成功
                boolean pass_check = LoginUtil.login_pass(name, pass);
                sharedPreferences=getSharedPreferences("user",MODE_PRIVATE);
                editor=sharedPreferences.edit();
                if (pass_check == true) {
                    MyApplication.setGlobalvariable(name);
                    if (checkBox.isChecked()){
                        //保存账号密码，已经复选框状态

                        editor.putString("user",name);
                        editor.putString("pass",pass);
                        editor.putBoolean("check",true);
                        editor.apply();
                    }else {

                        editor.putString("user","");
                        editor.putString("pass","");
                        editor.putBoolean("check",false);
                        editor.apply();
                    }
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    ed_pass.setText("");
                    ed_name.setText("");
                    Toast.makeText(LoginActivity.this, "账号密码错误", Toast.LENGTH_SHORT).show();
                }
                //处理登录操作
                break;
            case R.id.bt_register:
                //TODO 处理注册,跳转到注册页面
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_error:
                //TODO 处理找回密码功能，跳转到找回密码页面
                break;
            default:
        }

    }
}
