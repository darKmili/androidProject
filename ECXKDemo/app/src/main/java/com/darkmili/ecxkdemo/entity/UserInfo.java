package com.darkmili.ecxkdemo.entity;


public class UserInfo {
    private String erbiaoId;

    private float weight;

    private int growthDays;

    private String health;

    private String species;

    private String lanqu;

    private String beizhu;

    public UserInfo(String erbiaoId, float weight, int growthDays, String health, String species, String lanqu, String beizhu) {
        this.erbiaoId = erbiaoId;
        this.weight = weight;
        this.growthDays = growthDays;
        this.health = health;
        this.species = species;
        this.lanqu = lanqu;
        this.beizhu = beizhu;
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

    public String getLanqu() {
        return lanqu;
    }

    public void setLanqu(String lanqu) {
        this.lanqu = lanqu;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }
}
