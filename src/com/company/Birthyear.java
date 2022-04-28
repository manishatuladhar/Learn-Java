package com.company;
import java.time.LocalDate;
import java.util.Scanner;

public class Birthyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter your birth year");
        int byear = sc.nextInt();

        findAge(byear);


    }

    public static void findAge(int birthYear){
        LocalDate d = LocalDate.now();
        int currentYear = d.getYear();
        int age = currentYear - birthYear;
        System.out.println("Your age is "+ age);




    }

}
