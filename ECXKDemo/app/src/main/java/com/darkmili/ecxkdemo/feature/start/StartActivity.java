package com.darkmili.ecxkdemo.feature.start;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.darkmili.ecxkdemo.R;
import com.darkmili.ecxkdemo.feature.BaseActivity;
import com.darkmili.ecxkdemo.feature.main.MainActivity;


public class StartActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Integer time = 1000;  //设置等待时间，单位为毫秒
        Handler handler = new Handler();
        //当计时结束时，跳转至主界面
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(StartActivity.this, MainActivity.class));
                StartActivity.this.finish();
            }
        }, time);
    }
}