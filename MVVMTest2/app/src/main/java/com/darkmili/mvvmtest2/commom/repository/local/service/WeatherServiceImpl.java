package com.darkmili.mvvmtest2.commom.repository.local.service;

import android.os.AsyncTask;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.darkmili.mvvmtest2.commom.entitys.Weather;
import com.darkmili.mvvmtest2.commom.repository.local.dao.WeatherDao;
import com.darkmili.mvvmtest2.commom.repository.local.db.DBHelper;

public class WeatherServiceImpl implements WeatherService {
    private static final WeatherServiceImpl weatherService=new WeatherServiceImpl();

    public WeatherServiceImpl() {
    }
    public static WeatherServiceImpl getInstance(){
        return weatherService;
    }
        WeatherDao weatherDao=DBHelper.getInstance().getDb().getWeatherDao();
    @Override
    public LiveData<Long> add(final Weather weather) {
        final MutableLiveData<Long> mutableLiveData=new MutableLiveData<>();
        new AsyncTask<Void,Void,Long>(){
            @Override
            protected Long doInBackground(Void... voids) {
              return weatherDao.add(weather);
            }

            @Override
            protected void onPostExecute(Long aLong) {
                mutableLiveData.setValue(aLong);
            }
        };
        return mutableLiveData;
    }

    @Override
    public LiveData<Weather> queryByUsername(double lat, double lng) {
        return weatherDao.queryByLatLng(lat,lng);
    }
}
