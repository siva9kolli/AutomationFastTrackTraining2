package com.ai.oops.encapsulation;

public class Child extends Parent{

    public static void main(String[] args) {
        Child c = new Child();
        int b = c.getValue();
        System.out.println(b);
        System.out.println(c.getName());

        c.setEmail("siva@yopmail.com");
        String s1 = c.getEmail();
        System.out.println("S1 value :: "  + s1);

    }
}
