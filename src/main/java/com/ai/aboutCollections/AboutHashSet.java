package com.ai.aboutCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AboutHashSet {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("Selenium");
        set.add(4.0);
        set.add('A');
        set.add(2);
        set.add(true);
        set.add("Appium");
        set.add("Selenium");
        set.add("Zelenium");

        System.out.println(set);
    }
}
