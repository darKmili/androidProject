package com.darkmili.mvvmtest2.commom.repository.remote;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.darkmili.mvvmtest2.commom.entitys.Weather;
import com.darkmili.mvvmtest2.commom.repository.WeatherDatasource;
import com.darkmili.mvvmtest2.commom.repository.local.LocalWeatherDatasource;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class RemoteWeatherDatasource implements WeatherDatasource {
    private Retrofit retrofit = RetrofitFactory.getRetrofit();
    private static final RemoteWeatherDatasource weatherDatasource = new RemoteWeatherDatasource();

    public RemoteWeatherDatasource() {
    }

    public static RemoteWeatherDatasource getInstance() {
        return weatherDatasource;
    }

    @Override
    public LiveData<Weather> getWeather(double lat, double lng) {
        final MutableLiveData<Weather> liveData = new MutableLiveData<>();
        WeatherService service = retrofit.create(WeatherService.class);
        service.getWeather(lat, lng).enqueue(new Callback<Weather>() {
            @Override
            public void onResponse(Call<Weather> call, Response<Weather> response) {
                Weather weather = response.body();
                if (weather!=null){
                    liveData.setValue(weather);
                }
                //存入到本地数据库
                LocalWeatherDatasource.getInstance().add(weather);
            }

            @Override
            public void onFailure(Call<Weather> call, Throwable t) {
                t.printStackTrace();
            }
        });
        return liveData;
    }
}
