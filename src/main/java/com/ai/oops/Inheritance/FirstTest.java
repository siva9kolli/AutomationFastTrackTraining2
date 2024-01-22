package com.ai.oops.Inheritance;

public class FirstTest {

    public int a =10; // variable

    public static void main(String[] args) {
        FirstTest firstTest = new FirstTest(); // object
        firstTest.test();
        System.out.println(firstTest.a);
    }

    /**
     * test method
     */
    public void test(){
        System.out.println("Automation Testing");
    }
}
