package com.yong.orders.model;

/**
 * Created by yong.a.liang on 6/21/2017.
 */
public class Address {
    private String add;
    private String location;
    private String country;

    public String getLocation() {
        return location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

//    public Address(String add,String location, String country){
//        this.add=add;
//        this.location=location;
//        this.country=country;
//    }
//    public Address(){}
}
