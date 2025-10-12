package Aggregation;

public class Books {
    String name;
    int Pages;
    String author;

    public Books(String name, int pages, String author) {
        this.name = name;
        Pages = pages;
        this.author = author;
    }

    public void displayBooks() {
        System.out.println("Book name: " + name);
        System.out.println("Pages: " + Pages);
        System.out.println("Author: " + author);
    }


}
