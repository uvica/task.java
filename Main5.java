// Base class
class Book {
    String title;
    String author;

    // Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass for Fiction
class FictionBook extends Book {
    FictionBook(String title, String author) {
        super(title, author); // call constructor of Book
    }
}

// Subclass for Non-Fiction
class NonFictionBook extends Book {
    NonFictionBook(String title, String author) {
        super(title, author);
    }
}

// Subclass for Technical books
class TechnicalBook extends Book {
    TechnicalBook(String title, String author) {
        super(title, author);
    }
}

// Main class
public class Main5 {
    public static void main(String[] args) {
        FictionBook fiction = new FictionBook("The Hobbit", "J.R.R. Tolkien");
        NonFictionBook nonFiction = new NonFictionBook("Sapiens", "Yuval Noah Harari");
        TechnicalBook technical = new TechnicalBook("Effective Java", "Joshua Bloch");

        System.out.println("Fiction Book:");
        fiction.displayDetails();

        System.out.println("\nNon-Fiction Book:");
        nonFiction.displayDetails();

        System.out.println("\nTechnical Book:");
        technical.displayDetails();
    }
}
