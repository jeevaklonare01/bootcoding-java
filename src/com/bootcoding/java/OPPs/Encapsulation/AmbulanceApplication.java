package com.bootcoding.java.OPPs.Encapsulation;

public class AmbulanceApplication {
    public static void main(String[] args) {
        Ambulance ambulance = new Ambulance();
        ambulance.setHospitalName("Seven Star Hospital");
        ambulance.setType("Mini");
        ambulance.setCharges(500.00);
        ambulance.setAvailable(true);

        System.out.println("Ambulance Info");
        System.out.println("Hospital Name : "+ ambulance.getHospitalName());
        System.out.println("Ambulance Type : "+ ambulance.getType());
        System.out.println("Charges For Ambulance : "+ ambulance.getCharges());
        System.out.println("Availabillity : "+ ambulance.getCharges());
    }
}
