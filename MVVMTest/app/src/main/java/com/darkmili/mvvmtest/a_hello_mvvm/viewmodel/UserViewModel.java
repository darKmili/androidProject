package com.darkmili.mvvmtest.a_hello_mvvm.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.darkmili.mvvmtest.a_hello_mvvm.Bean.User;

public class UserViewModel extends ViewModel {
    private MutableLiveData<User> userMutableLiveData;

    public MutableLiveData<User> getUserMutableLiveData() {
        if (userMutableLiveData==null){
            userMutableLiveData=new MutableLiveData<>();
        }
        return userMutableLiveData;
    }

    public void setUserMutableLiveData(String id,String name) {
        userMutableLiveData.setValue(new User(id,name));
    }
}
