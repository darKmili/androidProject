package com.darkmili.materialtest;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.darkmili.materialtest.entity.MyApplication;
import com.darkmili.materialtest.utils.LoginUtil;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bt_login, bt_register, bt_error;
    private EditText ed_name, ed_pass;
    private final static int LOGIN_ENABLE = 1;
    private final static int LOGIN_UNABLF = 2;
    private final static int PASS_ERROR = 3;
    private final static int NAME_ERROR = 4;  //上面是消息的常量值

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        bt_login = findViewById(R.id.bt_login);
        bt_login.setOnClickListener(this);
        bt_register=findViewById(R.id.bt_register);
        bt_register.setOnClickListener(this);
        //判断复选框是否选择保存密码

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_login:
                ed_name = findViewById(R.id.ed_name);
                ed_pass = findViewById(R.id.ed_pass);
                //验证密码是否正确
                String name = ed_name.getText().toString();
                String pass = ed_pass.getText().toString();
                //pass_check为true表示登录成功
                boolean pass_check = LoginUtil.login_pass(name, pass);
                if (pass_check == true) {
                    MyApplication.setGlobalvariable(name);
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
