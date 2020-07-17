package com.darkmili.broadcastpractice;


import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public  class MainActivity extends BaseActivity {

    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button2=findViewById(R.id.buttton2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               //发送本地广播
                Intent intent = new Intent("com.darkmili.broadcastpractice.MY_BROADCAST");
                localBroadcastManager.sendBroadcast(intent);
            }
        });
    }

    public static void startMainActivity(Activity activity){
        Intent intent = new Intent(activity,MainActivity.class);
        activity.startActivity(intent);
    }
}
