package com.ai.aboutExceptions;

import java.rmi.server.ExportException;

public class ExceptionsTest1 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};

        try{
            int c = a[3];
            System.out.println(c);
        }catch (Exception e){
            e.printStackTrace();
           int d = a[4];
            System.out.println(d);
        }
        System.out.println("Testing");


        try{
            int e = 5/0;
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
