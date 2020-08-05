package com.darkmili.jetpacktest;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class Repository {
    //饿汉
    private static Repository repository = new Repository();

    private Repository() {
    }

    public static Repository getInstance() {
        return repository;
    }


    public static LiveData<User> getUser(String id){
        MutableLiveData<User> userMutableLiveData=new MutableLiveData<>();
        userMutableLiveData.setValue(new User(id,id,0));
        return userMutableLiveData;
    }
}
