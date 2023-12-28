package com.ai.oops.Inheritance1;

public class SimpleTest {
    public int a =10;
    public String s = "Hyderabad";
    public char c = 'T';
    public boolean b = true;
    public double d = 12.6;
    public float f = 12.6f;

    public boolean isElementDisplayed(){
        return true;
    }

    public String getWelcomeMessage(){
        return s;
    }

    public int totalValue(){
        return 5;
    }

    public void login(){
        System.out.println("Enter creds and click on submit");
    }

    public static void bookTicket(){
        System.out.println("Book Ticket");
    }

    public static void main(String[] args) {
        SimpleTest simpleTest = new SimpleTest();
        int b = simpleTest.a;
        String s1 = simpleTest.s;

        System.out.println(b);
        System.out.println(s1);

        System.out.println(simpleTest.a + simpleTest.d);

        simpleTest.login();
        boolean b1 = simpleTest.isElementDisplayed();
        System.out.println(b1);
        String s2 = simpleTest.getWelcomeMessage();
        System.out.println(s2);
        int c = simpleTest.totalValue();
        System.out.println(c);

        bookTicket();


    }
}
