package com.darkmili.mvvmtest.a_hello_mvvm;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.darkmili.mvvmtest.MainActivity;
import com.darkmili.mvvmtest.R;
import com.darkmili.mvvmtest.a_hello_mvvm.Bean.User;
import com.darkmili.mvvmtest.a_hello_mvvm.viewmodel.UserViewModel;

public class UserActivity extends AppCompatActivity  implements LifecycleObserver {
    private TextView id,name;
    private UserViewModel userViewModel;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        initView();
        initData();
    }

    public void initView() {
        id=findViewById(R.id.first_textView);
        name=findViewById(R.id.first_textView2);
    }

    public void initData() {
        userViewModel= new ViewModelProvider(this).get(UserViewModel.class);
        userViewModel.getUserMutableLiveData().observe(this, new Observer<User>() {
            @Override
            public void onChanged(User user) {
                updateData(user);
            }
        });
        userViewModel.setUserMutableLiveData("2333","limi");
    }

    public void updateData(User user) {
        id.setText(user.getId());
        name.setText(user.getName());
    }
    public static void startSelf(Context context){

       context.startActivity(new Intent(context, UserActivity.class));


    }

}
