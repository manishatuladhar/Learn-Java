package com.company;

public class Laptopinheritance {
    public static void main(String[] args) {
        //WAP in java to create laptop details.
        Apple a1 = new Apple();

        a1.id = 17125;
        a1.name = "Mac";
        a1.model = "Mac book pro";
        a1.touchid = true;
        a1.m1ornot = true;
        
        a1.printAllDetails();
        

    }
}
class Laptop{
    // Properties
    int id;
    String name;
    String model;

    // Create method
    void printAllDetails(){
        System.out.println("Id is "+ this.id);
        System.out.println("Name is "+this.name);
        System.out.println("Model is "+this.model);
    }
}
class Apple extends laptop{
    public int id;
    public String name;
    public String model;
    //Touch id boolean and m1 or not boolean.
    boolean touchid;
    boolean m1ornot;

    void printAllDetails(){
        System.out.println("Id is "+ this.id);
        System.out.println("Name is "+this.name);
        System.out.println("Model is "+this.model);
        System.out.println("Is touch id "+this.touchid);
        System.out.println("Is M1 or not  "+this.m1ornot);
    }

    }

