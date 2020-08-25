package com.darkmili.ecxkdemo.repository.local.dao;

import com.darkmili.ecxkdemo.repository.local.bean.Animal;

import org.litepal.LitePal;

import java.util.List;

/**
 * @author Administrator
 * @title: AnimalDao
 * @projectName ECXKDemo
 * @description: TODO
 * @date 2020/8/2514:04
 */
public class AnimalDao {

    public static Animal findById(String erbiaoID){
       return (Animal) LitePal.where("erbiaoId = ?",erbiaoID).find(Animal.class);
    }

    public static List<Animal> findAll(){
        return LitePal.findAll(Animal.class);
    }

    public static void insert(){
        LitePal.getDatabase();
        Animal animal = new Animal();
        animal.setBianhao("01321");
        animal.setErbiaoId("012345672954321");
        animal.setGrowthDays(120);
//        animal.setHealth("优");
        animal.setLanqu("H985");
        animal.setSpecies("猪");
        animal.setWeight(152);
        animal.save();
    }
}
