package com.at.oops.Polymorphism;

public class MethodOverLoading {

    public static void main(String[] args) {
        MethodOverLoading methodOverLoading = new MethodOverLoading();
      //  methodOverLoading.sum(2.5,3);

        int d = methodOverLoading.sum(1,2,3,4);
        System.out.println(d);

        methodOverLoading.sum(1,1,1);
    }

    public int sum(int a, int b, int c, int d){

        return a+b+c+d;
    }

    public double sum(int a, double b, int g){
        System.out.println(a+b);
        return a+b;
    }

    public void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public void sum(int a, int b){
        System.out.println(a+b);
    }

    public void sum(int a, double b){
        System.out.println(a+b);
    }
    public void sum(double a, int b){
        System.out.println(a+b);
    }

}
