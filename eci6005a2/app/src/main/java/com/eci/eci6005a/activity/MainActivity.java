/*
 * ******************************************************************
 *  Copyright (c)  2018
 *  project_name:ECI6005A_AND_APP_V1
 *  创建时间：18-3-19 下午5:55
 *  作者：Administrator
 *  四川翊晟芯科信息技术有限公司
 *  版权所有 违法必究
 * ******************************************************************
 */
package com.eci.eci6005a.activity;

import android.Manifest;
import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.afollestad.materialdialogs.MaterialDialog;
import com.clj.fastble.data.BleDevice;
import com.eci.eci6005a.MyApplication;
import com.eci.eci6005a.MyBaseActivity;
import com.eci.eci6005a.R;
import com.eci.eci6005a.adapter.DeviceAdapter;
import com.eci.eci6005a.comm.ObserverManager;
import com.eci.eci6005a.utils.ActivityUtils;
import com.eci.eci6005a.utils.AnimateUtils;
import com.eci.eci6005a.utils.Utils;
import com.eci.eci6005a.views.RevealBackgroundView;
import com.eci.eci6005a.views.RevealSearchView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.jakewharton.rx.ReplayingShare;
import com.polidea.rxandroidble2.RxBleClient;
import com.polidea.rxandroidble2.RxBleConnection;
import com.polidea.rxandroidble2.RxBleDevice;
import com.polidea.rxandroidble2.exceptions.BleScanException;
import com.polidea.rxandroidble2.scan.ScanFilter;
import com.polidea.rxandroidble2.scan.ScanResult;
import com.polidea.rxandroidble2.scan.ScanSettings;
import com.senierr.permission.PermissionManager;
import com.senierr.permission.RequestCallback;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import butterknife.BindView;
import butterknife.OnClick;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.PublishSubject;
import me.jessyan.autosize.AutoSizeConfig;


@TargetApi(Build.VERSION_CODES.LOLLIPOP)
public class MainActivity extends MyBaseActivity {

    private final static String TAG = "MainACT::::D";

    @BindView(R.id.recycleview)
    RecyclerView recyclerView;
    @BindView(R.id.coll_toolbar)
    CollapsingToolbarLayout collapsingToolbarLayout;
    @BindView(R.id.fab_search)
    FloatingActionButton fabSearch;
    @BindView(R.id.btn_stop_searching)
    Button stopSearching;
    @BindView(R.id.realsearchiew)
    RevealSearchView revealSearchView;
    @BindView(R.id.reveal_background_view)
    RevealBackgroundView revealBackgroundView;
    @BindView(R.id.rl_search_info)
    LinearLayout rlSearchInfo;
    @BindView(R.id.tv_search_device_count)
    TextView tvSearchDeviceCount;
    @BindView(R.id.cl_content)
    CoordinatorLayout clContent;
    @BindView(R.id.app_bar)
    AppBarLayout app_bar;


    private final List<BleDevice> list = new ArrayList<>();
    private DeviceAdapter adapter;
    private int[] fabStartPosition;
    private MaterialDialog progressDialog;
    private long mExitTime;
    private int SEARCH_CNT_FLAG = 0;
    private Boolean CLOSE_FLAG = false;

    private Disposable scanDisposable;
    private final List<ScanResult> data = new ArrayList<>();
    private List<String> mDeviceNameList = new ArrayList<>();
    private final List<RxBleDevice> bleList = new ArrayList<>();

    private RxBleDevice mCurrtBledevice;
    private String mCurrtBledeviceName;
    private int mCurrtPostion;

    private Disposable connectionDisposable;
    private UUID mCurrtBleNotifyUUID = null;

    private Disposable stateDisposable;


    private static PublishSubject<Boolean> disconnectTriggerSubject = PublishSubject.create();
    private final CompositeDisposable compositeDisposable = new CompositeDisposable();
    private static final int REQUEST_CODE_OPENGPS = 189;

