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

 @Override
    void read() {
        System.out.println("Reading printed book: " + title);
    }
}

class EBook extends Book {
    public EBook(String title) {
        super(title);
    }

    @Override
    void read() {
        System.out.println("Reading e-book on screen: " + title);
    }
}

class AudioBook extends Book {
    public AudioBook(String title) {
        super(title);
    }

    @Override
    void read() {
        System.out.println("Listening to audiobook: " + title);
    }
}

class Library {
    private ArrayList<Book> books; // Encapsulated list of books

    public Library() {
        books = new ArrayList<>();
    }

    // Method to add books
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display all books
    public void showBooks() {
        System.out.println("\nAvailable Books in the Library:");
        for (Book book : books) {
            book.displayInfo();
        }
    }

    // Method to simulate reading books (Polymorphism in action)
    public void readBooks() {
        System.out.println("\nReading Books:");
        for (Book book : books) {
            book.read(); // Calls the overridden method based on book type
        }
    }
}

public class Ques7 {
    public static void main(String[] args) {
        Library myLibrary = new Library();

        // Creating different book types
        Book book1 = new PrintedBook("Java Programming");
        Book book2 = new EBook("Data Structures and Algorithms");
        Book book3 = new AudioBook("knowladge based system");

        // Adding books to the library
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.addBook(book3);

        // Display available books
        myLibrary.showBooks();

        // Read books (Demonstrating Polymorphism)
        myLibrary.readBooks();
    }
}
