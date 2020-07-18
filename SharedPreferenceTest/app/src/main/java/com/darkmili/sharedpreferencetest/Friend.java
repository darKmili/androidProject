package com.darkmili.sharedpreferencetest;



public class Friend {

    private Integer image_id;
    private String username;

    public Friend(int image_id, String username) {
        this.image_id = image_id;
        this.username = username;
    }

    public Integer getImage_id() {
        return image_id;
    }

    public void setImage_id(Integer image_id) {
        this.image_id = image_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