    Handler handler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 管理ACTIVITY
        ActivityUtils.getInstance().addActivity("MainActivity", this);
        //必须调用，其在setContentView后面调用
        bindToolBar();
        // 初始化蓝牙
        checkBleSupportAndInitialize();
        //初始化界面
        initView();
        //初始化动画
        initCartoon();
        app_bar.setVisibility(View.VISIBLE);
    }

    private void initView() {
        toolbar.setNavigationIcon(R.drawable.ic_bluetooth_24dp);
        collapsingToolbarLayout.setTitle(getString(R.string.devices));
    }

    @OnClick(R.id.fab_search)
    public void searchDevice() {
        if (scanDisposable != null) {
            scanDisposable.dispose();
        }
        //开始动画
        searchAnimate();
    }

    @OnClick(R.id.btn_stop_searching)
    public void stopSearching() {
        if (scanDisposable != null) {
            scanDisposable.dispose();
        }
        app_bar.setVisibility(View.VISIBLE);
        stopScan();
    }

    //获得蓝牙适配器
    void checkBleSupportAndInitialize() {
        //权限获取
        PermissionManager.with(this)
                .permissions(
                        Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.BLUETOOTH,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE)
                .request(new RequestCallback() {
                    @Override
                    public void onAllGranted() {
                        Toast.makeText(MainActivity.this, "权限成功获取", Toast.LENGTH_SHORT).show();
                        Log.d(TAG, "onAllGranted: 权限成功获取");
                    }
                });

        //打开蓝牙
        BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (!bluetoothAdapter.isEnabled()) {
            bluetoothAdapter.enable();
            Timer timer = new Timer();// 实例化Timer类
            //延迟2秒
            timer.schedule(new TimerTask() {
                public void run() {
                    this.cancel();
                }
            }, 2000);// 这里百毫秒
        }

        if (!isLocServiceEnable(getApplication())) {
            Log.d("blut", "onScanning: 尚未开启位置定位服务");
            //没有打开则弹出对话框
            AlertDialog dialog = new AlertDialog.Builder(MainActivity.this)
                    .setTitle("请打开 GPS 开关")
                    .setMessage("连接设备需要你开启 GPS 定位")
                    .setPositiveButton("去开启",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    //跳转GPS设置界面
                                    Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                                    //比如我们这里设定requestCode为 1
                                    startActivityForResult(intent, REQUEST_CODE_OPENGPS);
                                }
                            })

                    .setCancelable(false)
                    .show();
