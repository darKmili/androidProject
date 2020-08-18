package com.darkmili.blebluetoothdemo.feature;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.clj.fastble.BleManager;
import com.clj.fastble.callback.BleScanCallback;
import com.clj.fastble.data.BleDevice;
import com.clj.fastble.scan.BleScanRuleConfig;
import com.darkmili.blebluetoothdemo.R;
import com.darkmili.blebluetoothdemo.adapter.BluetoothArrayAdapter;

import java.util.ArrayList;
import java.util.List;

import pub.devrel.easypermissions.EasyPermissions;
import pub.devrel.easypermissions.PermissionRequest;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private BluetoothArrayAdapter adapter;
    private List<BleDevice> bleDeviceArrayList;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        permission();
        button=findViewById(R.id.search_button);
        listView=findViewById(R.id.listView);
        bleDeviceArrayList=new ArrayList<>();
        adapter=new BluetoothArrayAdapter(this,R.layout.item_list,bleDeviceArrayList);
        listView.setAdapter(adapter);

    }

    /**
     * 扫描ble蓝牙
     * @param view
     */
    public void search(View view){
        BleScanRuleConfig scanRuleConfig = new BleScanRuleConfig.Builder()
//                .setServiceUuids(serviceUuids)      // 只扫描指定的服务的设备，可选
//                .setDeviceName(true, names)         // 只扫描指定广播名的设备，可选
//                .setDeviceMac(mac)                  // 只扫描指定mac的设备，可选
//                .setAutoConnect(isAutoConnect)      // 连接时的autoConnect参数，可选，默认false
                .setScanTimeOut(10000)              // 扫描超时时间，可选，默认10秒；小于等于0表示不限制扫描时间
                .build();
        BleManager.getInstance().initScanRule(scanRuleConfig);
        BleManager.getInstance().scan(new BleScanCallback() {
            @Override
            public void onScanFinished(List<BleDevice> scanResultList) {
                bleDeviceArrayList=scanResultList;
                adapter.addAll(bleDeviceArrayList);
            }

            @Override
            public void onScanStarted(boolean success) {

            }

            @Override
            public void onScanning(BleDevice bleDevice) {

            }
        });
    }
    public void permission(){

        String perms= Manifest.permission.ACCESS_COARSE_LOCATION;
        EasyPermissions.requestPermissions(
                new PermissionRequest.Builder(this, 1, perms)
                        .build());
    }
}