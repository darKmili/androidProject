package com.darkmili.materialtest.entity;

import android.app.Application;
import android.content.Context;

public class MyApplication extends Application {
    //设置为静态变量
    private static Context context;
    private static MyApplication instance;
    //新建静态变量
    private static String Globalvariable;
    //onCreate方法只执行一次
    @Override
    public void onCreate() {
        super.onCreate();
        //获取全局context
        context = getApplicationContext();
        //实例个人Application类
        //每个类内部都有一个隐含的成员变量，该成员变量的类型是该类的类型，该成员变量的名称是this
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
        //这一步很重要，保证了获取的变量来自于类，而不是对象
        MyApplication.Globalvariable = globalvariable;
    }
}
