package com.darkmili.servicetest;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

public class MyService extends Service {
    private static final String TAG="MyService";
    private Mybind mybind;
    class Mybind extends Binder{
        public void show(){
            Log.d("MyService","BindService");
        }
    }

    //必须实现的方法
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.v(TAG,"OnBind");

        return mybind;
    }

    public MyService() {

        super();
        Log.v(TAG,"MyService");

    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.v(TAG,"OnCreate");


        Intent intent=new Intent(this,MainActivity.class);
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 0);
        Notification notification=new NotificationCompat.Builder(this,"My_Service").setAutoCancel(true).setContentTitle("title of notify")
                .setContentText("你好呀").setSmallIcon(R.drawable.ic_launcher_background).setContentIntent(activity).build();

        startForeground(1,notification);

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.v(TAG,"OnStart");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.v(TAG,"OnDestroy");
        super.onDestroy();
    }
}
