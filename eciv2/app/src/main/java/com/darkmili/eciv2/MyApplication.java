package com.darkmili.eciv2;

import android.app.Application;
import android.bluetooth.BluetoothGattCharacteristic;
import android.content.Context;
import android.util.Log;

import com.clj.fastble.data.BleDevice;
import com.polidea.rxandroidble2.LogConstants;
import com.polidea.rxandroidble2.LogOptions;
import com.polidea.rxandroidble2.RxBleClient;

/**
 * @author Administrator
 * @title: MyApplication
 * @projectName eciv2
 * @description: TODO
 * @date 2020/8/3114:46
 */
public class MyApplication extends Application {

    private static MyApplication sInstance;
    private BluetoothGattCharacteristic characteristic;
    private BleDevice mBleDevice;
    private RxBleClient rxBleClient;

    public static Boolean isBleClosed = false;

    public MyApplication() {
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

    public static MyApplication getInstance() {
        if (sInstance == null) {
            synchronized (MyApplication.class) {
                if (sInstance == null) {
                    sInstance = new MyApplication();
                }
            }
        }
        return sInstance;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        Utils.init(this);

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

}

