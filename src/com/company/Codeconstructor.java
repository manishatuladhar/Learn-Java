package com.company;

public class Codeconstructor {
    // using code and constructor
    public static void main(String[] args) {
        House h = new House ("120",4,"blue", 12,"13" );



    }

}



class House{
    //Properties
    String size;
    int floor;
    String colour;
    int number;
    String noOfDoors;


// constructor
    public House(String size, int floor, String colour, int number, String noOfDoors) {
        this.size = size;
        this.floor = floor;
        this.colour = colour;
        this.number = number;
        this.noOfDoors = noOfDoors;
    }
}

