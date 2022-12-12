package com.bootcoding.java.OPPs;

public class ObjectAssignment {

    public static void main(String[] args) {
        //primitive data types
        int a = 10;
        int b = a; //b <- a (value of a)
        b = 30; //b - change but not changing a
        System.out.println("A ki value"+a);
        System.out.println("B ki value"+b);

        //ADT -Abstract Data Type (Object)
        Marker blueMarker = new Marker();
        Marker redMarker = blueMarker;// redMarker <- BlueMarker (reference)
        blueMarker.color = "Blue";
        redMarker.color = "Red";
        System.out.println("Blue Marker ki Value"+blueMarker.color);
        System.out.println("Red Marker ki Value"+redMarker.color);

    }

    }


