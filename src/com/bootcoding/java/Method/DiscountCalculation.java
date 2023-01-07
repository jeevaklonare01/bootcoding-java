package com.bootcoding.java.Method;

public class DiscountCalculation {

    public static void main(String[] args) {
        int[] freOfShopping = {10,5,7,2,0,9};
        int[] discountResult = calculateDiscount(freOfShopping);
        for(int i =0 ;i< freOfShopping.length; i++) {
            System.out.println(freOfShopping[i] + "->"+discountResult[i]+"%");
        }

    }
    public static int[] calculateDiscount(int[] freOfShopping){
        int[] discounts = new int[freOfShopping.length];
        for(int i=0; i < freOfShopping.length; i++){
            int discount;
            int shopping = freOfShopping[i];
            discount = getDiscount(shopping);
            discounts[i] = discount;
        }
        return discounts;
    }

    private static int getDiscount(int shopping){
        int discount;
        if (shopping >= 8){
            discount = 50;
        } else if (shopping >= 5) {
            discount = 30;
        }
        else if (shopping >= 2){
            discount = 10;
        }
        else {
            discount = 0;
        }
        return discount;
    }
}
