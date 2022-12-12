package com.bootcoding.java.OPPs;

public class Application {
    public static void main(String[] args) {
    //Classname objectnamce = new classname();
        Marker marker = new Marker();

        //Access members of and object
        //objectName.memberName -- data members
        marker.brand = "Camlin";
        marker.type = "WhiteBoardMarker";
        marker.color = "BLUE";
        marker.price = 142.34;

//        objectName.membersMethod()
        marker.refill();
        marker.write("I am learning OOPs in Java");

//      calling print method
        marker.print();

        //craete object of car
        Car car =new Car();

        //Members of the car
        car.color = "Blue";
        car.model = "X3";
        car.brandName = "BMW";
        car.lights = 2;
        car.seats = 4;
        car.fuleType = "Pertol";

        //Properties of car
        car.startEngine();
        car.stopEngine();
        car.move();
        car.print();
    }
}
