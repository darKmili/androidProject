package com.example.recyclerview.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.recyclerview.R;
import com.example.recyclerview.adapter.FruitAdapter;
import com.example.recyclerview.entity.Fruit;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Fruit> fruits=new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();

//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
//        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        //生成layoutManager 实现滚动方式
        StaggeredGridLayoutManager staggeredGridLayoutManager=new StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL);
        //生成自定义适配器
        FruitAdapter fruitAdapter=new FruitAdapter(fruits);
        //生成recyclerview对象，并加载适配器与布局管理器
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recyc);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(fruitAdapter);
    }
    public void initFruits(){
        for (int i=0;i<7;i++){
            fruits.add(new Fruit(R.drawable.apple_pic,"apple"));
            fruits.add(new Fruit(R.drawable.banana_pic,"banana"));
            fruits.add(new Fruit(R.drawable.cherry_pic,"cherry"));
            fruits.add(new Fruit(R.drawable.grape_pic,"grape"));
            fruits.add(new Fruit(R.drawable.mango_pic,"mango"));
            fruits.add(new Fruit(R.drawable.orange_pic,"orange"));
            fruits.add(new Fruit(R.drawable.pear_pic,"pear"));
            fruits.add(new Fruit(R.drawable.pineapple_pic,"pineapple"));
            fruits.add(new Fruit(R.drawable.strawberry_pic,"strawberry"));
            fruits.add(new Fruit(R.drawable.watermelon_pic,"watermelon"));
        }

    }
}
