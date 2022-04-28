package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Userinputarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scS = new Scanner(System.in);
        System.out.println("How many num you want to store in array");

        int totalinArray = sc.nextInt();
        List<String> List=new ArrayList<String>();

        for(int i=0; i<totalinArray; i++){
            System.out.println("Enter value for "+i+" : ");
            String value = scS.nextLine();
            List.add(value);


        }
        System.out.println("All values are ");
        for(String item : List){
            System.out.println(item);
        }
    }

}
