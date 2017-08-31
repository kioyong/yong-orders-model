package com.yong.orders.model;

import java.time.LocalDate;

/**
 * Created by LiangYong on 2017/8/31.
 */
public class Person {

    public enum Sex{
        MALE,FEMALE
    }
    private String namue,emailAddress;
    private LocalDate birthday;
    private Sex gender;

    public String getNamue() {
        return namue;
    }

    public void setNamue(String namue) {
        this.namue = namue;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }
    public void printPerson(){

    }

    @Override
    public String toString() {
        return "Person{" +
                "namue='" + namue + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", birthday=" + birthday +
                ", gender=" + gender +
                '}';
    }
    public Person(){}

}
