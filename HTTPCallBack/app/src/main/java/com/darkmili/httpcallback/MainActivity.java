package com.darkmili.httpcallback;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.darkmili.httpcallback.utils.CallBack;
import com.darkmili.httpcallback.utils.HTTPUtl;

import java.net.HttpURLConnection;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button_top);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        final String url="https://www.JD.com";
       HTTPUtl.sendRequest(url, new CallBack() {
           @Override
           public void finish(final String s) {
               runOnUiThread(new Runnable() {
                   @Override
                   public void run() {
                       TextView textView=findViewById(R.id.text_response);
                       textView.setText(s);
                   }
               });
           }

           @Override
           public void error(Exception e) {
            Log.d("error","请求失败");
           }
       });



    }
}