package com.darkmili.fragmenttest;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;


import com.darkmili.fragmenttest.fragment.BodyFragmentLeft;
import com.darkmili.fragmenttest.fragment.BodyFragmentMedian;
import com.darkmili.fragmenttest.fragment.BodyFragmentRight;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private FrameLayout frameLayout;
    private Button bt_left, bt_median, bt_right;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //注册监听函数
        setContentView(R.layout.activity_main);
        replaceFragment(new BodyFragmentLeft());
        init();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_bottom_left:
                replaceFragment(new BodyFragmentLeft());
                break;
            case R.id.bt_bottom_median:
                replaceFragment(new BodyFragmentMedian());
                break;
            case R.id.bt_bottom_right:
                replaceFragment(new BodyFragmentRight());
                break;

            default:
        }
    }

    public void init() {
        bt_left = findViewById(R.id.bt_bottom_left);
        bt_right = findViewById(R.id.bt_bottom_right);
        bt_median = findViewById(R.id.bt_bottom_median);
        bt_left.setOnClickListener(this);
        bt_right.setOnClickListener(this);
        bt_median.setOnClickListener(this);
        frameLayout = findViewById(R.id.fragment_body);

    }

    public void replaceFragment(Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment_body, fragment);
//        模拟返回栈
//        transaction.addToBackStack(null);
        transaction.commitNow();
    }




    /**
     * 实现定位回调
     */



}