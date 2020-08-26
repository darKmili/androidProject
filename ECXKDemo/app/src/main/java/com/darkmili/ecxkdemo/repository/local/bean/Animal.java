package com.darkmili.ecxkdemo.repository.local.bean;

import org.litepal.annotation.Column;
import org.litepal.crud.LitePalSupport;

/**
 * @author Administrator
 * @title: Animal
 * @projectName ECXKDemo
 * @description: TODO
 * @date 2020/8/2511:31
 */
public class Animal extends LitePalSupport {

    private String erbiaoId;

    private float weight;

    private int growthDays;

    @Column(ignore = true)
    private String health;

    private String species;

    private String lanqu;

    private String bianhao;

    public String getLanqu() {
        return lanqu;
    }

    public void setLanqu(String lanqu) {
        this.lanqu = lanqu;
    }

    public String getBianhao() {
        return bianhao;
    }

    public void setBianhao(String bianhao) {
        this.bianhao = bianhao;
    }

    public String getErbiaoId() {
        return erbiaoId;
    }

    public void setErbiaoId(String erbiaoId) {
        this.erbiaoId = erbiaoId;
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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
