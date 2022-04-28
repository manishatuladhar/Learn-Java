package com.company;

import java.util.Collections;
import java.util.LinkedList;

public class Pricework {
    public static void main(String[] args) {

        LinkedList<Double> price = new LinkedList<Double>();

        price.add(10.00);
        price.add(20.00);
        price.add(105.0);
        price.add(520.5);
        price.add(545.0);
        price.add(456.8);
        price.add(125.0);
        price.add(48.05);
        price.add(15.02);
        price.add(15.40);

        Collections.sort(price);
        System.out.println("prices in ascending order is"+ price);

        for(int i = price.size()-1;i>0;i--){
            System.out.println(price.get(i));
        }




    }
}
