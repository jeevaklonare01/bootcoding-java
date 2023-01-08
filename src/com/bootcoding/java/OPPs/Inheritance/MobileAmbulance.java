package com.bootcoding.java.OPPs.Inheritance;

import com.bootcoding.java.OPPs.Encapsulation.Ambulance;

public class MobileAmbulance extends Ambulance {
//    parent protected property becomes -> private to child class
    public void assignCharges(){
        charges = 100;
    }
}
