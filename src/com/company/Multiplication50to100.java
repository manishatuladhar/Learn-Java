package com.company;

public class Multiplication50to100 {
    public static void main(String[] args) {
        for (int i=50; i<=100; i+=2) {
            for(int j=1; j<=10; j++) {

                System.out.println(i + " * " + j + " = " + i * j);


            }
            System.out.println("\n");
        }
    }
}
