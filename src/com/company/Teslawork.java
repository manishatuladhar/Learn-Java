package com.company;

public class Teslawork {
    public static void main(String[] args) {
        //WAP IN JAVA TO CREATE CLASS
        //1. Car [id, name, model]
        Tesla t = new Tesla();

        t.id = 17125;
        t.name = "Tesla car";
        t.model = "Tesla Model S Plaid";
//        t.isselfdriving = true;
        t.printAllDetails();

    }
}
class CarWork{
    //Properties
    int id;
    String name;
    String model;

    //Method
    void printAllDetails(){
        System.out.println("Id is "+ this.id);
        System.out.println("Name is "+ this.name);
        System.out.println("Model is " + this.model);

    }


}
class Tesla extends CarWork{
    boolean isselfdriving;

    void showDetails(){
        System.out.println("Id is "+ this.id);
        System.out.println("Name is "+ this.name);
        System.out.println("Model is " + this.model);
        System.out.println("self Driving "+ this.isselfdriving);

    }
}