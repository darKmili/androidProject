package com.darkmili.bluetoothdemo;

import android.app.Application;
import android.content.Context;
import android.provider.Settings;
import android.provider.Settings.Secure;

import com.inuker.bluetooth.library.BluetoothClient;

import java.util.UUID;

public class MyApplication extends Application {
    private static Context context;
    private static BluetoothClient bluetoothClient;
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        bluetoothClient=new BluetoothClient(context);

    }

    public static Context getContext(){
        return context;
    }
    public static BluetoothClient getClient(){
        return bluetoothClient;
    }
}
