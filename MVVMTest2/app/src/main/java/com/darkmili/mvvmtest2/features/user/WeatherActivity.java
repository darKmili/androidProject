package com.darkmili.mvvmtest2.features.user;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.darkmili.mvvmtest2.R;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
    }
}