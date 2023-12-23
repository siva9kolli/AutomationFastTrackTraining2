package com.af.oops.abstractions.aboutAbstract;

public class Child extends Parent{
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = new Parent();
      //WebDriver driver = new ChromeDriver();
        Parent child1 = new Child();

        parent.testLogin();
        child1.testLogin();

        child.testLogin();
    }

    @Override
    public void testLogin(){
        System.out.println("Login success");
    }

    public void testPayment(){
        System.out.println("Payment success");
    }
}
