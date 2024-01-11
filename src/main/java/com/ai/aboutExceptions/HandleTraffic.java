package com.ai.aboutExceptions;

public class HandleTraffic extends HugeTraffic{

    public HandleTraffic(String name) {
        super(name);
    }

    public static void main(String[] args) throws HugeTraffic {
        //waitForElement();
        //sleep();
        if("Hyderabad" == "Hyderbad"){
            throw new HugeTraffic("Takes long time to reach destination");
        }

    }


    public static void sleep() throws InterruptedException {
        // Thread.sleep(1000);
        try {
            int i = 5 / 0;
            // throw new ArithmeticException("Please correct");
        } catch (NullPointerException ie) {
            System.out.println(ie.toString());
            System.out.println("Test");
        }
    }

    public static void waitForElement() throws InterruptedException {

        int a = 10, b;
        Thread.sleep(5000);

        try {
            //Thread.sleep(5000);b = a / 0;
            b = a / 0;
            throw new ArithmeticException("Test ArithmeticException");
        } catch (ArithmeticException e) {
            System.out.println("Catch Test");
        }
        System.out.println("Test");


    }
}
