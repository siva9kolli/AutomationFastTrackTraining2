package com.ai.programs;

public class Loops {
    public static void main(String[] args) {

        int a[] = {1,2,3,4,5,5,6,6,7,7,7};
        int c[] = {5,6,7,7,7};


        for(int i=0; i<c.length; i++){
            System.out.println("i value :: " + i);
            System.out.println(c[i]);
        }

        for(int c1 : a){
            System.out.println(c1);
        }

        int j = 1;
        System.out.println("************");
        while (j<6){
            j++;
            System.out.println(j);
        }


    }
}
