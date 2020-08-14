package com.darkmili.broadcastpractice;

import android.app.Activity;

import java.util.LinkedList;
import java.util.List;

public class ActivityCollecter {
    //如果只是单纯的工具类，用静态方法较好，但是如果涉及共同的资源访问，更应该用单例模式；
    private List<Activity> activityList = new LinkedList<>();
    private volatile static ActivityCollecter activityCollecter=null;
    private ActivityCollecter() {
    }
    //双重检查,虽然此时不需要同步，但是写一下也挺好
    public static ActivityCollecter getInstance() {
        if (activityCollecter==null){
            //通过类对象上锁
            synchronized (ActivityCollecter.class){
                if (activityCollecter==null)
                activityCollecter=new ActivityCollecter();
            }
        }
            return activityCollecter;
    }

    public void addActivity(Activity activity) {
        activityList.add(activity);
    }

    public void removeActivity(Activity activity) {
        activityList.remove(activity);
    }

    public void finishAll() {
        for (Activity activity :
                activityList) {
            if (activity != null) {
                activity.finish();
            }
        }
        activityList.clear();

    }
}
