package com.darkmili.ecxkdemo.feature;

import android.app.Application;
import android.content.Context;

import com.darkmili.ecxkdemo.repository.local.dao.AnimalDao;

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
    private static MyApplication application;


    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this);
        context=getApplicationContext();
        AnimalDao.insert();
        //当打开应用时，对静态的应用实例赋值
        application=this;

    }

    public Context getContext() {
        return context;
    }

    public static MyApplication getInstance(){
        return application;
    }
}
