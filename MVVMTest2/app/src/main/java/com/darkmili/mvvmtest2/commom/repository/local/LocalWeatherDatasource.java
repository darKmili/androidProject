package com.darkmili.mvvmtest2.commom.repository.local;

import androidx.lifecycle.LiveData;

import com.darkmili.mvvmtest2.commom.entitys.Weather;
import com.darkmili.mvvmtest2.commom.repository.WeatherDatasource;
import com.darkmili.mvvmtest2.commom.repository.local.service.WeatherServiceImpl;

public class LocalWeatherDatasource implements WeatherDatasource {
    private static final LocalWeatherDatasource localDatasource=new LocalWeatherDatasource();

    public LocalWeatherDatasource() {
    }

    public static LocalWeatherDatasource getInstance(){
        return localDatasource;
    }
    private WeatherServiceImpl weatherService=WeatherServiceImpl.getInstance();
    @Override
    public LiveData<Weather> getWeather(double lat, double lng) {
       return weatherService.queryByUsername(lat,lng);

    }
    public LiveData<Long> add(Weather weather){
        return weatherService.add(weather);
    }
}
