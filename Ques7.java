import java.util.ArrayList;


abstract class Book {
    protected String title;  // Encapsulated property

    public Book(String title) { // Constructor
        this.title = title;
    }

    // Abstract method (Polymorphism - overridden by subclasses)
    abstract void read();

    // Method to display book details
    public void displayInfo() {
        System.out.println("Title: " + title);
    }
}

class PrintedBook extends Book {
    public PrintedBook(String title) {
        super(title);
    }
