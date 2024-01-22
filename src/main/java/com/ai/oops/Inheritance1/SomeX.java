package com.ai.oops.Inheritance1;

public class SomeX {

    public static void login(){
        System.out.println("Verify Login");
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.test2();
        int a = parent.a;

        Parent xyz = new Parent();

        login();
        Parent.automate();

    }
}
