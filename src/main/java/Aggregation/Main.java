package Aggregation;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Aggregation = Linking two objects as-is relationship where if one class is deleted the other object
        //              is not impacted.
        // In this Exercise we will pass arguments/parameters through User inputs and store the objects created
        //into ArrayList

        ArrayList<Books> books = new ArrayList<>(); //we created Arraylist of objects containing books

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of books you would like to add to the library: ");
        int numberOfBooks = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numberOfBooks; i++) {
            System.out.print("Please enter the name of the book: ");
            String bookName = scanner.nextLine();

            System.out.print("Please enter the no.of pages : ");
            int pages = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Please enter the name of the author: ");
            String author = scanner.nextLine();

            Books book = new Books(bookName, pages, author); //we created object of each book here
            books.add(book); //we stored those objects of books into books Arraylist
        }

        scanner.close();

        Library library = new Library(books); //We created Library object by passing books Arraylist as argument
        library.displayBooksInfo(); //we are displaying each book object with it's displayBooks function written within
        //displayBooksInfo of library.
    }
}





    /*    for(Books book : books){
           book.displayBooks();
           System.out.println();
        }

        System.out.println("------------------------------");

        Library library = new Library("City Library", "123 Main St");
        System.out.println();
        library.displayInfo();

        Library libraryWithBook = new Library(books); //we are using books array object in Library as Aggregation
        System.out.println();
        libraryWithBook.displayBooksInfo();*/


    // Even if Library class is deleted the Books Class and Objects can still function separately


