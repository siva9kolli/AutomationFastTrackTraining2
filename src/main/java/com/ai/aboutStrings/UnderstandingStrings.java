package com.ai.aboutStrings;

public class UnderstandingStrings {

    public static void main(String[] args) {


        String city = "Mumbai";
        String southCity = new String("Vizag");

        String city1 = "Mumbai";
        String southCity1 = new String("Vizag");
        String northCity1 = new String("Mumbai");

        //comparsions
        System.out.println(city1 == northCity1); //false
        System.out.println(city1.equals(northCity1)); //true
        System.out.println(city1 == city); // true

        System.out.println("northCity :: " + city +  " and southCity :: " + southCity);

        // understand immutable
        String location = "Madhapur";
        location.concat(", HitechCity");
        System.out.println(location);
        System.out.println(location.concat(", Hitech City"));

        String location2 = location + ", Hyderabad";
        System.out.println(location2);

        StringBuilder sb = new StringBuilder("Hyderabad");
        sb.append(", Telangana");

        StringBuffer sb1 = new StringBuffer("Vizag");
        sb1.append(", Andhra Pradesh");

        System.out.println(sb);
        System.out.println(sb1);
    }
}
