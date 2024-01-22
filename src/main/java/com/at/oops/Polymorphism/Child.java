package com.at.oops.Polymorphism;

public class Child extends Parent{

    public static void main(String[] args) {
        Child child = new Child();
        child.test1();
    }

    @Override
    public void test1(){
        int a = 10, b = 20;
        int c = a+b;
        System.out.println("c Value :: " + c);
        System.out.println("Test1 Updated Executing");
    }
}
