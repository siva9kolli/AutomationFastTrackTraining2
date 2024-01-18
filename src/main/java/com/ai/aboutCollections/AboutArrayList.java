package com.ai.aboutCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AboutArrayList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Selenium");
        list.add(4.0);
        list.add('A');
        list.add(2);
        list.add(true);
        list.add("Selenium");

        for(Object l : list){
            System.out.println(l);
        }

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        ArrayList arrayList = new ArrayList();
        arrayList.add("Appium");
        arrayList.add(2.0);
        arrayList.add('S');
        arrayList.add(4);
        arrayList.add(true);
        arrayList.add("Appium");

        for(int i=0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }
}
