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
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Toast;


import com.darkmili.materialtest.Adapter.PersonAdapter;
import com.darkmili.materialtest.entity.MyApplication;
import com.darkmili.materialtest.entity.Person;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

import static com.darkmili.materialtest.R.color.colorPrimary;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private ArrayList<Person> list;
    private ActionBar actionBar;
    private GridLayoutManager manager;
    private FloatingActionButton fButton;
    private Toolbar toolbar;
    private NavigationView navigationView;
    private SwipeRefreshLayout swipeRefreshLayout;
    private PersonAdapter adapter;
    private RecyclerView recyclerView;
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (Build.VERSION.SDK_INT >= 21){
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        //使用toolbar并且形式与actionbar一致
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawerlayout);
        init();
        //LinearLayoutManager manager=new LinearLayoutManager(this);
        manager = new GridLayoutManager(this, 2);
        manager.setOrientation(RecyclerView.VERTICAL);
        adapter = new PersonAdapter(list);
        recyclerView = findViewById(R.id.recycler);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(manager);

        //获取actionBar对象。
        actionBar = getSupportActionBar();
        if (actionBar != null) {
            //  设置显示HOMEＡＳＵＰ
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.mipmap.ic_menu);
        }

        fButton = findViewById(R.id.fab);
        fButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //可交互式提示
                //这个view是属于fButton，是基于CoordinatorLayout的子控件,故而CoordinatorLayout可以对此SnackBar做出反应
                Snackbar.make(view, "用户" + MyApplication.getGlobalvariable(), Snackbar.LENGTH_LONG).setAction("undo", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Toast.makeText(MainActivity.this, "删除成功", Toast.LENGTH_LONG).show();
                    }
                }).show();
            }
        });

        navigationView = findViewById(R.id.na_view);
        navigationView.setCheckedItem(R.id.call);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.call:
                        Toast.makeText(MainActivity.this, "你点击了：" + "打电话", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.friends:
                        Toast.makeText(MainActivity.this, "你点击了：" + "朋友", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.mail:
                        Toast.makeText(MainActivity.this, "你点击了：" + "邮件", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.task:
                        Toast.makeText(MainActivity.this, "你点击了：" + "任务", Toast.LENGTH_LONG).show();
                        break;
                }

                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });
        swipeRefreshLayout = findViewById(R.id.swipe_refresh);
        swipeRefreshLayout.setColorSchemeColors(colorPrimary);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                //刷新逻辑
                refreshFruit();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        /**
         * 此方法用于初始化菜单，其中menu参数就是即将要显示的Menu实例。 返回true则显示该menu,false 则不显示;
         * (只会在第一次初始化菜单时调用) Inflate the menu;
         * this adds items to the action bar
         * if it is present.
         */
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        /**
         * 在onCreateOptionsMenu执行后，菜单被显示前调用；如果菜单已经被创建，则在菜单显示前被调用。 同样的，
         * 返回true则显示该menu,false 则不显示; （可以通过此方法动态的改变菜单的状态，比如加载不同的菜单等）
         * Auto-generated method stub
         */
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        /**
         * 菜单项被点击时调用，也就是菜单项的监听方法。
         * 通过这几个方法，可以得知，对于Activity，同一时间只能显示和监听一个Menu 对象。
         * method stub
         */
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
            //    HomeAsUp按钮的id永远都是android.R.id.home
            case android.R.id.home:
                //open 滑动窗口,GravityCompat.START必须与XML中配置的一样
                drawerLayout.openDrawer(GravityCompat.START);
            default:
        }
        return true;
    }

    public void init() {
        list = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            list.add(new Person(R.drawable.apple_pic, "apple"));
            list.add(new Person(R.drawable.banana_pic, "banana"));
            list.add(new Person(R.drawable.cherry_pic, "cherry"));
            list.add(new Person(R.drawable.grape_pic, "grape"));
            list.add(new Person(R.drawable.mango_pic, "mango"));
            list.add(new Person(R.drawable.orange_pic, "orange"));
            list.add(new Person(R.drawable.pear_pic, "pear"));
            list.add(new Person(R.drawable.pineapple_pic, "pineapple"));
            list.add(new Person(R.drawable.strawberry_pic, "strawberry"));
            list.add(new Person(R.drawable.watermelon_pic, "watermelon"));
        }

    }

    public void refreshFruit() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                list.remove(0);
                list.remove(1);
                list.remove(2);
                list.remove(3);
                list.remove(4);
                list.set(5, new Person(R.drawable.watermelon_pic, "watermelon"));
                adapter.notifyDataSetChanged();
                //关闭刷新
                swipeRefreshLayout.setRefreshing(false);
            }
        });

    }

}