package com.darkmili.ecxkdemo.feature;

import android.Manifest;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

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

     /**
      * 隐藏软键盘
      * @param context
      * @param v
      * @return
      */
     public static Boolean hideInputMethod(Context context, View v) {
         InputMethodManager imm = (InputMethodManager) context
                 .getSystemService(Context.INPUT_METHOD_SERVICE);
         if (imm != null) {
             return imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
         }
         return false;
     }

     /**
      * 判断当前点击屏幕的地方是否是软键盘
      * @param v
      * @param event
      * @return
      */
     public static boolean isShouldHideInput(View v, MotionEvent event) {
         if (v != null && (v instanceof EditText)) {
             int[] leftTop = { 0, 0 };
             v.getLocationInWindow(leftTop);
             int left = leftTop[0], top = leftTop[1], bottom = top + v.getHeight(), right = left
                     + v.getWidth();
             if (event.getX() > left && event.getX() < right
                     && event.getY() > top && event.getY() < bottom) {
                 // 保留点击EditText的事件
                 return false;
             } else {
                 return true;
             }
         }
         return false;
     }

     /**
      * 隐藏键盘
      * @param ev
      * @return
      */
     @Override
     public boolean dispatchTouchEvent(MotionEvent ev) {
         if (ev.getAction() == MotionEvent.ACTION_DOWN) {
             View v = getCurrentFocus();
             if (isShouldHideInput(v, ev)) {
                 if(hideInputMethod(this, v)) {
//                     return true; //隐藏键盘时，其他控件不响应点击事件==》注释则不拦截点击事件
                 }
             }
         }
         return super.dispatchTouchEvent(ev);
     }
 }
