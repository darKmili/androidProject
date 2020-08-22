package com.darkmili.ecxkdemo.feature.main;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ProgressBar;

import com.darkmili.ecxkdemo.feature.BaseActivity;
import com.darkmili.ecxkdemo.feature.dialog.DialogActivity;
import com.darkmili.ecxkdemo.feature.main2.MainActivity2;
import com.darkmili.ecxkdemo.R;
import com.darkmili.ecxkdemo.adapter.BluetoothListAdapter;
import com.darkmili.ecxkdemo.controll.BlueToothControl;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    private static final int REQUESTCODE = 1;
    private Toolbar toolbar;
    private ActionBar actionBar;
    private BlueToothControl control;
    private NestedListView listView;
    private List<BluetoothDevice> bluetoothDevices;
    private BluetoothListAdapter listAdapter;
    private FloatingActionButton floatingActionButton;
    private ProgressBar findProgressBar;

    private NestedListView listView_peidui;
    private BluetoothListAdapter listAdapter_peidui;
    private List<BluetoothDevice> bluetoothDevices_peidui;
    //注册广播监听搜索结果
    private BroadcastReceiver receiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (BluetoothAdapter.ACTION_DISCOVERY_STARTED.equals(action)) {
                //setProgressBarIndeterminateVisibility(true);
                findProgressBar.setVisibility(View.VISIBLE);
                //初始化数据列表
                bluetoothDevices.clear();
                listAdapter.notifyDataSetChanged();
            } else if (BluetoothAdapter.ACTION_DISCOVERY_FINISHED.equals(action)) {
                //setProgressBarIndeterminateVisibility(false);
                findProgressBar.setVisibility(View.GONE);
            } else if (BluetoothDevice.ACTION_FOUND.equals(action)) {
                BluetoothDevice device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
                //找到一个添加一个
                if (!bluetoothDevices.contains(device))
                    bluetoothDevices.add(device);
                listAdapter.notifyDataSetChanged();

            }
//            //扫描模式改变
//            if (BluetoothAdapter.ACTION_SCAN_MODE_CHANGED.equals(action)) {  //此处作用待细查
//                int scanMode = intent.getIntExtra(BluetoothAdapter.EXTRA_SCAN_MODE, 0);
//                if (scanMode == BluetoothAdapter.SCAN_MODE_CONNECTABLE_DISCOVERABLE) {
//                    //当在可见性时间，则开启进度条
//                    //setProgressBarIndeterminateVisibility(true);
//                    progressBar.setVisibility(View.VISIBLE);
//                } else {
//                    //当可见性时间到了，则关闭进度条
//                    //setProgressBarIndeterminateVisibility(false);
//                    progressBar.setVisibility(View.INVISIBLE);
//                }
//                //绑定状态改变
//            } else if (BluetoothDevice.ACTION_BOND_STATE_CHANGED.equals(action)) {
//                BluetoothDevice remoteDevice = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
//                if (remoteDevice == null) {
//                    showToast("无设备");
//                    return;
//                }
//                int status = intent.getIntExtra(BluetoothDevice.EXTRA_BOND_STATE, 0);
//                if (status == BluetoothDevice.BOND_BONDED) {
//                    showToast("已绑定" + remoteDevice.getName());
//                } else if (status == BluetoothDevice.BOND_BONDING) {
//                    showToast("正在绑定" + remoteDevice.getName());
//                } else if (status == BluetoothDevice.BOND_NONE) {
//                    showToast("未绑定" + remoteDevice.getName());
//                }
//            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                BluetoothDevice device = bluetoothDevices.get(i);
                if (device.getBondState() != BluetoothDevice.BOND_BONDED) {
                    device.createBond();
                }
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("position", device.getAddress());
                startActivity(intent);
            }
        });

        listView_peidui.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                BluetoothDevice device = bluetoothDevices_peidui.get(i);
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("position", device.getAddress());
                startActivity(intent);
            }
        });
        //注册广播
        registerBluetoothReceiver();
    }

    public void initUI() {
        toolbar = findViewById(R.id.toolbar);
        floatingActionButton = findViewById(R.id.floatingActionButton);
        findProgressBar = findViewById(R.id.progress_circular);
        setSupportActionBar(toolbar);
        actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_bluetooth_24);
        }
        control = new BlueToothControl();

        listView = (NestedListView) findViewById(R.id.listview_bluetooth_keyong);
        bluetoothDevices = new ArrayList<>();
        listAdapter = new BluetoothListAdapter(this, R.layout.item_bluetooth, bluetoothDevices);
        listView.setAdapter(listAdapter);


        listView_peidui = (NestedListView) findViewById(R.id.listview_bluetooth_peidui);
        bluetoothDevices_peidui = control.getBondedDeviceList();
        listAdapter_peidui = new BluetoothListAdapter(this, R.layout.item_bluetooth, bluetoothDevices_peidui);
        listView_peidui.setAdapter(listAdapter_peidui);

    }

    //设置广播
    private void registerBluetoothReceiver() {
        IntentFilter filter = new IntentFilter();
        //开始查找
        filter.addAction(BluetoothAdapter.ACTION_DISCOVERY_STARTED);
        //结束查找
        filter.addAction(BluetoothAdapter.ACTION_DISCOVERY_FINISHED);
//        //查找设备
        filter.addAction(BluetoothDevice.ACTION_FOUND);
        //设备扫描模式改变，监听蓝牙可见性
        filter.addAction(BluetoothAdapter.ACTION_SCAN_MODE_CHANGED);
        //绑定状态
        filter.addAction(BluetoothDevice.ACTION_BOND_STATE_CHANGED);

        registerReceiver(receiver, filter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_top, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                if (!control.isEnable()) {
                    control.turnOnBlueTooth(this, REQUESTCODE);

                } else {
                    control.turnOffBlueTooth();
                    actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_bluetooth_24);
                }
                break;
            case R.id.excel:
                startActivity(new Intent(MainActivity.this, DialogActivity.class));


        }
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case REQUESTCODE:
                if (resultCode == RESULT_OK) {
                    actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_bluetooth_disabled_24);
                }
                if (bluetoothDevices_peidui == null || bluetoothDevices_peidui.size() == 0) {
                    bluetoothDevices_peidui = control.getBondedDeviceList();
                    listAdapter_peidui.addAll(bluetoothDevices_peidui);
                }

        }
    }

    /**
     * 浮动按钮点击事件 搜索蓝牙按钮
     */
    public void search(View view) {
        if (!control.isEnable()) {
            control.turnOnBlueTooth(this, 1);
        }

        if (bluetoothDevices_peidui == null || bluetoothDevices_peidui.size() == 0) {
            bluetoothDevices_peidui = control.getBondedDeviceList();
            listAdapter_peidui.addAll(bluetoothDevices_peidui);
        }
        listAdapter.refresh(bluetoothDevices);
        control.findDevice();
//        control.findDevice();
    }


}