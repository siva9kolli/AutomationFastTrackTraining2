package com.at.oops.Inheritance;

public class Child extends Parent{

    public static void main(String[] args) {
        Child child = new Child();
        child.testA();

        Parent parent= new Parent();
        parent.testA();

        int b = child.a;
        String s1 = child.s;

        System.out.println(b);
        System.out.println(s1);

        Parent.testB();
    }
}
