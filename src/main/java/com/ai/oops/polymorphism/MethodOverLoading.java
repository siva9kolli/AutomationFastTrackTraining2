package com.ai.oops.polymorphism;

public class MethodOverLoading {
    public static void main(String[] args) {
        MethodOverLoading methodOverLoading = new MethodOverLoading();
        methodOverLoading.register("Siva", 5, 23423);
    }

    public void register(String firstName, int rollNumber){
        System.out.println("firstName :: " + firstName);
        System.out.println("rollNumber :: " + rollNumber);
    }

    public void register(String lastName, int rollNumber, int phoneNumber){
        System.out.println("lastName :: " + lastName);
        System.out.println("rollNumber :: " + rollNumber);
        System.out.println("phoneNumber :: " + phoneNumber);
    }

    public int sum(int a, int b){
        return a+b;
    }

    public double sum(double a, int b){
        return a+b;
    }

    public void total(int a, int b){
        System.out.println(a+b);
    }

    public void total(int a, float b){
        System.out.println(a+b);
    }

    public void total(int a, int b, int c){
        System.out.println(a+b+c);
    }
}
