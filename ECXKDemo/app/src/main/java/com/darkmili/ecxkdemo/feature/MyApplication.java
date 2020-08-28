package com.darkmili.ecxkdemo.feature;

import android.app.Application;
import android.bluetooth.BluetoothGattCharacteristic;
import android.content.Context;
import android.util.Log;


import com.clj.fastble.data.BleDevice;
import com.polidea.rxandroidble2.LogConstants;
import com.polidea.rxandroidble2.LogOptions;
import com.polidea.rxandroidble2.RxBleClient;

import org.litepal.LitePal;

/**
 * @author Administrator
 * @title: MyApplication
 * @projectName ECXKDemo
 * @description: 全局应用程序类
 * @date 2020/8/2511:23
 */
public class MyApplication extends Application {

    private Context context;
    private static MyApplication application;
    private RxBleClient rxBleClient;
    private BleDevice mBleDevice;
    private BluetoothGattCharacteristic characteristic;
    public static Boolean isBleClosed = false;

    public MyApplication() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this);
        context=getApplicationContext();
//        LitePal.
        //当打开应用时，对静态的应用实例赋值
        application=this;

        rxBleClient = RxBleClient.create(this);
        RxBleClient.updateLogOptions(new LogOptions.Builder()
                .setLogLevel(LogConstants.VERBOSE)//定义日志等级
                .setMacAddressLogSetting(LogConstants.MAC_ADDRESS_FULL)
                .setUuidsLogSetting(LogConstants.UUIDS_FULL)
                .setShouldLogAttributeValues(true)
                .build()
        );
        Log.e("MyApplication", "init MyApplication!");

    }

    public Context getContext() {
        return context;
    }

    public static MyApplication getInstance(){
        return application;
    }
    /**
     * In practise you will use some kind of dependency injection pattern.
     */
    public static RxBleClient getRxBleClient(Context context) {
        MyApplication application = (MyApplication) context.getApplicationContext();
        return application.rxBleClient;
    }

    //当前连接的BLE设备
    public void setBleDevice(BleDevice mBleDevice) {
        this.mBleDevice = mBleDevice;
    }

    public BleDevice getBleDevice() {
        return mBleDevice;
    }

    //当前连接的BluetoothGattCharacteristic
    public void setCharacteristic(BluetoothGattCharacteristic mcharacteristic) {
        this.characteristic = mcharacteristic;
    }

    public BluetoothGattCharacteristic getCharacteristic() {
        return characteristic;
    }
}
