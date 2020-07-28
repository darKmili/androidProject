package com.darkmili.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        //OKHttp的标准用法
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        //请求回调处理
        client.newCall(request).enqueue(callback);
    }

}
