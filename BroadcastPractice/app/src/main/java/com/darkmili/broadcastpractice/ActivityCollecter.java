package com.darkmili.broadcastpractice;

import android.app.Activity;
import java.util.LinkedList;
import java.util.List;

public class ActivityCollecter {
    public static List<Activity> activityList = new LinkedList<>();

    public static void addActivity(Activity activity) {
        activityList.add(activity);
    }

    public static void removeActivity(Activity activity) {
        activityList.remove(activity);
    }

    public static void finishAll() {
        for (Activity activity :
                activityList) {
            if (activity != null) {
                activity.finish();
            }
        }

    }
}
