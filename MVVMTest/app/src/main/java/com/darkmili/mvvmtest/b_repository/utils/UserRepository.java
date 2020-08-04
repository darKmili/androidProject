package com.darkmili.mvvmtest.b_repository.utils;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.darkmili.mvvmtest.b_repository.bean.MyCallBack;
import com.darkmili.mvvmtest.b_repository.bean.data;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserRepository {
    private static final UserRepository instance = new UserRepository();

    private UserRepository() {
    }

    public static UserRepository getInstance() {
        return instance;
    }
    //通过Retrofit创建动态代理对象
    private UserApi userApi = RetrofitFactory.getInstance().create(UserApi.class);

    public LiveData<data> getUser(double a,double b) {
        final MutableLiveData<data> user = new MutableLiveData<>();
        userApi.queryUserByLocation(a,b)
                .enqueue(new Callback<data>() {
                    @Override
                    public void onResponse(Call<data> call, Response<data> response) {
                        user.setValue(response.body());//response.body() is a User
                    }

                    @Override
                    public void onFailure(Call<data> call, Throwable t) {
                        t.printStackTrace();
                    }
                });
        return user;
    }


    public LiveData<MyCallBack> getMyCallBack(String callback){
        final MutableLiveData<MyCallBack> callBack=new MutableLiveData<>();
        userApi.queryUserByCallback(callback).enqueue(new Callback<MyCallBack>() {
            @Override
            public void onResponse(Call<MyCallBack> call, Response<MyCallBack> response) {
                callBack.setValue(response.body());
            }

            @Override
            public void onFailure(Call<MyCallBack> call, Throwable t) {
                t.printStackTrace();
            }
        });
        return  callBack;
    }
}
