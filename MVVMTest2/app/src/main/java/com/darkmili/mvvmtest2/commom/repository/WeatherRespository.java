package com.darkmili.mvvmtest2.commom.repository;

import android.content.Context;

import androidx.lifecycle.LiveData;

import com.darkmili.mvvmtest2.commom.entitys.Weather;
import com.darkmili.mvvmtest2.commom.repository.local.LocalWeatherDatasource;
import com.darkmili.mvvmtest2.commom.repository.remote.RemoteWeatherDatasource;
import com.darkmili.mvvmtest2.commom.utils.NetworkUtil;

/**
 * 统一查询入口
 */
public class WeatherRespository {
    public static final WeatherRespository respository=new WeatherRespository();

    public WeatherRespository() {
    }
    public static WeatherRespository getInstance(){
        return respository;
    }

    private Context context;
    private LocalWeatherDatasource localWeatherDatasource=LocalWeatherDatasource.getInstance();
    private RemoteWeatherDatasource remoteWeatherDatasource=RemoteWeatherDatasource.getInstance();

    public void init(Context context) {
        this.context = context.getApplicationContext();
    }

    public  LiveData<Weather> getWeather(double lat,double lng){
        if (NetworkUtil.isConnected(context)){
            return  remoteWeatherDatasource.getWeather(lat,lng);

        }else {
            return localWeatherDatasource.getWeather(lat,lng);
        }
    }

}
