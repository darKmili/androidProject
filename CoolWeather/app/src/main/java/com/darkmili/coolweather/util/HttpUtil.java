package com.darkmili.coolweather.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 与服务端交互
 */
public class HttpUtil {
    /**
     *
     * @param address 请求地址
     * @param callback 回调方法
     */
    public static void sendOKHttpRequest(String address, Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder()
                .url(address)
                .build();
        client.newCall(request).enqueue(callback);
    }
}
