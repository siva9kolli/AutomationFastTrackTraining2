package com.af.oops.abstractions.aboutInterface;

public class InterfaceImplementation implements SampleInterface{

    @Override
    public void test1() {
        System.out.println("Test1");
    }

    @Override
    public void test2() {
        System.out.println("Test1");
    }

    @Override
    public String test3() {
        return "Test3";
    }

    @Override
    public int test4() {
        return 5;
    }
}
