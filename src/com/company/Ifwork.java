package com.company;
import java.util.Scanner;

public class Ifwork {
    public static void main(String[] args) {
        //using if condition
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if(age >= 12){
            System.out.println("You are a voter.");
        }else
            System.out.println("You are not a voter.");

    }
}
