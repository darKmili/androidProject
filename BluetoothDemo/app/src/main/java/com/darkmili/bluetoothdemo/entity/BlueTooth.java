package com.darkmili.bluetoothdemo.entity;

public class BlueTooth {
    private String name;
    private String MACAddress;

    public BlueTooth(String name, String MACAddress) {
        this.name = name;
        this.MACAddress = MACAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMACAddress() {
        return MACAddress;
    }

    public void setMACAddress(String MACAddress) {
        this.MACAddress = MACAddress;
    }

    @Override
    public String toString() {
        return "BlueTooth:" + "name='" + name  + "', MACAddress='" + MACAddress+ "'";
    }
}
