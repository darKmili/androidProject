package com.darkmili.mvvmtest2.commom.repository.local.service;

import androidx.lifecycle.LiveData;

import com.darkmili.mvvmtest2.commom.entitys.Weather;

public interface WeatherService {
    LiveData<Long> add(Weather weather);

    LiveData<Weather> queryByUsername(double lat,double lng);
}
