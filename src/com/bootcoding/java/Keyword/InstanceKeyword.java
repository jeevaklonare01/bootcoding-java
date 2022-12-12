package com.bootcoding.java.Keyword;

import com.bootcoding.java.OPPs.Marker;

public class InstanceKeyword {
    public static void main(String[] args) {
        Marker blueMarker = new Marker();
        blueMarker.color = "BLUE";
        blueMarker.print();
        Marker redMarker = new Marker();
        redMarker.color = "RED";
        redMarker.print();
        Marker greenMarker = new Marker();
        greenMarker.color = "GREEN";
        greenMarker.print();
        Marker blackMarker = new Marker();
        blackMarker.color = "BLACK";
        blackMarker.print();
    }
}
