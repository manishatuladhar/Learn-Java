package com.company;

public class Planetclass {
    public static void main(String[] args) {
        //WAP in java to create class planet.
        Planet p1 = new Planet();
        p1.setName("Earth");
        p1.setColour("Blue Green Brown White");
        p1.setRadius(3958.8);
        p1.setHaslife(true);

        System.out.println("Planet Name is "+p1.getName());
        System.out.println("Planet Colour is "+p1.getColour());
        System.out.println("Planet Radius is "+p1.getRadius());
        System.out.println("Planet Has Life "+p1.getHaslife());




    }
}
class Planet{
    //Properties
    private String name;
    private String colour;
    private double radius;
    private boolean haslife;




    //Create getter and setter.
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

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean getHaslife() {
        return haslife;
    }

    public void setHaslife(boolean haslife) {
        this.haslife = haslife;
    }
}