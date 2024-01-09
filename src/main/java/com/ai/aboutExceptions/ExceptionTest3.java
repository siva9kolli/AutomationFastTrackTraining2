package com.ai.aboutExceptions;

public class ExceptionTest3 {
    public static void main(String[] args) {
        try {
            testRegister();
        } catch (ArithmeticException ae){
            ae.printStackTrace();
        }

        try {
            sleep();
        } catch (Exception e){
            e.printStackTrace();
        }

        lognSleep();

        System.out.println("Testing");
    }

    public static void sleep() throws InterruptedException {
        Thread.sleep(2000);
    }

    public static void lognSleep(){
        try{
            Thread.sleep(5000);
        }catch ( Exception e){

        }
    }

    public static void testRegister() throws ArithmeticException {
            int a = 5/0;
    }


    public static void testLogin() {
        try{
            int a = 5/0;
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
