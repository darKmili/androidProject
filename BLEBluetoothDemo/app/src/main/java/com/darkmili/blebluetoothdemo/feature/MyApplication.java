package com.darkmili.blebluetoothdemo.feature;

import android.Manifest;
import android.app.Application;
import android.content.Context;

import com.clj.fastble.BleManager;
import com.darkmili.blebluetoothdemo.R;

import pub.devrel.easypermissions.EasyPermissions;
import pub.devrel.easypermissions.PermissionRequest;

public class MyApplication extends Application {
    private Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context=getApplicationContext();
        BleManager.getInstance().init(this);
        BleManager.getInstance()
                .enableLog(true)
                .setReConnectCount(1, 5000)
                .setSplitWriteNum(20)
                .setConnectOverTime(10000)
                .setOperateTimeout(5000);
    }


}
