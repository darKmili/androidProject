package com.darkmili.mvvmtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.darkmili.mvvmtest.a_hello_mvvm.UserActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button first,second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        onClicks();
    }

    public void initView() {
        first = findViewById(R.id.first);
        second=findViewById(R.id.second);
    }

    public void onClicks() {
        first.setOnClickListener(this);
        second.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.first:
                UserActivity.startSelf(MainActivity.this);
                break;
            case R.id.second:
                com.darkmili.mvvmtest.b_repository.UserActivity.startSelf(MainActivity.this);
                break;
        }
    }
}