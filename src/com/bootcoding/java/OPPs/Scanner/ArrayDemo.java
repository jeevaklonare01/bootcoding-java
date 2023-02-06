package com.bootcoding.java.OPPs.Scanner;

import java.util.Scanner;

public class ArrayDemo {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of Array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number" + (i + 1));
            int number = sc.nextInt();
            numbers[i] = number;
        }
        printArray(numbers);
    }
    private static void printArray(int[] numbers){
        for(int i=0; i< numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}

