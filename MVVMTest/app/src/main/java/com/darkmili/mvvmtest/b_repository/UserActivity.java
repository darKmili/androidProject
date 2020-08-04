package com.darkmili.mvvmtest.b_repository;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.darkmili.mvvmtest.R;
import com.darkmili.mvvmtest.b_repository.bean.MyCallBack;
import com.darkmili.mvvmtest.b_repository.bean.data;


public class UserActivity extends AppCompatActivity {
    private TextView id,name;
    private UserViewModel userViewModel;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        initView();
        initData();
    }
    public static void startSelf(Context context){
        context.startActivity(new Intent(context,UserActivity.class));
    }
    public void initView() {
        id=findViewById(R.id.first_textView);
        name=findViewById(R.id.first_textView2);
    }

    public void initData() {
        userViewModel= new ViewModelProvider(this).get(UserViewModel.class);
//        userViewModel.getUserLiveData(121.6544,25.1552).observe(this, new Observer<data>() {
//            @Override
//            public void onChanged(data data) {
//                updateData(data);
//            }
//        });
        userViewModel.getCallBackLiveData("iBPOWAGy7dk0NmN8").observe(this, new Observer<MyCallBack>() {
            @Override
            public void onChanged(MyCallBack myCallBack) {
                updateData(myCallBack);
            }
        });

    }

//    public void updateData(data data) {
//        id.setText(data.getStatus());
//        name.setText(data.getResult().getForecast_keypoint());
//    }

    public void updateData(MyCallBack call) {
        id.setText(call.getStatus());
        name.setText(call.getApi_status());
    }
}
