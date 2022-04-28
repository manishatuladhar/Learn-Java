package com.company;
import java.time.LocalDate;
import java.time.Year;
public class Currentyear {
    public static void main(String[] args) {
        //Write a java program to print the current year.
        LocalDate date = LocalDate.now();
        System.out.println("Local Date is"+date);

        int currentYear = date.getYear();
        System.out.println("Current Year is "+currentYear);
    }
}
