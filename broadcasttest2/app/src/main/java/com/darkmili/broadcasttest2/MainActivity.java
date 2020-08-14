package com.darkmili.broadcasttest2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
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
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import pub.devrel.easypermissions.EasyPermissions;
import pub.devrel.easypermissions.PermissionRequest;

import static android.bluetooth.BluetoothAdapter.ACTION_CONNECTION_STATE_CHANGED;
import static android.bluetooth.BluetoothAdapter.ACTION_DISCOVERY_FINISHED;
import static android.bluetooth.BluetoothAdapter.ACTION_DISCOVERY_STARTED;
import static android.bluetooth.BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE;
import static android.bluetooth.BluetoothAdapter.ACTION_SCAN_MODE_CHANGED;
import static android.bluetooth.BluetoothDevice.ACTION_BOND_STATE_CHANGED;
import static android.bluetooth.BluetoothDevice.ACTION_FOUND;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static final int REQUEST_CODE = 1;
    public static final int REQUEST_CODE1 = 3;
    private BluetoothController controller;
    private Toast toast;
    private ImageButton btSearch;
    private Toolbar toolbar;
    private ProgressBar progressBar;
    private RecyclerView re_linked;
    private RecyclerView re_unlink;
    private BlueToothRecyclerViewAdapter adapter_linked;
    private BlueToothRecyclerViewAdapter adapter_unlink;
    private List<BluetoothDevice> list_linked;
    private List<BluetoothDevice> list_unlink;
    //广播接受者
    private BroadcastReceiver receiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            switch (action) {
                case BluetoothDevice.ACTION_FOUND:
                    BluetoothDevice device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
                    if (!list_unlink.contains(device)){
                        list_unlink.add(device);
                    }

                    adapter_unlink.notifyDataSetChanged();
                    break;
                case ACTION_DISCOVERY_STARTED:
                    list_unlink.clear();
                    adapter_unlink.notifyDataSetChanged();
                    break;
                case ACTION_DISCOVERY_FINISHED:
                    progressBar.setVisibility(View.GONE);
                    break;
                case ACTION_SCAN_MODE_CHANGED:
                    int scanMode=intent.getIntExtra(BluetoothAdapter.EXTRA_SCAN_MODE,0);
                    if (scanMode==BluetoothAdapter.SCAN_MODE_CONNECTABLE_DISCOVERABLE){
                        progressBar.setVisibility(View.VISIBLE);
                    }else {
                        progressBar.setVisibility(View.GONE);
                    }
                    break;
                case ACTION_BOND_STATE_CHANGED:
                    break;


            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        initRecyclerview();
        IntentFilter intentFilter = new IntentFilter(BluetoothAdapter.ACTION_STATE_CHANGED);
        //开始扫描，完成扫描
        intentFilter.addAction(ACTION_DISCOVERY_STARTED);
        intentFilter.addAction(ACTION_DISCOVERY_FINISHED);
        //查找设备
        intentFilter.addAction(ACTION_FOUND);
        //设备扫描模式改变
        intentFilter.addAction(ACTION_SCAN_MODE_CHANGED);
        //绑定状态
        intentFilter.addAction(ACTION_BOND_STATE_CHANGED);
        //注册广播
        registerReceiver(receiver, intentFilter);
        permissions();
    }

    public void permissions() {
        String[] perms = new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.BLUETOOTH_ADMIN};
        EasyPermissions.requestPermissions(
                new PermissionRequest.Builder(this, REQUEST_CODE1, perms)
                        .build());
    }

    public void isSupportBluetooth() {
        boolean supportBluetooth = controller.isSupportBluetooth();
        showToast("是否支持蓝牙？" + supportBluetooth);
    }

    public void enableVisibly() {
        controller.enableVisibly(this);
    }

    public void openBluetooth() {
        controller.openBluetooth(this, REQUEST_CODE);
        showToast("打开蓝牙");
    }

    public void closeBluetooth() {
        controller.closeBluetooth();
        showToast("关闭蓝牙");
    }

    /**
     * 产生提示信息
     *
     * @param text
     */
    public void showToast(String text) {
        if (toast == null) {
            toast = Toast.makeText(this, text, Toast.LENGTH_SHORT);
        } else {
            toast.setText(text);
        }
        toast.show();
    }

    public void init() {
        controller = new BluetoothController();
        toolbar = findViewById(R.id.toolbar);
        this.setSupportActionBar(toolbar);
        btSearch = findViewById(R.id.bt_is_search);
        btSearch.setOnClickListener(this);
        progressBar = findViewById(R.id.progressBar);
    }

    public void initRecyclerview() {
        re_linked = findViewById(R.id.re_linked);
        re_unlink = findViewById(R.id.re_unlink);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        LinearLayoutManager manager1 = new LinearLayoutManager(this);
        list_linked=controller.getBondedDeviceList();
        adapter_linked = new BlueToothRecyclerViewAdapter((ArrayList<BluetoothDevice>) list_linked,this);
        list_unlink = new ArrayList<>();
        adapter_unlink = new BlueToothRecyclerViewAdapter((ArrayList<BluetoothDevice>) list_unlink,this);
        re_linked.setAdapter(adapter_linked);
        re_linked.setLayoutManager(manager);
        re_unlink.setAdapter(adapter_unlink);
        re_unlink.setLayoutManager(manager1);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_is_search:
                controller.findDevice();

                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                showToast("打开成功");
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.head_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.open_item:
                openBluetooth();
                break;
            case R.id.close_item:
                closeBluetooth();
                break;
            case R.id.can_see:
                enableVisibly();
                break;
            case R.id.see_linked:
                list_linked=controller.getBondedDeviceList();
                adapter_linked.notifyDataSetChanged();
                break;

        }
        return true;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(receiver);
    }
}
