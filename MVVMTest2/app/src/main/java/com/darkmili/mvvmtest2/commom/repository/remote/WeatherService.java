package com.darkmili.mvvmtest2.commom.repository.remote;

import androidx.lifecycle.LiveData;

import com.darkmili.mvvmtest2.commom.entitys.Weather;

import retrofit2.Call;
import retrofit2.http.GET;

public interface WeatherService {
    //对应维度和经度查询
    @GET("/121.6544,25.1552/weather.json")
    Call<Weather> getWeather(double lat, double lng);
}
