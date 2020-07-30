package com.darkmili.fragmenttest;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.darkmili.fragmenttest.fragment.BodyFragmentLeft;
import com.darkmili.fragmenttest.fragment.BodyFragmentMedian;
import com.darkmili.fragmenttest.fragment.BodyFragmentRight;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private FrameLayout frameLayout;
    private Button bt_left,bt_median,bt_right;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        replaceFragment(new BodyFragmentLeft());
        init();
    }

    @Override
    public void onClick(View view) {
       switch (view.getId()){
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
    public void init(){
        bt_left=findViewById(R.id.bt_bottom_left);
        bt_right=findViewById(R.id.bt_bottom_right);
        bt_median=findViewById(R.id.bt_bottom_median);
        bt_left.setOnClickListener(this);
        bt_right.setOnClickListener(this);
        bt_median.setOnClickListener(this);
    }

    public void replaceFragment(Fragment fragment){
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment_body,fragment);
        transaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.header_menu, menu);
        return true;
    }
}