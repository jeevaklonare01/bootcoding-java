package com.bootcoding.java;
//using return in this statement is better than using if
public class CheckValue {

    public static void main(String[] args) {
      boolean result = checkValue(0.2,50,9);
        System.out.println(result);
    }
        public static boolean checkValue(double prob, int prize, int pay){
        return prob*prize>pay;
        }
    }


