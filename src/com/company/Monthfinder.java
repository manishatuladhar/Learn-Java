package com.company;
import java.util.Scanner;

public class Monthfinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of month");

        int number = sc.nextInt();

        switch (number){
            case 1:
                System.out.println("Month is jan");
                break;
            case 2:
                System.out.println("Month is feb");
                break;
            case 3:
                System.out.println("Month is mar");
                break;
            case 4:
                System.out.println("Month is apr");
                break;
            case 5:
                System.out.println("Month is may");
                break;
            case 6:
                System.out.println("Month is jun");
                break;
            case 7:
                System.out.println("Month is jul");
                break;
            case 8:
                System.out.println("Month is aug");
                break;
            case 9:
                System.out.println("Month is sep");
                break;
            case 10:
                System.out.println("Month is oct");
                break;
            case 11:
                System.out.println("Month is nov");
                break;
            case 12:
                System.out.println("Month is dec");
            default:
                System.out.println("Invalid");




        }
    }
}
