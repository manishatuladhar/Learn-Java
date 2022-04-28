package com.company;

public class Classlaptop {
    public static void main(String[] args) {
        //Create a Class Laptop with properties [id, name, ram] and create 3 object of it and print all details.
        Laptopdetails l1 = new Laptopdetails();
        Laptopdetails l2 = new Laptopdetails();
        Laptopdetails l3 = new Laptopdetails();

        l1.id = "abc";
        l1.name = "HP";
        l1.ram = 4;
        l1.storage="gb";

        l2.id = "xyz";
        l2.name = "lenovo";
        l2.ram = 4;

        l3.id = "def";
        l3.name = "dell";
        l3.ram = 8;

        System.out.println("\nFirst laptop");
        System.out.println(l1.id);
        System.out.println(l1.name);
        System.out.println(l1.ram + l1.storage);

        System.out.println("\nSecond laptop");
        System.out.println(l2.id);
        System.out.println(l2.name);
        System.out.println(l2.ram +"gb");

        System.out.println("\nThird laptop");
        System.out.println(l3.id);
        System.out.println(l3.name);
        System.out.println(l3.ram +"gb");





    }



}

class Laptopdetails {
    String name;
    String id;
    int ram;
    String storage;
}