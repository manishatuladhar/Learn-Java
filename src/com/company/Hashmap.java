package com.company;
import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,String> countryDetails = new HashMap<String, String>();

        countryDetails.put("Nepal", "Kathmandu");
        countryDetails.put("South Korea", "Seoul");
        countryDetails.put("Thailand", "Bangkok");
        countryDetails.put("India", "Delhi");
        countryDetails.put("Sri lanka", "Colombo");
        countryDetails.put("Myanmar", "Naypyidaw");
        countryDetails.put("USA", "Washington D.C");


        System.out.println("Country Details"+countryDetails);


    }
}
