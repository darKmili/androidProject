package com.darkmili.ecxkdemo.feature.main2;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

import com.darkmili.ecxkdemo.repository.local.bean.Animal;

import org.litepal.LitePal;

import java.util.List;

/**
 * @author Administrator
 * @title: Main2ViewModel
 * @projectName ECXKDemo
 * @description: TODO
 * @date 2020/8/25 14:23
 */
public class Main2ViewModel extends ViewModel {
    private MutableLiveData<String> erbiaoId=new MutableLiveData<>();;

    LiveData<Animal> animalLiveData= Transformations.switchMap(erbiaoId, new Function<String, LiveData<Animal>>() {
        @Override
        public LiveData<Animal> apply(String input) {
            List<Animal> animal = LitePal.where("id = ?",erbiaoId.getValue()).find(Animal.class);
            MutableLiveData<Animal> animalMutableLiveData = new MutableLiveData<>();
            animalMutableLiveData.setValue(animal.get(0));
            return animalMutableLiveData;
        }
    });

    public MutableLiveData<String> getErbiaoId() {
        if (erbiaoId==null){
            erbiaoId=new MutableLiveData<>();
        }
        return erbiaoId;
    }

    public LiveData<Animal> getAnimalLiveData() {
        if (animalLiveData==null){
            animalLiveData=new MutableLiveData<>();
        }
        return animalLiveData;
    }

    public void setErbiaoId(String id) {
        erbiaoId.postValue(id);
    }
}
