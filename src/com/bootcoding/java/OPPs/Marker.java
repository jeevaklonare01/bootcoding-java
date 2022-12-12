package com.bootcoding.java.OPPs;

public class Marker {
    //Data Member
    String type;
    String brand;
    public String color;
    double price;

    //Member Methods

    /**
     Documentation comment
     */

    public void refill(){

    }
    public void write(String message){
        System.out.println("On White Board - " + message);
    }
    public void print(){
        System.out.println("Marker Brand : "+ brand);
        System.out.println("Marker type : "+ type);
        System.out.println("Marker Color : "+ color);
        System.out.println("Marker Price : "+ price);
    }
}
