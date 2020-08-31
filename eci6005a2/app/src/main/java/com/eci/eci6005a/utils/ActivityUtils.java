/*
 * ******************************************************************
 *  Copyright (c)  2018
 *  project_name:ECI6005A_AND_APP_V1
 *  创建时间：18-3-19 下午5:55
 *  作者：Administrator
 *  四川翊晟芯科信息技术有限公司
 *  版权所有 违法必究
 * ******************************************************************
 */

package com.eci.eci6005a.utils;

import android.app.Activity;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/3/13.
 */

public class ActivityUtils {
    private static ActivityUtils activityUtils;
    private Map<String, Activity> activityMap = new HashMap<String, Activity>();

    public static ActivityUtils getInstance() {
        if (activityUtils == null) {
            activityUtils = new ActivityUtils();

        }
        return activityUtils;
    }

    /**
     * 保存指定key值的activity（activity启动时调用）
     *
     * @param key
     * @param activity
     */
    public void addActivity(String key, Activity activity) {
        if (activityMap.get(key) == null) {
            activityMap.put(key, activity);
        }
    }

    /**
     * 移除指定key值的activity （activity关闭时调用）
     *
     * @param key
     */
    public void delActivity(String key) {
        Activity activity = activityMap.get(key);
        if (activity != null) {
            if (activity.isDestroyed() || activity.isFinishing()) {
                activityMap.remove(key);
                return;
            }
            activity.finish();
            activityMap.remove(key);
        }
    }


}
