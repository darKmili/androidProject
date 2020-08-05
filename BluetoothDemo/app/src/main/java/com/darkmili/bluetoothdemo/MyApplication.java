package com.darkmili.bluetoothdemo;

import android.app.Application;
import android.content.Context;
import android.provider.Settings;
import android.provider.Settings.Secure;

import java.util.UUID;

public class MyApplication extends Application {
    private static Context context;
    private static UUID android_id;
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        android_id= UUID.fromString("fa87c0d0-afac-11de-8a39-0800200c9a66");
    }

    public static Context getContext(){
        return context;
    }
    public static  UUID getAndroid_id(){
        return android_id;
    }
}
