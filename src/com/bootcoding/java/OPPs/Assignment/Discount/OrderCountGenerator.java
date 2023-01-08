package com.bootcoding.java.OPPs.Assignment.Discount;

import java.util.Random;

public class OrderCountGenerator {

    private final static int MAx =1000;
    private final static int MIN = 1;
    private static Random random = new Random();

    public static int getOrderCount(){
        return MIN + random.nextInt(MAx-MIN);
    }
}
