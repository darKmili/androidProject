package com.darkmili.materialtest;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;


import com.darkmili.materialtest.Adapter.PersonAdapter;
import com.darkmili.materialtest.entity.MyApplication;
import com.darkmili.materialtest.entity.Person;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private ArrayList<Person> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));

        drawerLayout = findViewById(R.id.drawerlayout);
        ActionBar actionBar = getSupportActionBar();
        init();
//        LinearLayoutManager manager=new LinearLayoutManager(this);
        GridLayoutManager manager=new GridLayoutManager(this,2);
        manager.setOrientation(RecyclerView.VERTICAL);
        PersonAdapter adapter=new PersonAdapter(list);
        RecyclerView recyclerView=findViewById(R.id.recycler);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(manager);


        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.mipmap.ic_menu);
        }

        FloatingActionButton fButton = findViewById(R.id.fab);
        fButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //可交互式提示
                Snackbar.make(view,"用户"+ MyApplication.getGlobalvariable(), Snackbar.LENGTH_LONG).setAction("undo", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Toast.makeText(MainActivity.this, "删除成功", Toast.LENGTH_LONG).show();
                    }
                }).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.backup:
                Toast.makeText(this, "backup", Toast.LENGTH_LONG).show();
                break;
            case R.id.delete:
                Toast.makeText(this, "delete", Toast.LENGTH_LONG).show();
                break;
            case R.id.setting:
                Toast.makeText(this, "setting", Toast.LENGTH_LONG).show();
                break;
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
            default:
        }
        return true;
    }

    public void init(){
        list=new ArrayList<>();
        for (int i=0;i<7;i++){
            list.add(new Person(R.drawable.apple_pic,"apple"));
            list.add(new Person(R.drawable.banana_pic,"banana"));
            list.add(new Person(R.drawable.cherry_pic,"cherry"));
            list.add(new Person(R.drawable.grape_pic,"grape"));
            list.add(new Person(R.drawable.mango_pic,"mango"));
            list.add(new Person(R.drawable.orange_pic,"orange"));
            list.add(new Person(R.drawable.pear_pic,"pear"));
            list.add(new Person(R.drawable.pineapple_pic,"pineapple"));
            list.add(new Person(R.drawable.strawberry_pic,"strawberry"));
            list.add(new Person(R.drawable.watermelon_pic,"watermelon"));
        }

    }

}