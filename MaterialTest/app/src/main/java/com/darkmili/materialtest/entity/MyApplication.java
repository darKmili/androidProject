package com.darkmili.materialtest.entity;

import android.app.Application;
import android.content.Context;

public class MyApplication extends Application {
    private static Context context;
    private static MyApplication instance;
    //新建静态变量
    private static String Globalvariable;
    @Override
    public void onCreate() {
        super.onCreate();
        //获取去全局context
        context = getApplicationContext();
        //实例个人Application类
        instance = this ;
    }

    public static MyApplication getInstance() {
        return instance;
    }

    public static void setInstance(MyApplication instance) {
        MyApplication.instance = instance;
    }

    public static Context getContext() {
        return context;
    }

    public static void setContext(Context context) {
        MyApplication.context = context;
    }

    public static String getGlobalvariable() {
        return Globalvariable;
    }

    public static void setGlobalvariable(String globalvariable) {
        //这一步很重要
        MyApplication.Globalvariable = globalvariable;
    }
}
