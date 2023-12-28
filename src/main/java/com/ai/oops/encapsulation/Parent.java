package com.ai.oops.encapsulation;

public class Parent {

    private int phoneNumber = 124236784;
    private String name = "Hyderabad";

    private String email;

    public void setEmail(String email_test){
        this.email = email_test;
    }

    public String getEmail(){
        return email;
    }

    public int getValue(){
        return phoneNumber;
    }

    public String getName(){
        return name;
    }



}
