package com.example.launchmode;

import android.app.Activity;

import java.util.LinkedList;
import java.util.List;

/**
 * 活动管理器
 */
public class ActivityCollector {
    private static List<Activity> activityList = new LinkedList<Activity>();

    public static void add(Activity activity) {
        activityList.add(activity);
    }

    public static void remove(Activity activity) {
        activityList.remove(activity);
    }

    public static void finishAll() {
        for (Activity activity:
             activityList) {
            if (activityList!=null){
                activityList.remove(activity);
            }

        }
    }
}
