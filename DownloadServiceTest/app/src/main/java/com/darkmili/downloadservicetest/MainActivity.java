package com.darkmili.downloadservicetest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.darkmili.downloadservicetest.service.DownloadService;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private DownloadService.DownloadBinder downloadBinder;

    private ServiceConnection connection = new ServiceConnection() {

        @Override
        public void onServiceDisconnected(ComponentName name) {
        }

        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            downloadBinder = (DownloadService.DownloadBinder) service;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button startDownload = (Button) findViewById(R.id.start);
        Button pauseDownload = (Button) findViewById(R.id.pause);
        Button cancelDownload = (Button) findViewById(R.id.cancel);
        startDownload.setOnClickListener(this);
        pauseDownload.setOnClickListener(this);
        cancelDownload.setOnClickListener(this);
        Intent intent = new Intent(this, DownloadService.class);
        startService(intent); // 启动服务
        bindService(intent, connection, BIND_AUTO_CREATE); // 绑定服务
        if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(MainActivity.this, new String[]{ Manifest.permission. WRITE_EXTERNAL_STORAGE }, 1);
        }
    }

    @Override
    public void onClick(View v) {
        if (downloadBinder == null) {
            return;
        }
        switch (v.getId()) {
            case R.id.start:
                String url = "http://guolin.tech/api/china";
                downloadBinder.startDownload(url);
                break;
            case R.id.pause:
                downloadBinder.pauseDownload();
                break;
            case R.id.cancel:
                downloadBinder.cancelDownload();
                break;
            default:
                break;
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        switch (requestCode) {
            case 1:
                if (grantResults.length > 0 && grantResults[0] != PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(this, "拒绝权限将无法使用程序", Toast.LENGTH_SHORT).show();
                    finish();
                }
                break;
            default:
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbindService(connection);
    }

}
//public class MainActivity extends AppCompatActivity implements View.OnClickListener{
//    public DownloadService.DownloadBinder downloadBinder;
//    ServiceConnection connection=new ServiceConnection() {
//        @Override
//        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
//            downloadBinder=(DownloadService.DownloadBinder)iBinder;
//        }
//        @Override
//        public void onServiceDisconnected(ComponentName componentName) {
//
//        }
//    };
//
//    private Button start;
//    private Button pause;
//    private Button cancel;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        start=findViewById(R.id.start);
//        pause=findViewById(R.id.pause);
//        cancel=findViewById(R.id.cancel);
//        start.setOnClickListener(this);
//        pause.setOnClickListener(this);
//        cancel.setOnClickListener(this);
//        Intent intent=new Intent(this,DownloadService.class);
//        startService(intent);
//        bindService(intent,connection,BIND_AUTO_CREATE);
////        权限申请
//        if (ContextCompat.checkSelfPermission(MainActivity.this,Manifest.permission.WRITE_EXTERNAL_STORAGE)!=PackageManager.PERMISSION_GRANTED){
//            ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},1);
//        }
//    }
//
//    @Override
//    public void onClick(View view) {
//        if (downloadBinder==null){
//            return;
//        }
//        switch (view.getId()){
//            case R.id.start:
//                String url="http://guolin.tech/api/bing_pic";
//                downloadBinder.startDownload(url);
//                break;
//            case R.id.pause:
//                downloadBinder.pauseDownload();
//                break;
//            case R.id.cancel:
//                downloadBinder.cancelDownload();
//                break;
//        }
//    }
//    //权限申请
//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//        if (requestCode==1){
//            if (grantResults.length>0&&grantResults[0]!= PackageManager.PERMISSION_GRANTED){
//                Toast.makeText(this,"get permission failed",Toast.LENGTH_LONG).show();
//                //结束下载活动
//                finish();
//            }
//        }
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        unbindService(connection);
//    }
//}