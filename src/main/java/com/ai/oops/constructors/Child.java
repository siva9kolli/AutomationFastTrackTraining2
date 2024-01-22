package com.ai.oops.constructors;

public class Child extends Parent{

    public Child(){
        System.out.println("Child Constructor");
    }

    public Child(String name){
        super("Appium");
        System.out.println("My name is :: " + name);
    }

    public static void main(String[] args) {
        Child child = new Child("Selenium");
       // Parent parent = new Child();
    }
}
