package com.darkmili.mvvmtest2.commom.repository.remote;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitFactory {
    public static final String URL = "https://api.caiyunapp.com/v2.5/iBPOWAGy7dk0NmN8";
    private static Retrofit retrofit;

    static {
        OkHttpClient client = new OkHttpClient();
        retrofit = new Retrofit.Builder().baseUrl(URL).client(client).addConverterFactory(GsonConverterFactory.create()).build();
    }

    public static Retrofit getRetrofit() {
        return retrofit;
    }

}
