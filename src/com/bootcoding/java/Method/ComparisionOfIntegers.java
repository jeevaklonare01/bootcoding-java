package com.bootcoding.java.Method;

public class ComparisionOfIntegers {
    public static void main(String[] args) {
        boolean result = getReturnValue(3,7);
        System.out.println(result);
    }
    public static boolean getReturnValue(int a , int b){
        return ((a + b) == 10 || a == 10 || b == 10);
    }
}
