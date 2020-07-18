package com.darkmili.sqlitetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText username=null;
    EditText password=null;
    Button buttonLoad=null;
    String user=null;
    String pass=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //从数据库中查询数据
        user="www";
        pass="123456";


        buttonLoad=findViewById(R.id.button_load);
        username=findViewById(R.id.edit_1);
        password=findViewById(R.id.edit_2);
        buttonLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (user.equals(username.getText().toString())&&pass.equals(password.getText().toString())){
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    intent.putExtra("username",user);
                    startActivity(intent);
                }else {
                    username.setText("");
                    password.setText("");
                }
            }
        });


    }
//    class Lite extends LitePalApplication{
//
//    }
}
