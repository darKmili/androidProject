package com.darkmili.ecxkdemo.repository.local.bean;

import org.litepal.crud.LitePalSupport;

/**
 * @author Administrator
 * @title: Record
 * @projectName ECXKDemo
 * @description: TODO
 * @date 2020/8/2711:02
 */
public class Record extends LitePalSupport {
    private String time;//日期
    private float weight;//重量
    private int growthDays;//成长天数
    private String health;//健康状况


    public Record(String time, float weight, int growthDays, String health) {
        this.time = time;
        this.weight = weight;
        this.growthDays = growthDays;
        this.health = health;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getGrowthDays() {
        return growthDays;
    }

    public void setGrowthDays(int growthDays) {
        this.growthDays = growthDays;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }
}
