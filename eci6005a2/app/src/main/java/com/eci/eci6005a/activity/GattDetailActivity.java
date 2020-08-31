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


import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings;
import android.text.InputFilter;
import android.util.Log;
import android.view.Display;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.eci.eci6005a.MyApplication;
import com.eci.eci6005a.MyBaseActivity;
import com.eci.eci6005a.R;
import com.eci.eci6005a.sqlite.User;
import com.eci.eci6005a.treeview.TreeNode;
import com.eci.eci6005a.treeview.TreeView;
import com.eci.eci6005a.utils.ActivityUtils;
import com.eci.eci6005a.utils.Utils;
import com.eci.eci6005a.views.MyNodeViewFactory;
import com.jakewharton.rx.ReplayingShare;
import com.polidea.rxandroidble2.RxBleClient;
import com.polidea.rxandroidble2.RxBleConnection;
import com.polidea.rxandroidble2.RxBleDevice;
import com.polidea.rxandroidble2.scan.ScanFilter;
import com.polidea.rxandroidble2.scan.ScanSettings;

import net.tsz.afinal.FinalDb;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import am.widget.multiactiontextview.MultiActionTextView;
import butterknife.BindView;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.PublishSubject;

public class GattDetailActivity extends MyBaseActivity {

    private final static String TAG = "GattActivity::::D";
    private static final int REQUEST_CODE_OPENGPS = 189;
    private int mCurrentDialogStyle = R.style.DialogGPS;

    @BindView(R.id.rl_content)
    LinearLayout bg_ceshi;
    @BindView(R.id.et_erbnum)
    EditText et_erbnum;

    private MultiActionTextView mCharHighceng1;
    private MultiActionTextView mCharHighceng2;
    private MultiActionTextView mCharHighceng3;
    private MultiActionTextView mCharLowceng1;
    public FinalDb db;
    private String targetDirectory = Environment.getExternalStorageDirectory().getPath() + "/ECI/WirelessBackFat";// 数据库文件在sd卡中的目录
    private MultiActionTextView mCharLowceng2;
    private MultiActionTextView mCharLowceng3;
    private List<User> databaseList;
    private List<String> mData;
    private String[] result;
    private String EBNameMod = null;
    SimpleDateFormat formatter;
    //treeview
    private ViewGroup viewGroup;
    private TreeNode root;
    private TreeView treeView;

    private Disposable mCurrtNotifyDisposable;
    private RxBleDevice mCurrtBledevice;
    private Disposable scanDisposable;
    private static PublishSubject<Boolean> disconnectTriggerSubject = PublishSubject.create();
    private final CompositeDisposable compositeDisposable = new CompositeDisposable();

