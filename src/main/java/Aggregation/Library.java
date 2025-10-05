package Aggregation;

import java.util.Arrays;

public class Library {
    String name;
    String address;
    Books[] books; // Aggregation relationship

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Library(Books[] book) {
        this.books = book;
    }

    void displayInfo() {
        System.out.println("Library name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Book available right now:");
        for(Books book : books){
            book.displayBooks();
            System.out.println();
        }


    }
}
