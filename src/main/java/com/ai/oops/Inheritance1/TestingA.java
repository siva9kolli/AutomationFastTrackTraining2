package com.ai.oops.Inheritance1;

public class TestingA {
    int a = 10;

    public void login(){
        System.out.println("Login");
    }

    public int sum(){
        int a1 = 10, a2 = 10, a3;
        a3 = a1+a2;
        System.out.println(a3);
        return a3;
    }

    public static void main(String[] args) {
        TestingA testingA = new TestingA();
        testingA.login();

        int b = testingA.a;
        System.out.println(b);

        int c = testingA.sum();
        System.out.println(c);
    }
}
