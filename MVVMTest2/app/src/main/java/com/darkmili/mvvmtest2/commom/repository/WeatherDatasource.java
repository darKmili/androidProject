package com.darkmili.mvvmtest2.commom.repository;

import androidx.lifecycle.LiveData;

import com.darkmili.mvvmtest2.commom.entitys.Weather;

/**
 * 对外提供统一数据源
 */
public interface WeatherDatasource {
    LiveData<Weather> getWeather(double lat, double lng);
}
