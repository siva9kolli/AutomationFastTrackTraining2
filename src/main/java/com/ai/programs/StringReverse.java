package com.ai.programs;

import javax.sound.midi.Soundbank;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Selenium";
        String lang = "malayalam";

//        char c[] = {'I','n','d','i','a'};
//        char c3[] = {'a','i','d','n','I'};

        char ch[] = str.toCharArray();

        System.out.println("ch length" + ch.length);
        System.out.println("str length" + str.length());
        for(char c2 : ch){
            System.out.println(c2);
        }

        System.out.println("***********************");
        for(int a=ch.length-1; a>=0; a--){
            System.out.println(ch[a]);
            System.out.println(str.charAt(a));
        }


        for(int b=0; b<lang.length(); b=b+2){
            System.out.println(lang.charAt(b));
        }

    }
}
