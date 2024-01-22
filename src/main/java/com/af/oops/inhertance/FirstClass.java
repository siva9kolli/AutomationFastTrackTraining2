package com.af.oops.inhertance;

public class FirstClass {

    /*
    - class name : start with Uppercase
    - ex: TestAutomation
    - method name: starts with lowerCase
    - ex: loginAsAdmin
     */
    public void testA(){
        System.out.println("TestA Pass");
    }

    public static void testB(){
        System.out.println("TestB Pass");
    }


    public static void main(String[] args) {
        System.out.println("Hello Java");
        int i = 10;
        String str = "Hyderabad";
        char c = 'A';
        boolean b = true;
        double d = 12.8;
        float f = 12.6f;

        System.out.println("I'm in " + str);

        FirstClass firstClass = new FirstClass();
        firstClass.testA();

        testB();
    }

}
