package com.af.oops.polymorphism;

public class ChildB extends ParentA{

    public static void main(String[] args) {
        ChildB childB = new ChildB();
        childB.testA();
        childB.total(1,1);
    }

    @Override
    public void testA(){
        System.out.println("Automation Suite");
        System.out.println("TestA Executing");
    }


    @Override
    public void total(int a, double b){
        double c = a*b;
        System.out.println("c :: " + c);
    }


}
