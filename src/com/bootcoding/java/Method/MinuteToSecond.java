package com.bootcoding.java.Method;

public class MinuteToSecond {

    public static int convertToSeconds(int minutes){
        return minutes*60;
    }

    public static void main(String[] args) {
        int minutes = 10;
        int seconds = convertToSeconds(minutes);
        System.out.println( minutes+" minutes are " + seconds + " seconds ");
    }
}
