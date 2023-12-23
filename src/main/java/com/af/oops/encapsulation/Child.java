package com.af.oops.encapsulation;

public class Child extends Parent{
    public static void main(String[] args) {
        Child child = new Child();
        int b = child.getA();
        System.out.println(b);

        child.setName("Siva");
        String name = child.getName();
        System.out.println(name);

    }
}
