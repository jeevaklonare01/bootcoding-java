package com.bootcoding.java.Keyword;

import com.bootcoding.java.OPPs.Marker;

public class FinalKeyword {
    public static void main(String[] args) {
        /*
        * final keyword is used to create constant variable.
        * final variable can not be modified once it is initialized
         */
        final int a = 10;
        //a=20; not allowed
        //a=30; not allowed
        final double PI = 3.14;
        //PI = 2.14 not allowed
//        final keyword to object (reference variable)
        final Marker blueMaker = new Marker();
//        blueMaker=new Marker(); not allowed
//        It is allowed to change properties of an object
        blueMaker.color = "blue";
//        blueMaker.color = "red";
    }
}
