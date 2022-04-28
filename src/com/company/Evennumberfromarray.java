package com.company;

public class Evennumberfromarray {
    //WAP in java to print only even number from array
    public static void main(String[] args) {
        int[] num = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000,102, 303, 401, 406};
        for (int i = 0; i < num.length; i++)
            if (num[i] % 2 == 0) {
                System.out.println(num[i]);
            }
    }
}