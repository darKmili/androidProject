package com.darkmili.calculatoractivity;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    private MutableLiveData<String> result;
    private MutableLiveData<String> display;
    public MutableLiveData<String> getResult() {
        if (result==null){
            result=new MutableLiveData<>();
        }
        return result;
    }

    public MutableLiveData<String> getDisplay() {
        if (display==null){
            display=new MutableLiveData<>();
        }
        return display;
    }
}
