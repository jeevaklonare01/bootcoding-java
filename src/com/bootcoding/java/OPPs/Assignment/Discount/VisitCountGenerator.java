package com.bootcoding.java.OPPs.Assignment.Discount;

import java.util.Random;

public class VisitCountGenerator {
    private final static int MAx =1000;
    private final static int MIN = 1;
    private static Random random = new Random();

    public static int getVisitCount(){
        return MIN + random.nextInt(MAx-MIN);

}
