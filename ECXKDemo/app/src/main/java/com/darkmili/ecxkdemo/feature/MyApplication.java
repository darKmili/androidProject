package com.darkmili.ecxkdemo.feature;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;

/**
 * @author Administrator
 * @title: MyApplication
 * @projectName ECXKDemo
 * @description: 全局应用程序类
 * @date 2020/8/2511:23
 */
public class MyApplication extends Application {

    private Context context;


    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this);
        context=getApplicationContext();
    }

    public Context getContext() {
        return context;
    }
}
