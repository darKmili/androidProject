package com.darkmili.jetpacktest;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private MutableLiveData<Integer> count = new MutableLiveData<>();
    public LiveData<Integer> _count;
    private MutableLiveData<String> idMutableLive =new MutableLiveData<>();
    //  一个值得改变，引起另一个值得改变
    private LiveData<User> userMutableLiveData= Transformations.switchMap(idMutableLive, new Function<String, LiveData<User>>() {
        @Override
        public LiveData<User> apply(String input) {
            return Repository.getUser(input);
        }
    });


    public MainViewModel(int count) {
        this.count.setValue(count);
    }
    //外部获取的LiveData对象应该是不可修改的对象。
    public LiveData<Integer> get_Count() {
        return count;
    }
    //产生改变
    public LiveData<String> getUser(String id){
        idMutableLive.setValue(id);
        return idMutableLive;
    }
    public LiveData<User> getUser(){
        return userMutableLiveData;
    }
    public void plusOne() {
        Integer value = count.getValue();
        count.setValue(value + 1);
    }

    public void clear() {
        count.setValue(0);
    }


}
