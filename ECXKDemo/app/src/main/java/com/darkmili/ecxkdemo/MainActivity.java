package com.darkmili.ecxkdemo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });
    }

    public void initUI() {
        toolbar = findViewById(R.id.toolbar);
        floatingActionButton = findViewById(R.id.floatingActionButton);
        setSupportActionBar(toolbar);
        actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_bluetooth_24);
        }
        control = new BlueToothControl();

        listView = (NestedListView) findViewById(R.id.listview_bluetooth);
        bluetoothDevices = control.getBondedDeviceList();
        listAdapter = new BluetoothListAdapter(this, R.layout.item_bluetooth, bluetoothDevices);
        listView.setAdapter(listAdapter);
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

        }
    }

    /**
     * 浮动按钮点击事件 搜索蓝牙按钮
     */
    public void search(View view) {

        bluetoothDevices = control.getBondedDeviceList();
        listAdapter.addAll(bluetoothDevices);
//        control.findDevice();
    }

    /**
     * 刷新设备列表
     */
    public void refresh(BluetoothDevice device) {

    }


    private BroadcastReceiver receiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action.equals(BluetoothDevice.ACTION_FOUND)) {
                BluetoothDevice device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
                refresh(device);
            }
        }
    };
}