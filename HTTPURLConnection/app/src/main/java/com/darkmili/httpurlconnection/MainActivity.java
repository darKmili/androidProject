package com.darkmili.httpurlconnection;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    StringBuilder stringBuilder = new StringBuilder();
    private MyHandle handle = new MyHandle();

    class MyHandle extends Handler {
        @Override
        public void handleMessage(@NonNull Message msg) {
            Bundle data = msg.getData();
            TextView textView = findViewById(R.id.textView);
            textView.setText(data.getString("text","数据回传失败"));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            String url_s = "https://www.baidu.com/";
                            URL url = new URL(url_s);

                            //得到connection对象。
                            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                            //设置请求方式
                            connection.setRequestMethod("GET");
                            //连接
                            connection.connect();
                            //得到响应码
                            int responseCode = connection.getResponseCode();
                            if (responseCode == HttpURLConnection.HTTP_OK) {
                                //得到响应流
                                InputStream inputStream = connection.getInputStream();

                                //封装流
                                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

                                String str;
                                //将响应流转换成字符串

                                do {
                                    str = reader.readLine();
                                    stringBuilder.append(str);
                                } while (str != null);
                                reader.close();

                                Log.d("kwwl", "result=============" + stringBuilder.toString());
                                Message message = new Message();
                                Bundle bundle = new Bundle();
                                bundle.putString("text",stringBuilder.toString());
                                message.setData(bundle);
                                handle.sendMessage(message);
                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            }
        });


    }


}