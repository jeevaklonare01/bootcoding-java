package com.bootcoding.java.Keyword.Super;

public class C extends B{
    C(){
        System.out.println("Default constructor from A");
    }
    C(int n){
        super(200);
        System.out.println("Parameterized constructor from A");
    }
}
