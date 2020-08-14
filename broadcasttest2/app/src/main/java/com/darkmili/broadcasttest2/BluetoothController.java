package com.darkmili.broadcasttest2;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * create by li
 */
public class BluetoothController {
    private BluetoothAdapter adapter;

    public BluetoothController() {
        adapter = BluetoothAdapter.getDefaultAdapter();
    }

    /**
     *是否支持蓝牙设备
     * @return
     */
    public boolean isSupportBluetooth() {
        if (adapter == null) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * 是否打开蓝牙
     * @return
     */
    public boolean isOpenBluetooth(){
        assert (adapter!=null);
        return adapter.isEnabled();
    }

    /**
     * 打开蓝牙
     * @param activity
     */
    public void openBluetooth(Activity activity,int requestCode){
        Intent intent=new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
        activity.startActivityForResult(intent,requestCode);
    }

    /**
     * 关闭蓝牙
     */
    public void closeBluetooth(){
        adapter.disable();
    }

    /**
     * 设备可见性
     * @param context
     */
    public void enableVisibly(Context context){
        Intent intent=new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
        intent.putExtra(BluetoothAdapter.EXTRA_DISCOVERABLE_DURATION,300);
        context.startActivity(intent);
    }

    /**
     * 发现设备
     */
    public void findDevice(){
        assert (adapter!=null);
        adapter.startDiscovery();

    }

    /**
     * 获取绑定列表
     * @return
     */
    public List<BluetoothDevice> getBondedDeviceList(){
        Set<BluetoothDevice> bondedDevices = adapter.getBondedDevices();
        return new ArrayList<>(bondedDevices);
    }
}
