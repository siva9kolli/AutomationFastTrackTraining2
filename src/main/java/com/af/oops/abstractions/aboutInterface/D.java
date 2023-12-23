package com.af.oops.abstractions.aboutInterface;

public class D extends C{
    public void testD(){
        System.out.println("TestD");
    }

    public static void main(String[] args) {
        D d = new D();
        d.testA();
        d.testB();
        d.testC();
        d.testD();
    }
}
