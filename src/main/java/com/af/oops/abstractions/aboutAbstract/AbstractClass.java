package com.af.oops.abstractions.aboutAbstract;

public abstract class AbstractClass {

    public void test1(){
        int a=10, b=20;
        int c = a+b;
        System.out.println(c);
        System.out.println("Test1 Executing");
    }

    public abstract void test2();
}
