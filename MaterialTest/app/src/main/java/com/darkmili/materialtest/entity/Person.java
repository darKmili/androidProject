package com.darkmili.materialtest.entity;

public class Person {
    private Integer ima_id;
    private String name;

    public Person(Integer ima_id, String name) {
        this.ima_id = ima_id;
        this.name = name;
    }

    public Integer getIma_id() {
        return ima_id;
    }

    public void setIma_id(Integer ima_id) {
        this.ima_id = ima_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
