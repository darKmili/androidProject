package com.example.launchmode;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Class is",getClass().getSimpleName());
        ActivityCollector.add(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        ActivityCollector.remove(this);
    }
    public static void actionStart(Context context){
        Intent intent=new Intent(context,MainActivity.class);
        //可以通过传入参数给Intent
        context.startActivity(intent);
    }
}
