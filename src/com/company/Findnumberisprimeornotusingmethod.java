package com.company;

public class Findnumberisprimeornotusingmethod {
    //WAP in java to find the number is prime or not using method.
    public static void main(String[] args) {
        prime(29);
    }

    //method with parameter and no return type
    public static void prime(int p){
        if (p % 2 == 0) {
            System.out.println(p + " not a prime number");
        }else{
            System.out.println(p + " is a prime number");
        }
    }

}
