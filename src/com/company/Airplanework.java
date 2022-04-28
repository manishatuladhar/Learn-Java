package com.company;

public class Airplanework {
    public static void main(String[] args) {
        //WAP in java to create class airplane with private properties.
        Airplane a1 = new Airplane();
        a1.setName("Airbus");
        a1.setColour("Red");

        System.out.println("The name of airplane is "+a1.getName()+".");
        System.out.println("The colour of airplane is "+a1.getColour());


    }
}
class Airplane {
    // Properties
    private String name;
    private String colour;

    // Create getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}