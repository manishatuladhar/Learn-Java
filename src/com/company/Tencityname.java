package com.company;
import java.util.ArrayList;
public class Tencityname {
    public static void main(String[] args) {
        //Write a java to declare ArrayList and add 10 city names to it. Also, print all details.

        ArrayList<String> names = new ArrayList<>();

        names.add("kathmandu");
        names.add("patan");
        names.add("bhaktapur");
        names.add("pokhara");
        names.add("lumbini");
        names.add("bhairawa");
        names.add("butwal");
        names.add("birgunj");
        names.add("palpa");
        names.add("daman");

        // to print details
        for(String name: names){
            System.out.println(name);
        }


    }
}
