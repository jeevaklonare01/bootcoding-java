package com.bootcoding.java.OPPs.Assignment.Discount.service;

import com.bootcoding.java.OPPs.Assignment.Discount.Customer;
import com.bootcoding.java.OPPs.Assignment.Discount.NameGenerator;
import com.bootcoding.java.OPPs.Assignment.Discount.OrderCountGenerator;
import com.bootcoding.java.OPPs.Assignment.Discount.VisitCountGenerator;

import java.util.UUID;

public class CustomerService {
    private static final int LIMIT = 100;
    public Customer[] getAllCustomers(){
        Customer[] customers = new Customer[LIMIT];
        for(int i = 0; i<LIMIT;i++){
            Customer customer = buildCustomer();
            customers[0] = customer;
        }
        return customers;
    }
    private Customer buildCustomer(){
        Customer customer = new Customer();
        customer.setId(UUID.randomUUID());
        customer.setName(NameGenerator.getName());
        customer.setOrderCount(OrderCountGenerator.getOrderCount());
        customer.setVisitCount(VisitCountGenerator.getVisitCount());
        return customer;
    }
}