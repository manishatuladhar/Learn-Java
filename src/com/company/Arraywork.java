package com.company;

public class Arraywork {
    // Declare int array and print all items.
    public static void main(String[] args) {
        String [] price = {"100", "200", "300" };
        int length = price.length;
        System.out.println("the length of price is"+price);
        for(int i=0; i<3; i++){
            System.out.println(price[i]);
        }

    }
}
