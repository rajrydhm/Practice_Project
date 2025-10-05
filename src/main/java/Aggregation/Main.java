package Aggregation;

public class Main {
    public static void main(String[] args) {

        //Aggregation = Linking two objects as-is relationship where if one class is deleted the other object
        //              is not impacted.

        Books book1 = new Books("Java Programming", "500", "John Doe");
        Books book2 = new Books("Python Programming", "400", "Jane Smith");
        Books book3 = new Books("C++ Programming", "600", "Alice Johnson");

        Books[] books = {book1, book2, book3};

        for(Books book : books){
           book.displayBooks();
           System.out.println();
        }

        Library library = new Library("City Library", "123 Main St");
        System.out.println();
        library.displayInfo();

        Library libraryWithBook = new Library(books);
        System.out.println();
        libraryWithBook.displayInfo();
    }

}
