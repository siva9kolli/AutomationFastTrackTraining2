package com.ai.oops.Inheritance1;

public class Child extends Parent{

    public static void main(String[] args) {
        Child child = new Child();
        child.test2();
        child.test3();


        int a = child.a;
        System.out.println(a);
        String s = child.s;
        System.out.println(s);

        Parent.automate();

    }

    public void verifySuccessMessage(){
        System.out.println("Success Message");
    }
}
