package com.darkmili.viewpagetest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private MyViewPageAdapter adapter;
    private ArrayList<View> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        viewPager=findViewById(R.id.view_page);
        adapter=new MyViewPageAdapter(list);
        viewPager.setAdapter(adapter);
    }
    public void init(){
        list=new ArrayList<>();
        list.add(getLayoutInflater().inflate(R.layout.page_one,null,false));
        list.add(getLayoutInflater().inflate(R.layout.page_two,null,false));
        list.add(getLayoutInflater().inflate(R.layout.page_three,null,false));
    }

}