package com.darkmili.mvvmtest.b_repository.utils;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.json.JSONObject;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitFactory {
    private static OkHttpClient client;
    private static Retrofit retrofit;
    private static final String HOST = "https://api.caiyunapp.com";

    static {
        client = new OkHttpClient.Builder()
                .connectTimeout(9, TimeUnit.SECONDS)
                .build();
        //baseUrl用于指定所有请求的根路径
        //addConverterFactory用于指定转换库
        retrofit = new Retrofit.Builder()
                .baseUrl(HOST)
                .client(client)//可以配置不同的请求客户端。
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static Retrofit getInstance() {
        return retrofit;
    }
}
