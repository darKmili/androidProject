package com.darkmili.ecxkdemo;

import android.Manifest;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import pub.devrel.easypermissions.EasyPermissions;
import pub.devrel.easypermissions.PermissionRequest;

public class BaseActivity extends AppCompatActivity {
    private String[] perms;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 21){
            View decorView = getWindow().getDecorView();
            //noinspection deprecation
            decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        perms=new String[]{Manifest.permission.ACCESS_COARSE_LOCATION,Manifest.permission.BLUETOOTH};
        EasyPermissions.requestPermissions(
                new PermissionRequest.Builder(this, 1, perms)
                        .build());
    }
}
