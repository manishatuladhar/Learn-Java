package com.company;
import java.lang.Math;

public class Mathwork {
    public static void main(String[] args) {
        System.out.println("Maximum Value "+Math.max(10, 50));
        System.out.println("Min Value "+ Math.min(10, 50));
        System.out.println("Round Value "+Math.round(10.99));
        System.out.println("Floor Value "+Math.floor(10.99));
        System.out.println("Ceil Value"+Math.ceil(10.99));
        System.out.println("Square Root "+Math.sqrt(10));
        System.out.println("Square"+Math.pow(2,2));

        //Generate Random number Between 1 to 10
        for(int i = 0; i<=10; i++){
            System.out.println(Math.floor(Math.random()*10+1 +10));

        }
    }
}
