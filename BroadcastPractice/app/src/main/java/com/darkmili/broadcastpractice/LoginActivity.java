package com.darkmili.broadcastpractice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends BaseActivity {
    private Button button1;
    private EditText editText1,editText2;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button1=findViewById(R.id.buttton1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1=findViewById(R.id.edit1);
                editText2=findViewById(R.id.edit2);
                if ("lyh".equals(editText1.getText().toString())&&"123456".equals(editText2.getText().toString())){
                    MainActivity.startMainActivity(LoginActivity.this);
                }else {
                    editText1.setText("");
                    editText2.setText("");
                }

            }
        });


    }

    public static void startLoginActivity(Activity activity){
        Intent intent = new Intent(activity,LoginActivity.class);
        activity.startActivity(intent);
    }
}
