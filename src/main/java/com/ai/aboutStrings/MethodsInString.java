package com.ai.aboutStrings;

public class MethodsInString {
    public static void main(String[] args) {
        String str = "Automation";

        boolean b = str.contains("Auto");
        boolean b1 = str.startsWith("Auto");
        boolean b2 = str.endsWith("tion");

        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);


        String name = "QA Automation";
        String names[] = name.split(" ");
        System.out.println(names[0]);
        //System.out.println(names[1]);
        System.out.println(name.substring(0,3));

        String firstName = "Siva    ";
        String lastName = "Selenium    ";
        System.out.println(firstName);
        System.out.println(firstName.trim());

        String value = "$500";
        String value1 = "$400";
        System.out.println(value.replace("$", ""));
        String actualValue  = value.replace("$", "");
        String actualValue1  = value1.replace("$", "");

        System.out.println(actualValue + actualValue1);

        int a = Integer.parseInt(actualValue);
        int c = Integer.parseInt(actualValue1);

        System.out.println(a+c);

        int d = a+c;
        String sd = String.valueOf(d);
        System.out.println(sd + 1);






    }
}
