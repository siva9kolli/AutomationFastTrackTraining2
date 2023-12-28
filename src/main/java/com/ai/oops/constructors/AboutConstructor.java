package com.ai.oops.constructors;

public class AboutConstructor {

    public AboutConstructor() {
        System.out.println("Constructor starts");
    }

    public AboutConstructor(int a, int b) {
        int c = a + b;
        System.out.println("c ::" + c);
        System.out.println("Parameterized Constructor");
    }


    public static void main(String[] args) {
        AboutConstructor child;
        AboutConstructor child1;
        child = new AboutConstructor();
        child1 = new AboutConstructor(5,6);

        child.test1();
    }

    public void test1() {
        System.out.println("Test 1 Testing");
    }

}
