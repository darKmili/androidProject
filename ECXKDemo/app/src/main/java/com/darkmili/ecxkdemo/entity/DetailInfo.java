package com.darkmili.ecxkdemo.entity;

/**
 * @author Administrator
 * @title: DetailInfo
 * @projectName ECXKDemo
 * @description: 用于产品介绍列表
 * @date 2020/8/2413:55
 */
public class DetailInfo {
    private int imageId;
    private String text;

    public DetailInfo(int imageId, String text) {
        this.imageId = imageId;
        this.text = text;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
