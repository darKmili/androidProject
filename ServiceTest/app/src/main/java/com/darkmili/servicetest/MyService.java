package com.darkmili.servicetest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class MyService extends Service {
    private static final String TAG="MyService";

    //必须实现的方法
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.v(TAG,"OnBind");

        return null;
    }

    public MyService() {

        super();
        Log.v(TAG,"MyService");

    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.v(TAG,"OnCreate");

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
