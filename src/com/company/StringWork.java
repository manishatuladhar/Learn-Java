package com.company;

import java.util.Locale;

public class StringWork {
    public static void main(String[] args) {
        String firstname = "Manisha";
        String lastname = "Tuladhar";


        String fullname = firstname.concat("");
        fullname = fullname.concat(lastname);

        boolean isequals = firstname.equals(lastname);

        System.out.println("Name is "+fullname);
        System.out.println("value at index 2 is "+fullname.charAt(2));
        System.out.println("First name is equal to lastname "+isequals);
        System.out.println("The length of full name "+fullname.length());
        System.out.println("full name in uppercase "+fullname.toUpperCase(Locale.ROOT));
        System.out.println("full name in lowercase "+fullname.toLowerCase(Locale.ROOT));

        String newname= fullname.replace("Manisha","Mamita");
        System.out.println("New name is "+newname );

        String other = fullname.substring(0,4);
        System.out.println("other is "+other);







    }
}
