package com.af.oops.inhertance;

public class Tiger extends Animal{

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.run();
        tiger.eat();

        Animal animal = new Animal();
        animal.eat();

        Animal animal1 = new Tiger();
        animal1.eat();

    }


    @Override
    public void eat(){
        System.out.println("Eat only Rabits");
    }

    public void run(){
        System.out.println("Tiger fastest runner");
    }
}
