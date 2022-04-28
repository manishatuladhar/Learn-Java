package com.company;



public class Bookwork {
    public static void main(String[] args) {
       // Create a Class Book [id, name, price].
        Book b1 = new Book(1,"Buddhism",750);
        Book b2 = new Book(2,"Art Of Living",500);

        b1.printinfo();
        b2.printinfo();


    }
}
class Book{
    int id;
    String name;
    int price;

    public Book(int id,String name,int price){
        this.id = id;
        this.name = name;
        this.price = price;

    }

    void printinfo (){
        System.out.println("Book info is : ");
        System.out.println("Book Id is "+ this.id);
        System.out.println("Book name is " + this.name);
        System.out.println("Book price is " + this.price);
        System.out.println("\n.........................................");







    }

}