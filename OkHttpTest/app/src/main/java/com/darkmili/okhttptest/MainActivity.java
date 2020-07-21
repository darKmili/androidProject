package com.darkmili.okhttptest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button);
        button.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                OkHttpClient client=new OkHttpClient();
                Request request=new Request.Builder().url("https://www.JD.com").build();
                try {
                    Response response = client.newCall(request).execute();
                    showWebText(response.body().string());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }


    public void showWebText(final String str){
        runOnUiThread(new Runnable() {
            @Override
            public void run() {

                TextView textView=findViewById(R.id.text);
                textView.setText(str);
            }
        });
    }
}




//
//                 //Get请求
//                OkHttpClient client = new OkHttpClient();
//                Request request = new Request.Builder().url("https://www.baidu.com").build();
//                try{
//                Response response=client.newCall(request).execute();
//                }catch(IOException e){
//                e.printStackTrace();
//                }
//
//                //Post请求,需要构建RequestBody对象，设置post(requestBody)
//                RequestBody requestBody=new FormBody.Builder().add("name","usrname").add("password","123456").build();
//                Request request1=new Request.Builder().url("https://www.baidu.com").post(requestBody).build();
//                try{
//                Response response=client.newCall(request1).execute();
//                }catch(IOException e){
//                e.printStackTrace();
//                }