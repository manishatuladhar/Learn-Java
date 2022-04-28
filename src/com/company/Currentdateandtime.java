package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Currentdateandtime {
    public static void main(String[] args) {
        //WAP to print the current date and time.
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/dd/MM HH:MM:SS");
        Date date = new Date();
        System.out.println(sdf.format(date));



    }
}
