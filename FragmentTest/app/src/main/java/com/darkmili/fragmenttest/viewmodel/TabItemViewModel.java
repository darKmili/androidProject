package com.darkmili.fragmenttest.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.darkmili.fragmenttest.entity.TabItem;

public class TabItemViewModel extends ViewModel {
    private MutableLiveData<TabItem> liveData;

    public MutableLiveData<TabItem> getLiveData() {
        if (liveData==null){
            liveData=new MutableLiveData<>();
        }
        return liveData;
    }

}
