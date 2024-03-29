package com.bootcoding.java.Collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample1 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("Raju");
        list.add("Banti");
        list.add("Babli");
        list.add("Babu");
        list.add("Babu");
        list.add("Babu");
        list.add("Jai");
        list.add("Raju");
        //traditional loop
        /*for (int i = 0 ; i< list.size();i++){
            System.out.println(list.get(i));
        }*/
        //for each loop
        /*for (String str:list){
            System.out.println(str);
        }*/
        //Using Iterator
        /*
        Iterator<String> stringIterator = list.iterator();
            while(stringIterator.hasNext()){
                System.out.println(stringIterator.next());
            }*/
        list.forEach(s -> System.out.println(s));
        }
}