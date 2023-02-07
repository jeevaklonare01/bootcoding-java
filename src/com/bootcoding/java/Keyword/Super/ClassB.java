package com.bootcoding.java.Keyword.Super;

public class ClassB extends ClassA {
    void showB(){
        System.out.println("This is show B");
    }
    void show(){
        super.show();
        System.out.println("I am in show B");
    }
}
