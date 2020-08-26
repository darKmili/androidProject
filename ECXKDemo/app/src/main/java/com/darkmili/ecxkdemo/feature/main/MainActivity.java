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
import android.widget.Toast;

import com.darkmili.ecxkdemo.feature.BaseActivity;
import com.darkmili.ecxkdemo.feature.main2.MainActivity2;
import com.darkmili.ecxkdemo.R;
import com.darkmili.ecxkdemo.adapter.BluetoothListAdapter;
import com.darkmili.ecxkdemo.controll.BlueToothControl;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends BaseActivity {

    private static final int REQUESTCODE = 1;
    private Toolbar toolbar;
    private ActionBar actionBar;
    private BlueToothControl control;
    //搜索到的蓝牙列表控件，列表数据，列表适配器
    private NestedListView listViewFound;
    private List<BluetoothDevice> bluetoothDevicesFound;
    private BluetoothListAdapter listAdapterFound;

    private FloatingActionButton floatingActionButton;
    private ProgressBar findProgressBar;
    //已经配对的蓝牙列表控件，列表数据，列表适配器
    private NestedListView listViewPaired;
    private BluetoothListAdapter listAdapterPaired;
    private List<BluetoothDevice> bluetoothDevicesPaired;

    //注册广播监听搜索结果
    private BroadcastReceiver receiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
//            int status = intent.getIntExtra(BluetoothDevice.EXTRA_BOND_STATE, 0);
            if (BluetoothAdapter.ACTION_DISCOVERY_STARTED.equals(action)) {
//                setProgressBarIndeterminateVisibility(true);
                findProgressBar.setVisibility(View.VISIBLE);
//                初始化数据列表
                listAdapterFound.clear();
            } else if (BluetoothAdapter.ACTION_DISCOVERY_FINISHED.equals(action)) {
//                setProgressBarIndeterminateVisibility(false);
                findProgressBar.setVisibility(View.GONE);
            } else if (BluetoothDevice.ACTION_FOUND.equals(action)) {
                BluetoothDevice device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
                //找到一个添加一个
                listAdapterFound.add(device);

            }
            //扫描模式改变
            if (BluetoothAdapter.ACTION_SCAN_MODE_CHANGED.equals(action)) {  //此处作用待细查
//                int scanMode = intent.getIntExtra(BluetoothAdapter.EXTRA_SCAN_MODE, 0);
//                if (scanMode == BluetoothAdapter.SCAN_MODE_CONNECTABLE_DISCOVERABLE) {
////                    当在可见性时间，则开启进度条
////                    setProgressBarIndeterminateVisibility(true);
////                    progressBar.setVisibility(View.VISIBLE);
//                } else {
//                    //当可见性时间到了，则关闭进度条
//                    //setProgressBarIndeterminateVisibility(false);
////                    progressBar.setVisibility(View.INVISIBLE);
//                }


//                绑定状态改变
            } else if (BluetoothDevice.ACTION_BOND_STATE_CHANGED.equals(action)) {
                BluetoothDevice remoteDevice = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
                int status = remoteDevice.getBondState();
                if (status == BluetoothDevice.BOND_BONDED) {
                    //关闭进度条
                    findProgressBar.setVisibility(View.GONE);
                    listAdapterPaired.add(remoteDevice);
                    Toast.makeText(context, "绑定成功", LENGTH_LONG).show();
                } else if (status == BluetoothDevice.BOND_BONDING) {
                    findProgressBar.setVisibility(View.VISIBLE);
                    Toast.makeText(context, "正在绑定", LENGTH_LONG).show();
                } else if (status == BluetoothDevice.BOND_NONE) {

                }
            }
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initClick();
        //注册广播
        registerBluetoothReceiver();
    }

    /**
     * 　　* @description: 初始化监听器
     * 　　* @param ${tags}
     * 　　* @return ${return_type}
     * 　　* @throws
     * 　　* @author dark
     * 　　* @date 2020/8/26 16:41
     */
    private void initClick() {
        listViewFound.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                final BluetoothDevice device = listAdapterFound.getItem(i);
                if (device.getBondState() != BluetoothDevice.BOND_BONDED) {
                    device.createBond();
                }

                Toast.makeText(MainActivity.this, "正在请求配对,请耐心等待.......", LENGTH_LONG).show();

            }
        });
        listViewPaired.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, final int i, long l) {
                Snackbar.make(view, "解除配对", Snackbar.LENGTH_LONG).setAction("解除", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //必须通过适配器去获取对象，不能通过list对象去获取，不然或造成数组下标越界
                        BluetoothDevice device = listAdapterPaired.getItem(i);
                        //解除绑定
                        if (control.unpairDevice(device)) {
                            listAdapterPaired.remove(device);
                        }
                    }
                }).show();

                return true;
            }
        });

        listViewPaired.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "长按可以解除配对", Toast.LENGTH_SHORT).show();
                //数组下标越界异常
                BluetoothDevice device = null;
                try {
                    device = listAdapterPaired.getItem(i);
                } catch (IndexOutOfBoundsException e) {
                    Toast.makeText(MainActivity.this, "发生异常，请从新扫描", LENGTH_LONG).show();
                    return;
                }

                if (device.getBondState() == BluetoothDevice.BOND_BONDED) {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("address", device.getAddress());
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "选择对象为：" + device.getName(), Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity.this, "未配对" + device.getName(), Toast.LENGTH_SHORT).show();

                }

            }
        });
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

        listViewFound = (NestedListView) findViewById(R.id.listview_bluetooth_keyong);
        bluetoothDevicesFound = new ArrayList<>();
        listAdapterFound = new BluetoothListAdapter(this, R.layout.item_bluetooth, bluetoothDevicesFound);
        listViewFound.setAdapter(listAdapterFound);


        listViewPaired = (NestedListView) findViewById(R.id.listview_bluetooth_peidui);
        bluetoothDevicesPaired = control.getBondedDeviceList();
        listAdapterPaired = new BluetoothListAdapter(this, R.layout.item_bluetooth, bluetoothDevicesPaired);
        listViewPaired.setAdapter(listAdapterPaired);

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
            case R.id.help:
                Toast.makeText(this, "此为软件功能说明页", LENGTH_LONG).show();
//                startActivity(new Intent(MainActivity.this, DialogActivity.class));
                break;
            case R.id.web:
                Toast.makeText(this, "此为官方首页", LENGTH_LONG).show();

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
                //当打开蓝牙后，默认自动展示已配对蓝牙列表
                if (bluetoothDevicesPaired == null || bluetoothDevicesPaired.size() == 0) {
                    bluetoothDevicesPaired = control.getBondedDeviceList();
                    listAdapterPaired.addAll(bluetoothDevicesPaired);
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

        bluetoothDevicesPaired = control.getBondedDeviceList();
        listAdapterPaired.addAll(bluetoothDevicesPaired);

        listAdapterFound.refresh(bluetoothDevicesFound);
        control.findDevice();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(receiver);
    }
}