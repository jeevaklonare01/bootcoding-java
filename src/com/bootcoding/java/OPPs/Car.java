package com.bootcoding.java.OPPs;

public class Car {
    String color;
    String model;
    String brandName;
    int lights;
    int seats;
    String fuleType;

    public void startEngine(){
        System.out.println("Car has Started");

    }
    public void stopEngine(){
        System.out.println("Car has Stoped");

    }
    public void move(){
        System.out.println("Car is Moving");

    }
    public void print(){
        System.out.println("Color of the car is : " +color);
        System.out.println("Model of the car is : " +model);
        System.out.println("Brand of the car is : " +brandName);
        System.out.println("Number of lights Present in Car is : "+lights);
        System.out.println("Number of seats Present in Car is : "+seats);
        System.out.println("Type of fule used in Car is : "+fuleType);
    }
}
