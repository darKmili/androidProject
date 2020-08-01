package com.darkmili.fragmenttest.entity;

public class Person {
    private int imageId;
    private String name;
    private String describe;

    public Person(int imageId, String name, String describe) {
        this.imageId = imageId;
        this.name = name;
        this.describe = describe;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
