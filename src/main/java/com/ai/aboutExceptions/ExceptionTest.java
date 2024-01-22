package com.ai.aboutExceptions;

import java.io.File;

public class ExceptionTest {
    public static void main(String[] args) {

        int b, a = 5;
        try {
            b = a / 0;
            System.out.println(b);
        } catch (ArithmeticException ae){
            ae.printStackTrace();
        }

        System.out.println("Testing");
    }

}
