package com.darkmili.jetpacktest;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

private MutableLiveData<Integer> count=new MutableLiveData<>();

    public MainViewModel(int count) {
        this.count.setValue(count);
    }

    public MutableLiveData<Integer> getCount() {
        return count;
    }

    public void plusOne(){
        Integer value = count.getValue();
        count.setValue(value+1);
    }
    public void clear(){
        count.setValue(0);
    }

}
