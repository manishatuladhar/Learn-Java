package com.company;
import java.util.Scanner;
public class Javapracticequestion11 {
    public static void main(String[] args) {
        //WAP to check the number is odd or even.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");

        int num = scanner.nextInt();
        if(num % 2 ==0)
        {
            System.out.println("The number is even.");
        }else
        {
            System.out.println("The number is odd.");
        }
    }
}
