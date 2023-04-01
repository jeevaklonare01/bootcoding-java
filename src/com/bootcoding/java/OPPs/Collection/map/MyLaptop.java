package com.bootcoding.java.OPPs.Collection.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyLaptop {

    public static void main(String[] args) {
        List<Laptop> list= new ArrayList<Laptop>();
        list.add(new Laptop("Dell",16,1200));
        list.add(new Laptop("Lennovo",32,1800));
        list.add(new Laptop("Hp",8,1000));
        list.add(new Laptop("Asus",64,3000));

        Collections.sort(list);

        for(Laptop laptop:list){
            System.out.println(laptop);
        }
    }
}
