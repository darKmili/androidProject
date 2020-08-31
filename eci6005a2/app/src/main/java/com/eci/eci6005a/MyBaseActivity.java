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

package com.eci.eci6005a;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Toast;

import com.eci.eci6005a.adapter.recyvDbAdapter;
import com.eci.eci6005a.utils.Utils;
import com.liyu.sqlitetoexcel.SQLiteToExcel;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public abstract class MyBaseActivity extends AppCompatActivity {
    @BindView(R.id.toolbar)
    public Toolbar toolbar;

    private RecyclerView resyvDb;
    private recyvDbAdapter mAdapter;
    private ArrayList<String> mData = new ArrayList<>();
    private StringBuffer DbDatasb = new StringBuffer();

    protected Activity mActivity;
    protected Context appContext;
    SimpleDateFormat formatter = new SimpleDateFormat("dd日HH时mm分", Locale.getDefault());
    private String mExportXlsName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = this;
        appContext = getApplicationContext();
        // 设置手机屏幕常亮
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);//设置竖屏

        initPhotoError();
    }

    private void initPhotoError() {
        // android 7.0系统解决拍照的问题
        //这是由于私有目录被限制访问”的问题
        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());
        builder.detectFileUriExposure();
    }

    protected void bindToolBar() {
        //用于视图绑定
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_24dp);
        if (Build.VERSION.SDK_INT >= 23) {
            toolbar.setTitleTextColor(getColor(android.R.color.white));
        } else {
            toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_usr, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_share:
                mExportXlsName = "BackFatDataExport" +".xls";
                share();
                break;
            case R.id.menu_usr:
                System.out.println("--------------->eci");
                Uri uri = Uri.parse("http://www.eacenic.cn/");
                Intent it = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(it);
                break;
            case android.R.id.home:
                menuHomeClick();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    //单文件分享
    private void shareSingleFile() {
        Uri uri = Uri.fromFile(new File(Environment.getExternalStorageDirectory() + "/ECI/"
                +mExportXlsName));
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.putExtra(Intent.EXTRA_STREAM, uri);
        shareIntent.setType("*/*");
        PackageManager localPackageManager = getPackageManager();
        HashMap<String, ActivityInfo> localHashMap = new HashMap<>();
        try {
            //根据intent来查找本地apk适合的分享接口列表。
            List<ResolveInfo> localList = localPackageManager.queryIntentActivities(shareIntent, 0);
            //遍历分享接口。
            for (ResolveInfo resolveInfo : localList) {
                ActivityInfo localActivityInfo = resolveInfo.activityInfo;
                String str = localActivityInfo.name;
                //过滤接口，如只需用到微信分享。如不知道string，可进行调试，通过localList列表中查看。
                if (str.contains("com.tencent.mm.ui.tools.ShareImgUI"))
                    localHashMap.put(str, localActivityInfo);
            }
        } catch (Exception localException) {
            System.out.println("exception" + localException);
        }
        ActivityInfo localActivityInfo = localHashMap.get("com.tencent.mm.ui.tools.ShareImgUI");
        if (localActivityInfo == null) {
            Toast.makeText(MyBaseActivity.this, "请检查微信是否能正常运行！", Toast.LENGTH_LONG).show();
            return;
        }
        //根据过滤下来的接口进行跳转，也可自定义选项框进行选择跳转。
        shareIntent.setComponent(new ComponentName(localActivityInfo.packageName, localActivityInfo.name));
        startActivityForResult(shareIntent, 0);
    }

    public void backFatDb2Xls() {

        String dataBasePath = Environment.getExternalStorageDirectory().getPath()
                + File.separator + "ECI" + File.separator + "WirelessBackFat"+ File.separator  + "beibiaoshujuku.db";

        String exportDirectoryPath = Environment.getExternalStorageDirectory().getPath()+"/ECI/";


        new SQLiteToExcel
                .Builder(this)
                .setDataBase(dataBasePath)
                .setPath(exportDirectoryPath)
                .setFileName(mExportXlsName)
                .setTables("com_eci_eci6005a_sqlite_User")
                .start(new SQLiteToExcel.ExportListener() {
                    @Override
                    public void onStart() {
                        //Utils.showSnackBar(MyBaseActivity.this.toolbar, "开始导出数据");
                    }
                    @Override
                    public void onCompleted(String filePath) {
                        //Utils.showSnackBar(MyBaseActivity.this.toolbar, "数据导出成功");
                        Utils.showSnackBar(MyBaseActivity.this.toolbar, "已保存到:\r\n"+filePath);
                        Timer timer = new Timer();// 实例化Timer类
                        timer.schedule(new TimerTask() {
                            public void run() {
                                shareSingleFile();
                                this.cancel();
                            }
                        }, 2000);// 这里百毫秒
                    }
                    @Override
                    public void onError(Exception e) {
                       // Toast.makeText(MyBaseActivity.this, "\n" + "数据导出失败--->" + e.toString(), Toast.LENGTH_LONG).show();
                        Utils.showSnackBar(MyBaseActivity.this.toolbar, "数据导出失败");
                    }
                });
    }

    public void share() {
        //将数据库内容导出到 XLS
        backFatDb2Xls();
    }

    protected void menuHomeClick() {
        //默认返回上一层
        finish();
        //用于activity跳转时的动画，一个参数是第一个activity进入时的动画，另外一个参数则是第二个activity退出时的动画
        overridePendingTransition(0, R.anim.slide_top_to_bottom);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0, R.anim.slide_top_to_bottom);
    }

}
