package com.mybank.model;

public class Address {
    private String city;
    private String state;
    private Integer pinCode;

    public void setCity(){
        this.city = city;
    }
    public String getCity(String city){
        return city;
    }

    public void setState(){
        this.state = state;
    }
    public String getState(String state){
        return state;
    }

    public void setPinCode(){
        this.pinCode = pinCode;
    }
    public Integer getPinCode(Integer pinCode){
        return pinCode;
    }


}
