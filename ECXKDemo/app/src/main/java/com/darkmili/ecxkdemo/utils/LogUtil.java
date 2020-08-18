package com.darkmili.ecxkdemo.utils;

import android.util.Log;

/**
 * 自定义日志类
 * created by dark
 */
public class LogUtil {
    public static final int VERBOSE = 1;
    public static final int DEBUG = 2;
    public static final int INFO = 3;
    public static final int WARNING = 4;
    public static final int ERROR = 5;
    public static final int NOTHING = 6;
    //可以通过修改level等级实现日志屏蔽
    public static int level = VERBOSE;

    public static void v(String tag, String msg) {
        if (level <= VERBOSE) {
            Log.d(tag, msg);
        }
    }

    public static void d(String tag, String msg) {
        if (level <= DEBUG) {
            Log.d(tag, msg);
        }
    }

    public static void i(String tag, String msg) {
        if (level <= INFO) {
            Log.d(tag, msg);
        }
    }

    public static void w(String tag, String msg) {
        if (level <= WARNING) {
            Log.d(tag, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (level <= ERROR) {
            Log.d(tag, msg);
        }
    }

    public static void n(String tag, String msg) {
        if (level <= NOTHING) {
            Log.d(tag, msg);
        }
    }
}
