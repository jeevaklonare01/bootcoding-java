package com.bootcoding.java.OPPs.Collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample2 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        list.add(new Person("Raja",22,2633193));
        list.add(new Person("Banti",31,1234567));
        list.add(new Person("Babli",23,7654321));
        list.add(new Person("Babu",42,76543102));
        //traditional loop
        /*        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }*/

        //for each loop
        /*for(Person person:list){
            System.out.println(person);
        }*/

        //Using Iterator
        /*Iterator<Person> personIterator = list.iterator();
        while(personIterator.hasNext()){
            System.out.println(personIterator.next());
        }*/

        list.forEach(person -> System.out.println(person));
    }
}