    private String mCurrectMac = null;
    private String mCurrectUuid = null;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gatt_detail);

        bindToolBar();
        //管理ACTIVITY
        ActivityUtils.getInstance().addActivity("GattActivity", this);
        formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        createFileCatalogue(targetDirectory);

        //todo 数据库初始化
        FinalDb.DaoConfig daoConfig = new FinalDb.DaoConfig();
        daoConfig.setContext(this);
        daoConfig.setDbName("beibiaoshujuku.db");
        daoConfig.setTargetDirectory(targetDirectory);
        daoConfig.setDbVersion(2);
        db = FinalDb.create(daoConfig);
        //todo 开启蓝牙通知并接收数据
        mReceiveData();
        ///////////////////////////////////
        initMultiActionTextView();
        //////  treeView
        viewGroup = findViewById(R.id.container);
        root = TreeNode.root();
        buildTree();
        treeView = new TreeView(root, this, new MyNodeViewFactory());
        View view = treeView.getView();

        view.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        viewGroup.addView(view);
    }

    /**
     * 创建文件目录
     */
    private void createFileCatalogue(String txtPath) {
        File destDir = new File(txtPath);
        if (!destDir.exists()) {
            destDir.mkdirs();
        }
    }

    /**
     * 描述： 去除List中重复的String
     * 作者： zq
     * 时间： 2018/11/27 4:57 PM
     */

    public List<String> removeStringListDupli(List<String> stringList) {
        Set<String> set = new LinkedHashSet<>(stringList);
        stringList.clear();
        stringList.addAll(set);
        return stringList;
    }

    @SuppressLint("SetTextI18n")
    private void buildTree() {
        databaseList = db.findAll(User.class);
        if (databaseList.size() != 0) {
            et_erbnum.setText(databaseList.get(databaseList.size() - 1).getCeshi_ID());
            List<String> mParentTmp = new ArrayList<>();
            for (User user : databaseList
            ) {
                Objects.requireNonNull(mParentTmp).add(user.getCeshi_ID());
            }
            //列表去除重复数据
            mParentTmp = removeStringListDupli(mParentTmp);
            //准备treenode
            for (String str : mParentTmp
            ) {
                //第一级
                TreeNode treeNode = new TreeNode("耳标编号：  " + str);
                treeNode.setLevel(0);
                for (User user : databaseList
                ) {
                    if (user.getCeshi_ID().equals(str)) {
                        String rSCeshi_time = formatter.format(user.getCeshi_Time());
                        //第二级
                        TreeNode treeNode1 = new TreeNode(rSCeshi_time + " 数据：" + user.getCeshi_Data());
                        treeNode1.setLevel(1);
                        treeNode.addChild(treeNode1);
                    }
                }
                root.addChild(treeNode);
            }
            mData = generateData(databaseList.size());
        } else {
            if (et_erbnum.getText() != null) {
                et_erbnum.setText(et_erbnum.getText());
            } else {
                et_erbnum.setText("20180101");
            }
        }
    }

    public String[] getNumbers(String content) {
        String[] sTmp;
        StringBuilder sb = new StringBuilder();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            sb.append(matcher.group());
            sb.append(" ");
        }
        sTmp = sb.toString().split(" ");
        return sTmp;

    }

    public void mReceiveData() {
        MyApplication.isBleClosed = false;
        Bundle bundle = getIntent().getExtras();

        assert bundle != null;
        mCurrtBledevice = MyApplication.getRxBleClient(this).getBleDevice(bundle.getString("MAC"));
        if (mCurrtBledevice.getConnectionState() == RxBleConnection.RxBleConnectionState.CONNECTED) {
            Log.d("blut", "mReceiveData: " + mCurrtBledevice.getConnectionState());
            triggerDisconnect();
            Timer timer = new Timer();// 实例化Timer类
            timer.schedule(new TimerTask() {
                public void run() {
                    this.cancel();
                }
            }, 2000);// 这里百毫秒
        } else {
            Log.d("blut", "mReceiveData: " + mCurrtBledevice.getConnectionState());
        }
        mCurrectMac = bundle.getString("MAC");
        mCurrectUuid = bundle.getString("UUID");
        startscan(bundle.getString("MAC"), bundle.getString("UUID"));
    }

    private void startscan(String mac, String uuid) {
        //打开蓝牙
        BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (!bluetoothAdapter.isEnabled()) {
            bluetoothAdapter.enable();
            Timer timer = new Timer();// 实例化Timer类
            timer.schedule(new TimerTask() {
                public void run() {
                    this.cancel();
                }
            }, 2000);// 这里百毫秒
        }
        if (!isLocServiceEnable(getApplication())) {
            Log.d("blut", "onScanning: 尚未开启位置定位服务");
            //没有打开则弹出对话框
            AlertDialog dialog = new AlertDialog.Builder(GattDetailActivity.this)
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
            Display display = getWindowManager().getDefaultDisplay();
            Window window = dialog.getWindow();
            WindowManager.LayoutParams params = window.getAttributes();
            params.width = (int) (display.getWidth() * 0.9);
            window.setAttributes(params);
        } else {
            Log.d("blut", "onScanning: 定位已开启.");
            mCurrtNotifyDisposable = null;
            RxBleClient rxBleClient = MyApplication.getRxBleClient(getApplication());
            if (isScanning()) {
                Log.d("blut", "isScanning :  need stop!");
                scanDisposable.dispose();
                Timer timer = new Timer();// 实例化Timer类
                timer.schedule(new TimerTask() {
                    public void run() {
                        this.cancel();
                    }
                }, 2000);// 这里百毫秒
            }
            Log.d("blut", "onScanning: scan   start!!");
            scanDisposable = rxBleClient.scanBleDevices(
                    new ScanSettings.Builder()
                            .build(),
                    new ScanFilter.Builder()
                            .setDeviceAddress(mac)
                            .build()
            )
                    .observeOn(AndroidSchedulers.mainThread())
                    .doFinally(GattDetailActivity.this::dispose)
                    .subscribe(
                            scanResult -> {
                                if (mCurrtNotifyDisposable == null) {
                                    Log.d("blut", "onScanned: 找到了设备!!");
                                    mCurrtNotifyDisposable = mCurrtBledevice
                                            .establishConnection(false)
                                            //.take(2)
                                            .takeUntil(disconnectTriggerSubject)
                                            .compose(ReplayingShare.instance())
                                            .flatMap(rxBleConnection -> rxBleConnection.setupNotification(UUID.fromString(uuid)))
                                            .doOnNext(notificationObservable -> runOnUiThread(null))
                                            .flatMap(notificationObservable -> notificationObservable)
                                            .observeOn(AndroidSchedulers.mainThread())
                                            .subscribe(bytes -> {
                                                notifyAdapter(formatMsgContent(bytes));
                                            }, throwable -> {
                                                Log.d("blut1", "onNotificationSetupFailure :  " + throwable);
                                                if (!MyApplication.isBleClosed) {
                                                    bg_ceshi.setBackgroundColor(getResources().getColor(R.color.qmui_config_color_red));
                                                    Timer timer = new Timer();// 实例化Timer类
                                                    timer.schedule(new TimerTask() {
                                                        public void run() {
                                                            this.cancel();
                                                        }
                                                    }, 2000);// 这里百毫秒
                                                    startscan(mCurrectMac, mCurrectUuid);
                                                }
                                            });
                                }
                            },
                            GattDetailActivity.this::onScanFailure
                    );

        }
    }

    private boolean isScanning() {
        return scanDisposable != null;
    }

    private void onScanFailure(Throwable throwable) {
        if (isConnected()) {
            triggerDisconnect();
        }
    }

    private void dispose() {
        scanDisposable = null;
        mCurrtNotifyDisposable = null;
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
            return result;
        }
        if (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER) ||
                locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)) {
            result = true;
        }
        return result;

    }

    private boolean isConnected() {
        if (mCurrtBledevice == null) {
            return false;
        }
        return mCurrtBledevice.getConnectionState() == RxBleConnection.RxBleConnectionState.CONNECTED;
    }

    private void triggerDisconnect() {
        disconnectTriggerSubject.onNext(false);
    }

    private void onConnectionFailure(Throwable throwable) {
        Log.d("blut", "onConnectionFailure ::: connect  :  " + throwable);
    }

    /**
     * 描述： 将 byte 数组转换为 ASCII
     * 作者： zq
     * 时间： 2019/4/2 11:39 AM
     */
    private String formatMsgContent(byte[] data) {
        return Utils.byteToASCII(data);
    }

    private List<String> generateData(int size) {
        ArrayList<String> data = new ArrayList<>(size);
        List<User> databaseList;
        databaseList = db.findAll(User.class);
        for (int i = 0; i < size; i++) {
            data.add(formatter.format(databaseList.get(i).getCeshi_Time().getTime()) + '\n' + databaseList.get(i).getCeshi_ID() + '\n' + databaseList.get(i).getCeshi_Data());
        }
        return data;
    }

    private void initMultiActionTextView() {
        mCharHighceng1 = findViewById(R.id.charHighceng1);
        mCharHighceng2 = findViewById(R.id.charHighceng2);
        mCharHighceng3 = findViewById(R.id.charHighceng3);
        mCharLowceng1 = findViewById(R.id.charLowceng1);
        mCharLowceng2 = findViewById(R.id.charLowceng2);
        mCharLowceng3 = findViewById(R.id.charLowceng3);
        mCharHighceng1.setTypeface(Typeface.DEFAULT_BOLD);
        mCharHighceng2.setTypeface(Typeface.DEFAULT_BOLD);
        mCharHighceng3.setTypeface(Typeface.DEFAULT_BOLD);
        mCharLowceng1.setTypeface(Typeface.DEFAULT_BOLD);
        mCharLowceng2.setTypeface(Typeface.DEFAULT_BOLD);
        mCharLowceng3.setTypeface(Typeface.DEFAULT_BOLD);
    }

    //todo 从设备接收数据
    private void notifyAdapter(String Recevie_Data) {
        User user = new User();
        dealWithData(Recevie_Data, user);
        System.out.println("GattDetailActivity-------msg----1------>:" + Recevie_Data);
    }

    private void dealWithData(String recevie_Data, User user) {

        if (recevie_Data.length() == 7 && recevie_Data.charAt(6) == 'E') {
            bg_ceshi.setBackgroundColor(getResources().getColor(R.color.white));
            mCharHighceng1.setText(recevie_Data.substring(0, 1));
            mCharLowceng1.setText(recevie_Data.substring(1, 2));
            mCharHighceng2.setText(recevie_Data.substring(2, 3));
            mCharLowceng2.setText(recevie_Data.substring(3, 4));
            mCharHighceng3.setText(recevie_Data.substring(4, 5));
            mCharLowceng3.setText(recevie_Data.substring(5, 6));
        } else if (recevie_Data.length() == 17 && recevie_Data.charAt(0) == 'B' && recevie_Data.charAt(16) == 'E') {
            et_erbnum.setText(recevie_Data.substring(1, 16));
        } else if (recevie_Data.length() == 8 && recevie_Data.charAt(0) == 'H') {
            bg_ceshi.setBackgroundColor(getResources().getColor(R.color.app_color_theme_3));
            Integer str = Integer.valueOf(recevie_Data.substring(1, 3));

            if (str != 0) {

                final EditText et = new EditText(GattDetailActivity.this);
                et.setGravity(Gravity.CENTER);
                et.setMaxLines(1);
                et.setFilters(new InputFilter[]{new InputFilter.LengthFilter(18)});

                //String rCeshi_time = formatter.format(new Date(System.currentTimeMillis()));
                Date rCeshi_time = new Date(System.currentTimeMillis());

                String rCeshi_Data = mCharHighceng1.getText().toString() + mCharLowceng1.getText().toString() + "  " +
                        mCharHighceng2.getText().toString() + mCharLowceng2.getText().toString() + "  " +
                        mCharHighceng3.getText().toString() + mCharLowceng3.getText().toString();

                databaseList = db.findAll(User.class);
                String rCeshi_EarBiao;

                if (databaseList.size() != 0) {
                    if (EBNameMod == null) {
                        // String mDataExt = databaseList.get(databaseList.size() - 1).getCeshi_ID();
                        String mDataExt = et_erbnum.getText().toString();
                        System.out.println("GattDetailActivity-------msg----1------>:" + mDataExt);
                        String[] mDataExtString = getNumbers(mDataExt);
                        if (mDataExtString.length != 0) {
                            rCeshi_EarBiao = String.valueOf(Long.parseLong(mDataExtString[mDataExtString.length - 1]));
                            rCeshi_EarBiao = replaceLast(mDataExt, mDataExtString[mDataExtString.length - 1], rCeshi_EarBiao);

                            System.out.println("GattDetailActivity-------msg----1------>:" + rCeshi_EarBiao);
                        } else {
                            // rCeshi_EarBiao = mDataExt + " 1";
                            rCeshi_EarBiao = mDataExt;
                            System.out.println("GattDetailActivity-------msg----2------>:" + rCeshi_EarBiao);
                        }
                    } else {
                        String[] mDataExtString = getNumbers(EBNameMod);
                        if (mDataExtString.length != 0) {
                            rCeshi_EarBiao = String.valueOf(Long.parseLong(mDataExtString[mDataExtString.length - 1]));
                            System.out.println("GattDetailActivity-------msg----1------>:" + rCeshi_EarBiao);
                            rCeshi_EarBiao = replaceLast(EBNameMod, mDataExtString[mDataExtString.length - 1], rCeshi_EarBiao);
                            System.out.println("GattDetailActivity-------msg----1------>:" + rCeshi_EarBiao);
                        } else {
                            //rCeshi_EarBiao = EBNameMod + " 1";
                            rCeshi_EarBiao = EBNameMod;
                            System.out.println("GattDetailActivity-------msg----2------>:" + rCeshi_EarBiao);
                        }
                        EBNameMod = null;
                    }
                } else {
                    rCeshi_EarBiao = String.valueOf(20180101);
                    System.out.println("GattDetailActivity-------msg---------->:" + rCeshi_EarBiao);
                }

                user.setCeshi_ID(rCeshi_EarBiao);
                user.setCeshi_Time(rCeshi_time);
                user.setCeshi_Data(rCeshi_Data);

                //查看当前数据是否与数据库重复
                boolean saveFlag = true;
                databaseList = db.findAll(User.class);
                for (int i = 0; i < databaseList.size(); i++) {
                    if (databaseList.get(i).getCeshi_ID().equals(rCeshi_EarBiao) &&
                            databaseList.get(i).getCeshi_Time().equals(rCeshi_time)) {
                        saveFlag = false;
                    }
                }
                if (saveFlag) {
                    et_erbnum.setText(rCeshi_EarBiao);
                    db.save(user);
                    List<TreeNode> cmp = treeView.getAllNodes();
                    TreeNode parentTNode = new TreeNode("耳标编号：  " + rCeshi_EarBiao);
                    parentTNode.setLevel(0);
                    String rSCeshi_time = formatter.format(rCeshi_time);
                    TreeNode childTNode = new TreeNode(rSCeshi_time + " 数据：" + rCeshi_Data);
                    childTNode.setLevel(1);
                    parentTNode.addChild(childTNode);
                    for (TreeNode treeNode : cmp
                    ) {
                        if (parentTNode.getValue().equals(treeNode.getValue())) {
                            // Toast.makeText(GattDetailActivity.this,"aaa" , Toast.LENGTH_SHORT).show();
                            treeNode.addChild(childTNode);
                            treeView.refreshTreeView();
                            treeView.collapseAll();
                            treeView.expandNode(treeNode);
                            return;
                        }
                    }
                    treeView.collapseAll();
                    treeView.expandNode(parentTNode);
                    treeView.addNode(root, parentTNode);

                }
            }
        }
    }

    public static String replaceLast(String text, String regex, String replacement) {
        return text.replaceFirst("(?s)(.*)" + regex, "$1" + replacement);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_dbdel, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
            case R.id.menu_DBdel:
                mDelSelectedNodes();
                break;
        }
        return false;
    }

    private void mDelSelectedNodes() {
        List<TreeNode> selectedNodes = treeView.getSelectedNodes();
        for (int i = 0; i < selectedNodes.size(); i++) {
            treeView.deleteNode(selectedNodes.get(i));
            if (selectedNodes.get(i).getValue().toString().split(" 数据：").length == 2) {
                db.deleteByWhere(User.class,
                        "Ceshi_Time=" + '"' + selectedNodes.get(i).getValue().toString().split(" 数据：")[0] + '"' + " and " +
                                "Ceshi_Data=" + '"' + selectedNodes.get(i).getValue().toString().split(" 数据：")[1] + '"'
                );
                Toast.makeText(
                        GattDetailActivity.this,
                        "删除了:" + '\n' +
                                selectedNodes.get(i).getValue().toString().split(" 数据：")[0] +
                                selectedNodes.get(i).getValue().toString().split(" 数据：")[1],
                        Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityUtils.getInstance().delActivity("GattActivity");
        MyApplication.isBleClosed = true;
        compositeDisposable.clear();
        disconnectTriggerSubject.onNext(true);

        if (mCurrtNotifyDisposable != null) {
            mCurrtNotifyDisposable.dispose();
        }
        if (scanDisposable != null) {
            scanDisposable.dispose();
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_OPENGPS) {
            if (isLocServiceEnable(Objects.requireNonNull(getApplication()))) {
                startscan(mCurrectMac, mCurrectUuid);
            }
        }
    }
}
