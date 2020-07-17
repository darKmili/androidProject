package com.example.listviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.listviewtest.adapter.FruitAdapter;
import com.example.listviewtest.entity.Fruit;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruits=new ArrayList<Fruit>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        //默认使用android.R.layout.simple_list_item_1
        FruitAdapter adapter=new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruits);
        ListView listView=(ListView)findViewById(R.id.list1);
        listView.setAdapter(adapter);

        //为子项添加点击事件
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Fruit fruit = fruits.get(i);
                Toast.makeText(MainActivity.this,fruit.getName(),Toast.LENGTH_LONG).show();
            }
        });
    }
    public void initFruits(){
        for (int i=0;i<5;i++){
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
