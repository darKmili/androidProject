package com.darkmili.mvvmtest2.commom.repository.local.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.darkmili.mvvmtest2.commom.entitys.Weather;
import com.darkmili.mvvmtest2.commom.repository.local.dao.WeatherDao;

@Database(entities = {Weather.class}, version = 1, exportSchema = false)
public abstract  class DB extends RoomDatabase {

    public abstract WeatherDao getWeatherDao();
}
