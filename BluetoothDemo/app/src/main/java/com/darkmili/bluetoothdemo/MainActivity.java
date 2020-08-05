package com.darkmili.bluetoothdemo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.darkmili.bluetoothdemo.adapter.BlueToothRecyclerViewAdapter;
import com.darkmili.bluetoothdemo.service.AcceptThread;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static android.content.ContentValues.TAG;

public class MainActivity extends AppCompatActivity {
    private List<String> listPermissions;
    private BluetoothAdapter bluetoothAdapter;
    private Button bt_start_bluetooth, bt_be_searched;
    private ArrayList<BluetoothDevice> list_linked;
    private ArrayList<BluetoothDevice> list_unlink = new ArrayList<>();
    private RecyclerView recyclerView_linked;
    private RecyclerView recyclerView_unlink;
    private BlueToothRecyclerViewAdapter adapter;
    private LinearLayoutManager manager;
    private TextView textView;
    private Handler handler=new Handler(getMainLooper()){
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            textView=findViewById(R.id.textView2);
            textView.setText(msg.toString());
        }
    };
    private int flag=0;
    public static final int REQUEST_CODE = 1;
    public static final int REQUEST_ENABLE_BT = 2;
    // Create a BroadcastReceiver for ACTION_FOUND.
    private final BroadcastReceiver receiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (BluetoothDevice.ACTION_FOUND.equals(action)) {
                // Discovery has found a device. Get the BluetoothDevice
                // object and its info from the Intent.
                BluetoothDevice device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
                String deviceName = device.getName();
                String deviceHardwareAddress = device.getAddress(); // MAC address
                int a = 0;
                for (BluetoothDevice b : list_unlink) {
                    if (b.getAddress().equals(deviceHardwareAddress)) {
                        a = 1;
                        break;
                    }
                }
                if (a == 0)
                    list_unlink.add(device);
                adapter.notifyDataSetChanged();
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        // Register for broadcasts when a device is discovered.
        final IntentFilter filter = new IntentFilter(BluetoothDevice.ACTION_FOUND);
        registerReceiver(receiver, filter);

        bt_start_bluetooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkPermissions();
                StartBluetooth();
                setBluetoothAdapterLinked();
                setBluetoothAdapterUnlink();
                bluetoothAdapter.startDiscovery();
            }
        });
        bt_be_searched.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (flag == 0) {
                    Intent discoverableIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
                    discoverableIntent.putExtra(BluetoothAdapter.EXTRA_DISCOVERABLE_DURATION, 300);
                    startActivity(discoverableIntent);
                     new AcceptThread().start();
                    flag=1;
                }else {
                    Toast.makeText(MyApplication.getContext(),"已经可以被搜索",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }



    public void init() {
        listPermissions = new ArrayList<>();
        bt_be_searched = findViewById(R.id.bt_be_searched);
        bt_start_bluetooth = findViewById(R.id.start_bluetooth);
    }

    public void checkPermissions() {
        if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.BLUETOOTH) != PackageManager.PERMISSION_GRANTED) {
            listPermissions.add(Manifest.permission.BLUETOOTH);
        }
        if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            listPermissions.add(Manifest.permission.ACCESS_COARSE_LOCATION);
        }
        if (!listPermissions.isEmpty()) {
            //权限不足，需要申请权限
            String[] permissions = listPermissions.toArray(new String[listPermissions.size()]);
            ActivityCompat.requestPermissions(this, permissions, REQUEST_CODE);
        } else {
            //TODO 权限足够，执行操作
            bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
            if (bluetoothAdapter == null) {
                // Device doesn't support Bluetooth
                Toast.makeText(this, "Device doesn't support Bluetooth", Toast.LENGTH_LONG).show();
            }
        }
    }

    //第一步权限问题
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        switch (requestCode) {
            case REQUEST_CODE:
                if (grantResults.length > 0) {
                    for (int result : grantResults) {
                        if (result != PackageManager.PERMISSION_GRANTED) {
                            Toast.makeText(this, "必须获取所有权限才可以", Toast.LENGTH_LONG).show();
                            finish();
                        }
                    }
                    //此刻权限足够权限
                    //TODO
                } else {
                    Toast.makeText(this, "程序发生错误", Toast.LENGTH_LONG).show();
                }
                break;
        }
    }

    public void StartBluetooth() {
        if (!bluetoothAdapter.isEnabled()) {
            Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (REQUEST_ENABLE_BT == requestCode) {
            if (resultCode == RESULT_OK) {
                Toast.makeText(this, "蓝牙打开成功", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "蓝牙未打开", Toast.LENGTH_LONG).show();
            }
        }
    }

    //第二步查看是否支持蓝牙，蓝牙是否打开，启用蓝牙
    //查找设备，先查找已配对设备，然后发现设备
    //设备发现是一个扫描过程，它会搜索局部区域内已启用蓝牙功能的设备，并请求与每台设备相关的某些信息。此过程有时也被称为发现、查询或扫描。
    //连接设备
    //如要在两台设备之间创建连接，您必须同时实现服务器端和客户端机制，因为其中一台设备必须开放服务器套接字，而另一台设备必须使用服务器设备的 MAC 地址发起连接
    //一种实现技术是自动将每台设备准备为一个服务器，从而使每台设备开放一个服务器套接字并侦听连接。在此情况下，任一设备都可发起与另一台设备的连接，并成为客户端。
    public Set<BluetoothDevice> search() {
        Set<BluetoothDevice> pairedDevices = bluetoothAdapter.getBondedDevices();

        return pairedDevices;
    }

    public void setBluetoothAdapterLinked() {
        list_linked = new ArrayList<>(search());
        recyclerView_linked = findViewById(R.id.re_linked);
        manager = new LinearLayoutManager(this);
        adapter = new BlueToothRecyclerViewAdapter(list_linked);
        recyclerView_linked.setLayoutManager(manager);
        recyclerView_linked.setAdapter(adapter);
    }

    public void setBluetoothAdapterUnlink() {
        recyclerView_unlink = findViewById(R.id.re_unlink);
        manager = new LinearLayoutManager(this);
        adapter = new BlueToothRecyclerViewAdapter(list_unlink);
        recyclerView_unlink.setAdapter(adapter);
        recyclerView_unlink.setLayoutManager(manager);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Don't forget to unregister the ACTION_FOUND receiver.
        unregisterReceiver(receiver);
    }

}