//            WindowManager systemService = (WindowManager)getSystemService(Context.WINDOW_SERVICE);
            Display display = getWindowManager().getDefaultDisplay();
            Window window = dialog.getWindow();

            WindowManager.LayoutParams params = window.getAttributes();
            params.width = (int) (display.getWidth() * 0.9);
            window.setAttributes(params);
        }
    }


    //初始化动画 与动画的状态监听
    private void initCartoon() {
        //给recyclerView   设置布局样式
        LinearLayoutManager llm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(llm);
        //获取并设置设备适配器
        adapter = new DeviceAdapter(list, this);
        recyclerView.setAdapter(adapter);
        //recyclerView  添加条目效果
        recyclerView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
                adapter.setDelayStartAnimation(true);
                return false;
            }

            public void onTouchEvent(RecyclerView rv, MotionEvent e) {
            }

            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
            }
        });

        // 等待设备连接
        adapter.setOnItemClickListener(new DeviceAdapter.OnItemClickListener() {

            public void onItemClick(View itemView, int position) {
                showProgressDialog();
                connect(list.get(position));
                mCurrtPostion = position;
            }
        });

        //动画效果
        collapsingToolbarLayout.setTranslationY(160f);
        toolbar.setTranslationY(-Utils.dpToPx(60));
        collapsingToolbarLayout.setAlpha(0.0f);

        AnimateUtils.translationY(collapsingToolbarLayout, 0, 400, 100);
        AnimateUtils.translationY(toolbar, 0, 400, 200);
        AnimateUtils.alpha(collapsingToolbarLayout, 1f, 400, 100);

        //revealSearchView 动画状态监听
        revealSearchView.setOnStateChangeListener(new RevealSearchView.OnStateChangeListener() {
            public void onStateChange(int state) {
                if (state == RevealSearchView.STATE_FINISHED) {
                    revealSearchView.setVisibility(View.GONE);
                    revealBackgroundView.endFromEdge();
                }
            }
        });
        // revealBackgroundView 动画状态监听
        revealBackgroundView.setOnStateChangeListener(new RevealBackgroundView.OnStateChangeListener() {
            public void onStateChange(int state) {
                if (state == RevealBackgroundView.STATE_FINISHED) {

                    revealSearchView.startFromLocation(fabStartPosition);
                    tvSearchDeviceCount.setText(getString(R.string.search_device_count, 0));
                    rlSearchInfo.setVisibility(View.VISIBLE);
                    rlSearchInfo.setTranslationY(Utils.dpToPx(70));
                    rlSearchInfo.setAlpha(0);
                    AnimateUtils.translationY(rlSearchInfo, 0, 300, 0);
                    AnimateUtils.alpha(rlSearchInfo, 1.0f, 300, 0);
                    revealSearchView.setVisibility(View.VISIBLE);
                    //准备列表视图并开始扫描
                    onRefresh();
                }
                if (state == RevealBackgroundView.STATE_END_FINISHED) {
                    revealBackgroundView.setVisibility(View.GONE);
                    rlSearchInfo.setVisibility(View.GONE);
                    app_bar.setVisibility(View.VISIBLE);
                    adapter.notifyDataSetChanged();
                }
            }
        });

    }

    //ble 开始扫描
    private void startScan() {
        data.clear();
        //打开蓝牙
        RxBleClient rxBleClient = MyApplication.getRxBleClient(MainActivity.this);
        if (isScanning()) {
            Log.d("blut", "isScanning :  need stop!");
            scanDisposable.dispose();
        }
        Log.d("blut", "onScanning: scan   start!!");


        //设备发现
        scanDisposable = rxBleClient.scanBleDevices(
                new ScanSettings.Builder()
                        .build(),
                new ScanFilter.Builder()
                        .build()
        )
                .observeOn(AndroidSchedulers.mainThread())
                .doFinally(this::dispose)
                .subscribe(scanResult -> {
                            //Log.d("blut", scanResult.getBleDevice().getName());
                            mFilterBthName(scanResult);
//                            list.add(new BleDevice(scanResult.getBleDevice().getBluetoothDevice(), 0, new byte[]{0}, 0));
//                            adapter.notifyDataSetChanged();
                            tvSearchDeviceCount.setText(getString(R.string.search_device_count, data.size()));
                        },
                        this::onScanFailure
                );

        compositeDisposable.add(scanDisposable);

    }

    private void mFilterBthName(ScanResult scanResult) {
        SEARCH_CNT_FLAG++;
        if (SEARCH_CNT_FLAG == 5) {
            SEARCH_CNT_FLAG = 0;
            for (int i = 0; i < data.size(); i++) {
                mDeviceNameList.add(data.get(i).getBleDevice().getName());
                bleList.add(data.get(i).getBleDevice());
            }
        }
        StringBuilder sb = new StringBuilder().append(scanResult.getBleDevice().getName());

        if (sb.length() > 4) {
            if (sb.substring(0, 3).equals("ECI") || sb.substring(0, 3).equals("Lan")) {
                for (int i = 0; i < data.size(); i++) {
                    if (data.get(i).getBleDevice().equals(scanResult.getBleDevice())) {
                        return;
                    }
                }
                Log.d("blut", "data : " + scanResult.getBleDevice().getName());
                data.add(scanResult);
                byte[] nul = new byte[]{0};
                list.add(new BleDevice(scanResult.getBleDevice().getBluetoothDevice(), 0, nul, 0));
                adapter.notifyDataSetChanged();
            }
        }
    }

    private boolean isScanning() {
        return scanDisposable != null;
    }

    private void dispose() {
        scanDisposable = null;
    }

    private void onScanFailure(Throwable throwable) {
    }

    //ble 停止扫描
    private void stopScan() {
        // Toast.makeText(MainActivity.this, "t", Toast.LENGTH_SHORT).show();
        if (scanDisposable != null) {
            scanDisposable.dispose();
        }
        revealSearchView.setVisibility(View.GONE);
        revealBackgroundView.setVisibility(View.GONE);
        //停止雷达动画
        revealSearchView.stopAnimate();
        //涟漪动画回缩
        revealBackgroundView.endFromEdge();
    }

    //ble 搜索动画启动
    private void searchAnimate() {


        revealBackgroundView.setVisibility(View.VISIBLE);
        int[] position1 = new int[2];
        fabSearch.getLocationOnScreen(position1);

        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP_MR1) {
            fabStartPosition = new int[]{(position1[0] + fabSearch.getWidth() / 2),
                    (position1[1] + fabSearch.getHeight() / 4)};
        } else {
            fabStartPosition = new int[]{(position1[0] + fabSearch.getWidth() / 2),
                    position1[1]};
        }
        revealBackgroundView.startFromLocation(fabStartPosition);

        handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                app_bar.setVisibility(View.INVISIBLE);
            }
        };
        MyThread thread = new MyThread();
        thread.start();
    }

    private boolean isConnected() {
        if (mCurrtBledevice == null) {
            return false;
        }
        return mCurrtBledevice.getConnectionState() == RxBleConnection.RxBleConnectionState.CONNECTED;
    }

    private void triggerDisconnect() {
        disconnectTriggerSubject.onNext(true);
    }

    private void onConnectionFailure(Throwable throwable) {
        Log.d("blut", "onConnectionFailure ::: connect  :  " + throwable);
        connect(list.get(mCurrtPostion));
        progressDialog.dismiss();
    }

    /**
     * 描述： 找到通知服务
     * 作者： zq
     * 时间： 2019/4/2 11:31 AM
     */
    private String describeProperties(BluetoothGattCharacteristic characteristic) {
        List<String> properties = new ArrayList<>();
        if (isCharacteristicNotifiable(characteristic)) properties.add("Notify");
        return TextUtils.join(" ", properties);
    }

    /**
     * 描述： 判断是否是通知 characteristic
     * 作者： zq
     * 时间： 2019/4/2 11:32 AM
     */
    private boolean isCharacteristicNotifiable(BluetoothGattCharacteristic characteristic) {
        return (characteristic.getProperties() & BluetoothGattCharacteristic.PROPERTY_NOTIFY) != 0;
    }

    /**
     * 连接设备
     *
     * @param bleDevice
     */
    private void connect(final BleDevice bleDevice) {
        mCurrtBledevice = MyApplication.getRxBleClient(this).getBleDevice(bleDevice.getMac());
        mCurrtBledeviceName = mCurrtBledevice.getName();
        //初始化蓝牙
        if (isConnected()) {
            triggerDisconnect();
            Timer timer = new Timer();// 实例化Timer类
            timer.schedule(new TimerTask() {
                public void run() {
                    this.cancel();
                }
            }, 2000);// 这里百毫秒
        }
        //开始连接并获取 UUID
        connectionDisposable = mCurrtBledevice.establishConnection(false)
                .take(2)
                .takeUntil(disconnectTriggerSubject)
                .flatMapSingle(RxBleConnection::discoverServices)
                .observeOn(AndroidSchedulers.mainThread())
                .doFinally(this::dispose)
                .subscribe(
                        services -> {
                            Log.d("blut", "discovery Services start...  ");
                            for (BluetoothGattService service : services.getBluetoothGattServices()) {
                                // Add service
                                final List<BluetoothGattCharacteristic> characteristics = service.getCharacteristics();
                                for (BluetoothGattCharacteristic characteristic : characteristics) {
                                    if ("Notify".equals(describeProperties(characteristic))) {

                                        mCurrtBleNotifyUUID = characteristic.getUuid();
                                        Log.d("blut", "NOTIFY_UUID :  " + mCurrtBleNotifyUUID);

                                        triggerDisconnect();
                                        list.clear();
                                        adapter.notifyDataSetChanged();

                                        Bundle bundle = new Bundle();
                                        bundle.putString("UUID", mCurrtBleNotifyUUID.toString());
                                        bundle.putString("MAC", mCurrtBledevice.getMacAddress());
                                        Intent intent = new Intent(MainActivity.this, GattDetailActivity.class);
                                        intent.putExtras(bundle);
                                        Timer timer = new Timer();// 实例化Timer类
                                        timer.schedule(new TimerTask() {
                                            public void run() {
                                                progressDialog.dismiss();
                                                startActivity(intent);
                                                this.cancel();
                                            }
                                        }, 2000);// 这里百毫秒
                                    }
                                }
                            }
                        },
                        this::onConnectionFailure);


        compositeDisposable.add(connectionDisposable);
    }

    //显示连接动画
    private void showProgressDialog() {

        progressDialog = new MaterialDialog(this);
        RelativeLayout.LayoutParams layoutParams =
                new RelativeLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT
                );
        layoutParams.addRule(RelativeLayout.CENTER_IN_PARENT, RelativeLayout.TRUE);
        progressDialog.setContentView(new ProgressBar(this),
                layoutParams);
        progressDialog.show();
        WindowManager m = getWindowManager();
        Display d = m.getDefaultDisplay();  //为获取屏幕宽、高
        android.view.WindowManager.LayoutParams p = Objects.requireNonNull(progressDialog.getWindow()).getAttributes();  //获取对话框当前的参数值
        p.height = (int) (d.getHeight() * 0.1);   //高度设置为屏幕的0.3
        p.width = (int) (d.getWidth() * 0.2);    //宽度设置为屏幕的0.5
        progressDialog.getWindow().setAttributes(p);     //设置生效
        progressDialog.getWindow().setBackgroundDrawableResource(R.drawable.bg_materildialog);
    }

    //准备列表视图并开始扫描
    public void onRefresh() {
        if (adapter != null) {
            adapter.clear();
            adapter.notifyDataSetChanged();
        }
        startScan();
    }

    @Override
    protected void menuHomeClick() {
        BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (bluetoothAdapter.isEnabled()) {
            bluetoothAdapter.disable();
            toolbar.setNavigationIcon(R.drawable.ic_bluetooth_disabled_24dp);
        } else {
            bluetoothAdapter.enable();
            toolbar.setNavigationIcon(R.drawable.ic_bluetooth_24dp);
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        //判断用户是否点击了“返回键”
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            //与上次点击返回键时刻作差
            if ((System.currentTimeMillis() - mExitTime) > 2000) {
                //大于2000ms则认为是误操作，使用Toast进行提示
                Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
                //并记录下本次点击“返回键”的时刻，以便下次进行判断
                mExitTime = System.currentTimeMillis();
            } else {
                AutoSizeConfig.getInstance().stop(this);
                //关闭蓝牙
                BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
                if (bluetoothAdapter.isEnabled()) {
                    bluetoothAdapter.disable();
                }
                System.exit(0);
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //关闭蓝牙
        BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (bluetoothAdapter.isEnabled()) {
            bluetoothAdapter.disable();
        }
    }

    /**
     * 描述：判断是否打开了定位服务
     * 作者： zq
     * 时间： 2019/3/29 2:31 PM
     */
    private static boolean isLocServiceEnable(Context context) {
        boolean result = false;
        LocationManager locationManager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
        if (locationManager == null) {
            return false;
        }
        if (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER) ||
                locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)) {
            result = true;
        }
        return result;

    }

    class MyThread extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(300);
                handler.sendEmptyMessage(0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
