package com.company;
import java.util.Scanner;
public class Vowelorconsonent {
    public static void main(String[] args) {
        //whether character is vowel or consonent.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character :");
        String userInput = sc.nextLine();

        char ch = userInput.charAt(0);

        if(ch=='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u') {
            System.out.println("Character" + ch + "is a vowel.");
        } else{
            System.out.println("Character " + ch + "is a consonent.");


        }

    }
}