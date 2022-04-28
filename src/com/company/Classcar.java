package com.company;

public class Classcar {
    public static void main(String[] args) {
        // Car Info 1
        System.out.println("Car info 1 ");
        carInfo c1= new carInfo();
        c1.brand = "Audi";
        c1.colour = "Red";
        c1.model = "SUV";
        c1.year = 2022;
        System.out.println(c1.brand);
        System.out.println(c1.colour);
        System.out.println(c1.model);
        System.out.println(c1.year);

        // Car info 2

        System.out.println("Car info 2");
        carInfo c2= new carInfo();
        c2.brand = "BMW";
        c2.colour = "Red";
        c2.model = "Sedan";
        c2.year = 2020;
        System.out.println(c2.brand);
        System.out.println(c2.colour);
        System.out.println(c2.model);
        System.out.println(c2.year);



    }
}
class carInfo {
    String colour;
    String brand;
    int year;
    String model;

}


