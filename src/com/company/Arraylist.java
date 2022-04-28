package com.company;
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        //Write a java to declare ArrayList and add 10 city names to it. Also, print all details.
        ArrayList<String> names = new ArrayList<>();

        names.add("Abhayam Sthapit");
        names.add("Adhrit Sthapit");
        names.add("Anisha Tuladhar");
        names.add("Bidisha Tuladhar");

        // to print details
        for(String name: names){
            System.out.println(name);
        }

    }
}







