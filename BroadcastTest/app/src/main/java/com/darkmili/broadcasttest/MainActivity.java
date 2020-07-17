package com.darkmili.broadcasttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private MyReceiver myReceiver;
    final int MY_BROADCAST = 1;
    private LocalBroadcastManager localBroadcastManager ;


    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       localBroadcastManager = LocalBroadcastManager.getInstance(this);
       myReceiver=new MyReceiver();
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.darkmili.broadcasttest.MY_BROADCAST");
//                sendBroadcast(intent);
                localBroadcastManager.sendBroadcast(intent);
            }
        });
        IntentFilter intentFilter=new IntentFilter("com.darkmili.broadcasttest.MY_BROADCAST");
        localBroadcastManager.registerReceiver(myReceiver,intentFilter);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        unregisterReceiver(myReceiver);
    }


}
