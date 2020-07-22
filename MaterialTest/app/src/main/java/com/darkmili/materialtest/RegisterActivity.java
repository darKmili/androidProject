package com.darkmili.materialtest;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.darkmili.materialtest.utils.LoginUtil;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    private Button re_button;
    private EditText ed_name,ed_pass;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        re_button=findViewById(R.id.re_bt_login);
        re_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        ed_name=findViewById(R.id.re_ed_name);
        ed_pass=findViewById(R.id.re_ed_pass);
        LoginUtil.register(ed_name.getText().toString(),ed_pass.getText().toString());
        Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
