package com.darkmili.mvvmtest2.commom.repository.local.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.darkmili.mvvmtest2.commom.entitys.Weather;

@Dao
public interface WeatherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)// cache need update
    Long add(Weather weather);
    //TODO
    @Query("select * from weather ")
    LiveData<Weather> queryByLatLng(double lat,double lng);


}
