package com.bootcoding.java.OPPs.Assignment.Discount;

import java.util.Random;

public class NameGenerator {
    private static String[] CUSTOMER_NAMES =
            {"Ramesh","Suresh","Jayesh","Ganesh",
                    "Mahesh","Rajesh","Mitesh","Dinesh",
                    "Pooja","Priya","Pinky",};

    private static final Random random = new Random();
    public static String getName(){
        int randomIndex = random.nextInt(CUSTOMER_NAMES.length);
        return CUSTOMER_NAMES[randomIndex];
    }
}
