package com.bootcoding.java.Collection.map;

public class Laptop implements Comparable<Laptop> {
    private String brand;
    private int ram;
    private double price;

    public Laptop() {
    }

    public Laptop(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }


    @Override
    public int compareTo(Laptop laptop) {
        if(this.getRam()>laptop.getRam()){
            return 1;
        }else{
            return  -1;
        }
    }
}
