package com.ai.oops.multiLevelInheritance;

public class Child extends Parent{

    public void test2(){
        System.out.println("Test1 Executing");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.test2();

        //WebDriver driver = new ChromeDriver();
        //Animal animal = new Dog();
        Parent parent;
        parent = new Child();



        parent.test1();
    }
}
