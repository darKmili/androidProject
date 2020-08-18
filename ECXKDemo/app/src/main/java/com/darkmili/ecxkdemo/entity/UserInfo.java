package com.darkmili.ecxkdemo.entity;



public class UserInfo {
   private String name;
   private String date;

    public UserInfo(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
