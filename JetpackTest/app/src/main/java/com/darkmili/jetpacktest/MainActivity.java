package com.darkmili.jetpacktest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private MainViewModel viewModel;
    private Button button,button1;
    private TextView textView;
    private SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences=getPreferences(MODE_PRIVATE);
        int count=sharedPreferences.getInt("count",0);
        //2.2.0版本
//        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        //这个可以保存活动退出后的值
        viewModel=new ViewModelProvider(this,new MainViewModelFactory(count)).get(MainViewModel.class);
        button = findViewById(R.id.bt_plus);
        button1=findViewById(R.id.bt_clear);
        textView=findViewById(R.id.tx_count);
        //添加生命周期感知,来观察LifecycleOwner(AppCompatActivity或者Fragment)；
        getLifecycle().addObserver(new MyObserver(getLifecycle()));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModel.plusOne();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModel.clear();
            }
        });
        viewModel.getCount().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                textView.setText(String.valueOf(integer));
            }
        });
        Log.i("主动通知",getLifecycle().getCurrentState().toString());
    }



    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putInt("count",viewModel.getCount().getValue());
        editor.apply();
        Log.i("主动通知",getLifecycle().getCurrentState().toString());
    }

}