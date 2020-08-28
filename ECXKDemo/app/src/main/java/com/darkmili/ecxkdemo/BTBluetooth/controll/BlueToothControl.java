package com.darkmili.ecxkdemo.BTBluetooth.controll;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dark
 */
public class BlueToothControl {
    private BluetoothAdapter mAdapter;

    public BlueToothControl(){
        mAdapter = BluetoothAdapter.getDefaultAdapter();
    }

    public BluetoothAdapter getAdapter() {
        return mAdapter;
    }

    /**
     * 打开蓝牙
     */
    public void turnOnBlueTooth(Activity activity, int requestCode) {
        Intent intent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
        activity.startActivityForResult(intent, requestCode);
    }

    /**
     * 打开蓝牙可见性
     */
    public void enableVisibily(Context context){
        Intent intent = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
        intent.putExtra(BluetoothAdapter.EXTRA_DISCOVERABLE_DURATION,300);
        context.startActivity(intent);
    }

    /**
     * 查找设备
     */
    public void findDevice() {
        assert (mAdapter != null);
        mAdapter.startDiscovery();
    }

    /**
     * 获取已绑定设备
     */
    public List<BluetoothDevice> getBondedDeviceList(){
        return new ArrayList<>(mAdapter.getBondedDevices());
    }

    /**
     * 关闭蓝牙
     */
    public void turnOffBlueTooth(){
        mAdapter.disable();
    }

    /**
     * 是否打开
     * @return
     */
    public boolean isEnable(){
       return mAdapter.isEnabled();
    }



    /**
     *  通过反射来调用BluetoothDevice.removeBond取消设备的配对
     * @param device
     */
    public boolean unpairDevice(BluetoothDevice device) {
        try {
            Method m = device.getClass().getMethod("removeBond", (Class[]) null);
//            m.setAccessible(true);
            m.invoke(device, (Object[]) null);
            return true;
        } catch (Exception e) {
            Log.e("ble",e.toString());
        }
        return false;
    }
}
