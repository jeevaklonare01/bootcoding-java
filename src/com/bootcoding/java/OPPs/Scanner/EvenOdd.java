package com.bootcoding.java.OPPs.Scanner;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number");
        long value = sc.nextLong();
        boolean res =isEven( value);
        if(res){
            System.out.println(value + "is Even Number");}
            else{
                System.out.println(value + "is Odd Number");
            }
        }
    public static boolean isEven(long value){
        return value % 2 ==0;
    }
}
