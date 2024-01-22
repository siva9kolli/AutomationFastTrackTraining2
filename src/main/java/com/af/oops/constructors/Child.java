package com.af.oops.constructors;

public class Child extends Parent{

    public Child(){
        super("Hyderabad");
        System.out.println("Child Constructor");
    }

    public Child(int a){
        this();
        System.out.println("Child Constructor with int :: " + a);
    }

    public static void main(String[] args) {
        Child child = new Child(5);
        child.test1();
    }
}
