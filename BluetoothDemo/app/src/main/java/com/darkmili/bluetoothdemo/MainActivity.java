package com.darkmili.bluetoothdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;

import android.Manifest;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.darkmili.bluetoothdemo.adapter.BlueToothRecyclerViewAdapter;
import com.inuker.bluetooth.library.BluetoothClient;
import com.inuker.bluetooth.library.beacon.Beacon;
import com.inuker.bluetooth.library.connect.listener.BleConnectStatusListener;
import com.inuker.bluetooth.library.connect.options.BleConnectOptions;
import com.inuker.bluetooth.library.connect.response.BleConnectResponse;
import com.inuker.bluetooth.library.model.BleGattCharacter;
import com.inuker.bluetooth.library.model.BleGattProfile;
import com.inuker.bluetooth.library.model.BleGattService;
import com.inuker.bluetooth.library.search.SearchRequest;
import com.inuker.bluetooth.library.search.SearchResult;
import com.inuker.bluetooth.library.search.response.SearchResponse;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import java.util.ArrayList;
import java.util.List;

import pub.devrel.easypermissions.AfterPermissionGranted;
import pub.devrel.easypermissions.EasyPermissions;
import pub.devrel.easypermissions.PermissionRequest;

import static com.inuker.bluetooth.library.Code.REQUEST_SUCCESS;
import static com.inuker.bluetooth.library.Constants.STATUS_CONNECTED;
import static com.inuker.bluetooth.library.Constants.STATUS_DISCONNECTED;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private BluetoothClient bluetoothClient;
    private Button btStartBluetooth, btCloseBluetooth, btSearchBluetooth,btStopSearch;
    private BlueToothRecyclerViewAdapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<SearchResult> searchResults;

    private final BleConnectStatusListener mBleConnectStatusListener = new BleConnectStatusListener() {
        @Override
        public void onConnectStatusChanged(String macAddress, int status) {

            if (status == STATUS_CONNECTED) {
                //蓝牙设备处于连接状态
            } else if (status == STATUS_DISCONNECTED) {
                //蓝牙设备断开
            }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        recyclerView = findViewById(R.id.re_linked);
        searchResults = new ArrayList<>();
        adapter = new BlueToothRecyclerViewAdapter(searchResults);
        LayoutManager manager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
        btStartBluetooth.setOnClickListener(this);
        btCloseBluetooth.setOnClickListener(this);
        btSearchBluetooth.setOnClickListener(this);
        btStopSearch.setOnClickListener(this);
        String[] perms={Manifest.permission.ACCESS_COARSE_LOCATION};
        EasyPermissions.requestPermissions(
                new PermissionRequest.Builder(this, 1, perms)
                        .build());

//蓝牙的状态监听
        MyApplication.getClient().registerConnectStatusListener(adapter.searchResult.getAddress(), mBleConnectStatusListener);
    }

    public void init() {
        btStopSearch=findViewById(R.id.bt_search_stop);
        bluetoothClient = MyApplication.getClient();
        btStartBluetooth = findViewById(R.id.start_bluetooth);
        btCloseBluetooth = findViewById(R.id.close_bluetooth);
        btSearchBluetooth = findViewById(R.id.bt_search);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.start_bluetooth:
                //打开蓝牙
                if (!bluetoothClient.isBluetoothOpened()) {
                    bluetoothClient.openBluetooth();
                } else {
                    Toast.makeText(this, "蓝牙已经打开", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.close_bluetooth:
                if (bluetoothClient.isBluetoothOpened()) {
                    bluetoothClient.closeBluetooth();
                } else {
                    Toast.makeText(this, "蓝牙未打开打开", Toast.LENGTH_SHORT).show();

                }
                break;
            case R.id.bt_search:
                searchBluetooth();
                break;
            case R.id.bt_search_stop:
                bluetoothClient.stopSearch();

                break;


        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        // Forward results to EasyPermissions
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this);
    }
    public void searchBluetooth() {

        SearchRequest request = new SearchRequest.Builder()
                .searchBluetoothLeDevice(3000, 3)   // 先扫BLE设备3次，每次3s
                .searchBluetoothClassicDevice(5000) // 再扫经典蓝牙5s,在实际工作中没用到经典蓝牙的扫描
                .searchBluetoothLeDevice(2000)      // 再扫BLE设备2s
                .build();

        bluetoothClient.search(request, new SearchResponse() {
            @Override
            public void onSearchStarted() {//开始搜素
            }
            @Override

            public void onDeviceFounded(SearchResult device) {//找到设备可通过manufacture过滤
                Beacon beacon = new Beacon(device.scanRecord);
//                int i=0;
//                for (SearchResult s:searchResults){
//                    if (s.getAddress().equals(device.getAddress())){
//                        i=1;
//                        break;
//                    }
//                }
//                if (i==0)
                if (!searchResults.contains(device))
                searchResults.add(device);
                adapter.notifyDataSetChanged();
                BluetoothLog.v(String.format("beacon for %s\n%s", device.getAddress(), beacon.toString()));
            }

            @Override

            public void onSearchStopped() {//搜索停止

            }

            @Override

            public void onSearchCanceled() {//搜索取消

            }

        });
    }




}