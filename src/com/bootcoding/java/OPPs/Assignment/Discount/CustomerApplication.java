package com.bootcoding.java.OPPs.Assignment.Discount;

import com.bootcoding.java.OPPs.Assignment.Discount.service.CustomerService;
import com.bootcoding.java.OPPs.Assignment.Discount.service.DiscountService;

public class CustomerApplication {
    public static void main(String[] args) {

        DiscountService discountService = new DiscountService();
        Discount[] allCustomersDiscount = discountService.getAllCustomersDiscount();

        for(int i = 0; i < allCustomersDiscount.length; i++){
            Discount discount = allCustomersDiscount[i];
            System.out.println("Name:" + discount.getCustomerName() + " got " + discount.getDiscount() + " discount!");
        }
    }
}
