package com.af.oops.polymorphism;

public class MethodOverloading {

    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.sum(1,1,1);
        methodOverloading.sum(12, 7.5);
        methodOverloading.sum(1,2);
    }

    public void sum(int a, int b){
        int c = a+b;
        System.out.println("c value :: " + c);
    }

    public void sum(int a, int b, int d){
        int c = a+b+d;
        System.out.println("c value :: " + c);
    }

    public void sum(int a, double b){
        double c = a+b;
        System.out.println("c value :: " + c);
    }
}
