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
        //将活动保存到活动收集器里面
        ActivityCollecter.getInstance().addActivity(this);
    }

    /**
     * 为啥在运行时才注册广播？因为我们必须保证活动在栈顶才可以接受这条广播，而如果处于非栈顶状态不应该也没有必要接受广播。当活动失去栈顶时，就取消接受。
     */
    @Override
    protected void onResume() {
        super.onResume();
        myReceiver = new MyReceiver();
        localBroadcastManager= LocalBroadcastManager.getInstance( this);
        IntentFilter intentFilter = new IntentFilter("com.darkmili.broadcastpractice.MY_BROADCAST");
        localBroadcastManager.registerReceiver(myReceiver, intentFilter);
    }

    /**
     * 为啥在暂停时取消广播？
     */
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
        ActivityCollecter.getInstance().removeActivity(this);

    }

    public class MyReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(final Context context, final Intent intent) {
            AlertDialog.Builder builder=new AlertDialog.Builder(BaseActivity.this).setMessage("账号异常，强制下线")
                    .setCancelable(false)
                    .setTitle("警告")
                    .setPositiveButton("退出", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            ActivityCollecter.getInstance().finishAll();
                            LoginActivity.startLoginActivity(BaseActivity.this);
                        }
                    });
            builder.show();
        }
    }

}
