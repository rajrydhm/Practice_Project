package Aggregation;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    String name;
    String address;
    ArrayList<Books> books; // Aggregation relationship

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Library(ArrayList<Books> book) {
        this.books = book;
    }

    void displayInfo() {
        System.out.println("Library name: " + name);
        System.out.println("Address: " + address);
    }

    public void displayBooksInfo() {
        System.out.println("\n Book available right now at the library :");
        for (Books book : books) {
            book.displayBooks();
            System.out.println();
        }
    }

}
