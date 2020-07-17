package com.example.listviewtest.entity;

public class Fruit {
    private Integer imageId;
    private String name;


    public Fruit(Integer imageId, String name) {
        this.imageId = imageId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }
}
