package com.bootcoding.java.Method;

public class YearsToDays {
    public static int convertYearsIntoDays(int years){
        return years*360;
    }

    public static void main(String[] args) {
        int years = 5;//input value as you want
        int days = convertYearsIntoDays(years);
        if(years>=0) {
            System.out.println(days);
        }
        else {
            System.out.println("Output is negative");
        }
    }
}
