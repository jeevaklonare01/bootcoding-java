package com.bootcoding.java.OPPs.Inheritance;

import com.bootcoding.java.OPPs.Encapsulation.Ambulance;

public class Application {
    public static void main(String[] args) {
        MobileAmbulance ma = (MobileAmbulance) new Ambulance();
        //ma.charges // not accessible here
        ma.assignCharges();
    }
}
