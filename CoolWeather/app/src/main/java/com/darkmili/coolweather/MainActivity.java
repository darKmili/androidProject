package com.darkmili.coolweather;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //全局统一使用默认的Preference对象存储
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if (prefs.getString("weather", null) != null) {
            //如果缓存存在，则直接跳转到天气界面，并结束当前活动
            Intent intent = new Intent(this, WeatherActivity.class);
            startActivity(intent);
            //MainActivity将从活动栈中清除.
            finish();
        }
    }

}