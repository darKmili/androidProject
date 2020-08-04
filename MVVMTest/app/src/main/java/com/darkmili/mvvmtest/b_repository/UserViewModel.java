package com.darkmili.mvvmtest.b_repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.darkmili.mvvmtest.b_repository.bean.MyCallBack;
import com.darkmili.mvvmtest.b_repository.bean.data;
import com.darkmili.mvvmtest.b_repository.utils.UserRepository;

public class UserViewModel extends ViewModel {
    private UserRepository userRepository=UserRepository.getInstance();
    private LiveData<data> userLiveData;
    private LiveData<MyCallBack> callBackLiveData;
    public LiveData<data> getUserLiveData(double a,double b) {
        if (userLiveData==null){
            userLiveData=userRepository.getUser(a,b);
        }
        return userLiveData;
    }

    public LiveData<MyCallBack> getCallBackLiveData(String call) {
        if (callBackLiveData==null){
            callBackLiveData=userRepository.getMyCallBack(call);
        }
        return callBackLiveData;
    }
}
