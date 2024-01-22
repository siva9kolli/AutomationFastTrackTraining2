package com.af.oops.constructors;

public class AboutConstructor {

    static int i = 10;

    public AboutConstructor(){
        System.out.println("Testing");
    }

    public AboutConstructor(int i){
        this.i = i;
        //i = this.i;
        System.out.println("Integer Testing" + i);
    }

    public AboutConstructor(String s){
        System.out.println("String Testing");
    }

    public AboutConstructor(String s, String s1){
        System.out.println("String Testing");
    }



    public static void main(String[] args) {
        AboutConstructor ab = new AboutConstructor();
//        AboutConstructor ab1 = new AboutConstructor("Testing", "Selenium");
//        AboutConstructor ab2 = new AboutConstructor("Testing");
        AboutConstructor ab3 = new AboutConstructor(5 );

    }
}
