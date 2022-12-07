package com.bootcoding.java;

public class SumOfArrayElements {
    public static void main(String[] args) {
            int arr[]={10,20};
        int res = calculateSumOfArray(arr);
    }
    public static int calculateSumOfArray(int[] array){
        int sum=0;
        for (int i =0; i<array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
                System.out.println(sum);
            }
        }
        return sum;
    }
}