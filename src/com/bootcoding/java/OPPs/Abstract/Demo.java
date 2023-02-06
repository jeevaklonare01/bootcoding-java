package com.bootcoding.java.OPPs.Abstract;

public class Demo {
    public static void main(String[] args) {
        Magic m = new Magic();
        Idea idea = new Idea();
        Airtel airtel = new Airtel();
        Jio jio = new Jio();
        m.showMagic(idea);
        m.showMagic(airtel);
        m.showMagic(jio);
    }
}
