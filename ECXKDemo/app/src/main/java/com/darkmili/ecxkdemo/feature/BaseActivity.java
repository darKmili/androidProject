package com.darkmili.ecxkdemo.feature;

import android.Manifest;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import pub.devrel.easypermissions.EasyPermissions;
import pub.devrel.easypermissions.PermissionRequest;
 /**
 　　* @description: 自定义活动基类
 　　* @throws
 　　* @author dark
 　　* @date 2020/8/19 10:23
 　　*/
public class BaseActivity extends AppCompatActivity {
    private String[] perms;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //屏蔽导航栏
        if (Build.VERSION.SDK_INT >= 21){
            View decorView = getWindow().getDecorView();
            //noinspection deprecation
            decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }

        // 设置手机屏幕常亮
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);//设置竖屏
        //权限申请
        perms=new String[]{Manifest.permission.ACCESS_COARSE_LOCATION,Manifest.permission.BLUETOOTH};
        EasyPermissions.requestPermissions(
                new PermissionRequest.Builder(this, 1, perms)
                        .build());
    }
}
