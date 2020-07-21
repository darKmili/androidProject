package com.darkmili.httpcallback.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTTPUtl {
    public static void sendRequest(final String urlstr, final CallBack callBack) {


        new Thread(new Runnable() {
            @Override
            public void run() {
                HttpURLConnection connection = null;
                StringBuilder builder = new StringBuilder();
                try {
                    URL url = new URL(urlstr);
                    connection = (HttpURLConnection) url.openConnection();
                    //设置请求方式
                    connection.setRequestMethod("GET");
                    connection.setDoOutput(true);
                    connection.setDoInput(true);
                    connection.setConnectTimeout(5000);
                    connection.setReadTimeout(5000);

                    //获取返回流
                    InputStream in = connection.getInputStream();
                    //封装流
                    BufferedReader reader=new BufferedReader(new InputStreamReader(in));
                    String str="";
                    while ((str=reader.readLine())!=null){
                        builder.append(str);

                    }

                    //回调给finish去处理结果
                    if (callBack!=null){
                        callBack.finish(builder.toString());
                    }

                } catch (IOException e) {
                    if (callBack!=null){
                        //回调给error方法处理错误
                        callBack.error(e);
                    }
                }finally {
                    //关闭连接
                    if (connection!=null){
                        connection.disconnect();
                    }
                }
            }
        }).start();
    }
}
