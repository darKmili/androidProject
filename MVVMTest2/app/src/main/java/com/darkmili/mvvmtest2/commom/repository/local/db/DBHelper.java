package com.darkmili.mvvmtest2.commom.repository.local.db;

import android.content.Context;

import androidx.room.Room;

public class DBHelper {
    private static final String DATABASE_NAME = "weather";
    private static DBHelper dbHelper = new DBHelper();

    public DBHelper() {
    }

    public static DBHelper getInstance() {
        return dbHelper;
    }

    private DB db;

    public void init(Context context) {
        //初始化数据库实例
        db = Room.databaseBuilder(context.getApplicationContext(), DB.class, DATABASE_NAME).build();
    }

    public DB getDb() {
        return db;
    }
}
