package com.darkmili.pemissiontest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.Permission;

public class MainActivity extends AppCompatActivity {
    private Button bt_call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_call = findViewById(R.id.bt_call);
        bt_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //通过获取用户权限直接拨打电话
                //查看权限是否被授予
                if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    //没有权限
                    //申请权限
                    /**
                     * param1 activity实例
                     * param2 权限名字符串数组
                     * param3 请求码，只要是唯一值即可，用于标识该请求
                     * 调用完后，会在界面弹出选项，根据用户进行选择授权，将授权结果交给onRequestPermissionsResult处理
                     */
                    ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.CALL_PHONE},1);
                } else {
                    //具有权限
                    Toast.makeText(MainActivity.this,"授权成功",Toast.LENGTH_SHORT).show();
                    call();
                }
            }
        });

    }

    //使用申请到的权限拨打电话
    public void call() {
        try {
            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:10086"));
            startActivity(intent);
        }catch (SecurityException e){
            Log.d("security","授权失败");
        }

    }


    /**
     *     重写权限申请结果类，该类得到权限申请情况
     * @param requestCode
     * @param permissions
     * @param grantResults
     */
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
       switch (requestCode){

           case 1:
               if (grantResults.length>0&&grantResults[0]==PackageManager.PERMISSION_GRANTED){
                   Toast.makeText(MainActivity.this,"授权成功",Toast.LENGTH_SHORT).show();
                   //成功授权
                   call();
               }else {
                   Toast.makeText(MainActivity.this,"授权失败",Toast.LENGTH_SHORT).show();

               }
               break;
           default:
       }
    }
}