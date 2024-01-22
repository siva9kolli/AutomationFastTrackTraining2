package com.ai.oops.polymorphism;

public class Child extends Parent{

    public static void main(String[] args) {
        Child child = new Child();
        child.register("Dev", 13213);
    }

    @Override
    public void register(String name, int rollNumber){
        System.out.println("Automation Testing");
        System.out.println("QA Author :: " + name + " && roll number :: " + rollNumber);
    }
}
