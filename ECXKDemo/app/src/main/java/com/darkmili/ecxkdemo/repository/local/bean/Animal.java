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

    private String id;//耳标号

    private String breeds;//品种

    private String area;//栏区

    private String Pigsty;//猪舍

    private Record record;//历史记录

    public Animal(String id, String breeds, String area, String pigsty) {
        this.id = id;
        this.breeds = breeds;
        this.area = area;
        Pigsty = pigsty;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBreeds() {
        return breeds;
    }

    public void setBreeds(String breeds) {
        this.breeds = breeds;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPigsty() {
        return Pigsty;
    }

    public void setPigsty(String pigsty) {
        Pigsty = pigsty;
    }
}
