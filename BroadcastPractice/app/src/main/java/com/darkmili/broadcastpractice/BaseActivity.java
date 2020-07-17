package com.darkmili.broadcastpractice;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

public class BaseActivity extends AppCompatActivity {
    MyReceiver myReceiver;
    LocalBroadcastManager localBroadcastManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollecter.addActivity(this);


    }


    @Override
    protected void onResume() {
        super.onResume();
        myReceiver = new MyReceiver();
        localBroadcastManager= LocalBroadcastManager.getInstance( this);
        IntentFilter intentFilter = new IntentFilter("com.darkmili.broadcastpractice.MY_BROADCAST");
        localBroadcastManager.registerReceiver(myReceiver, intentFilter);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (myReceiver != null) {
            localBroadcastManager.unregisterReceiver(myReceiver);
            myReceiver = null;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollecter.removeActivity(this);

    }

    public


     class MyReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(final Context context, final Intent intent) {
            AlertDialog.Builder builder=new AlertDialog.Builder(BaseActivity.this);
            builder.setMessage("强制下线");
            builder.setTitle("warning");
            builder.setCancelable(false);
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    ActivityCollecter.finishAll();
                    LoginActivity.startLoginActivity(BaseActivity.this);
                }
            });
            builder.show();
        }
    }

}
