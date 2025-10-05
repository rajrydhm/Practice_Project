package Aggregation;

public class Books {
    String name;
    String Pages;
    String author;

    public Books(String name, String pages, String author) {
        this.name = name;
        Pages = pages;
        this.author = author;
    }

    void displayBooks() {
        System.out.println("Book name: " + name);
        System.out.println("Pages: " + Pages);
        System.out.println("Author: " + author);
    }


}
