package com.ai.aboutArrays;

public class UnderstandArrays {
    public static void main(String[] args) {
        String city = "Chennai";

        //String cities[] = {"Mumbai", "Hyderabad", "Chennai", "Vizag"};

        String cities1[][] = {{"Mumbai", "Hyderabad", "Chennai", "Vizag"},
                              {"Bangalore", "Kolkata", "Delhi", "Pune"}};

        //System.out.println(cities[0]);
        System.out.println(cities1[0][0]);
        System.out.println(cities1[1][0]);
        System.out.println(cities1[1][2]);

    }
}
