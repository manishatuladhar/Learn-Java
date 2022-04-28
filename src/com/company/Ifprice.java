package com.company;
import java.util.Scanner;
public class Ifprice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your price: ");
        int price = sc.nextInt();

        //Using if condition
        if(price >=500){
            System.out.println("The price is high.");

        }else{
            System.out.println("The price is low.");

        }
    }
}
