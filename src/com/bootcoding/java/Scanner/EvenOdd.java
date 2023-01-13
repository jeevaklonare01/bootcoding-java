package com.bootcoding.java.Scanner;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number");
        int value = sc.nextInt();

        if(value % 2 == 0){
            System.out.println(value+" is Even Number");
        }else{
            System.out.println(value+" is Odd Number");
        }
    }
}
