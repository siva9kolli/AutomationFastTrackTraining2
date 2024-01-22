package com.af.oops.Encapsulation;

public class Child extends Parent{
    public static void main(String[] args) {
        Child child = new Child();
      //  int b = child.a;
       // System.out.println(b);

        child.setValue(5);
        int c = child.getValue();
        System.out.println(c);
    }
}
