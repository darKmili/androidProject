package com.darkmili.jetpacktest;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

/**
 * 用于感知活动生命周期
 */
public class MyObserver implements LifecycleObserver {
    private Lifecycle lifecycle;
    //可以在任何地方调用lifecycle.currentState来主动获取当前的生命周期状态.返回枚举类型
    public MyObserver(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void activityStart() {
        Log.i("MyObserver", "start");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void activityStop() {
        Log.i("MyObserver", "stop");
    }
}
