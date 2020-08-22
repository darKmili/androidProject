package com.darkmili.ecxkdemo.feature.main2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.darkmili.ecxkdemo.R;
import com.darkmili.ecxkdemo.feature.BaseActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity2 extends BaseActivity {
    private Toolbar toolbar;
    private BottomNavigationView bottomNavigationView;
    private Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initUI();


    }

    /**
     * 　　* @description: 界面元素初始化
     * 　　* @param
     * 　　* @return void
     * 　　* @throws
     * 　　* @author dark
     * 　　* @date 2020/8/19 9:54
     *
     */
    public void initUI() {
        toolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        bottomNavigationView = findViewById(R.id.nav_view);
        //导航menu点击事件
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.item_xinxi:
                        fragment = new FragmentLeft();
                        replaceFragment(fragment);
                        break;
                    case R.id.item_xiangxi:
                        fragment = new FragmentMiddle();
                        replaceFragment(fragment);
                        break;
                    case R.id.item_zhuye:
                        fragment = new FragmentRight();
                        replaceFragment(fragment);
                        break;
                }
                return true;
            }
        });
        fragment = new FragmentLeft();
        replaceFragment(fragment);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_top, menu);
        return true;
    }

    /**
     * 　　* @description: 动态加载碎片
     * 　　* @param ${tags}
     * 　　* @return ${return_type}
     * 　　* @throws
     * 　　* @author dark
     * 　　* @date 2020/8/19 10:22
     *
     */
    private void replaceFragment(Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();

        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment_layout, fragment);
        //替换完成后必须提交
        transaction.commit();
    }
}