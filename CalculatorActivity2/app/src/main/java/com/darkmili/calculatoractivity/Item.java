package com.darkmili.calculatoractivity;

public class Item {
    //数字
    private  String number;

    //运算符
    private  String sign;

    public Item(String number, String sign) {
        this.number = number;
        this.sign = sign;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
