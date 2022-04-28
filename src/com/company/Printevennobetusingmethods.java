package com.company;

public class Printevennobetusingmethods {
    //WAP in java to print even number between using methods.
    public static void main(String[] args) {

        numbers(1,100);
    }

    //method with parameter and no return type
    public static void numbers(int a, int b){
        System.out.print("List of even numbers from 1 to "+b+": ");
        for (int i=a; i<=b; i++)
        {
        //check if the number is even or not
            if (i%2==0)
            {
                System.out.print(i + " ");
            }
        }
    }

}
