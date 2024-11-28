import java.util.ArrayList;

public class Library {
    private String libraryName;
    private String Address;
    private Book[] books;

    // Parameterized Constructor
    public Library(String libraryName, String Address) {
        this.libraryName = libraryName;
        this.Address = Address;
        this.books = new Book[100];
    }


    // Getters
    public String getLibraryName() {
        return libraryName;
    }

    public String getAddress() {
        return Address;
    }

    public Book[] getBooks() {
        return books;
    }

    // Add Book
    public void addBook(Book book) {
        this.books[Book.totalBooks++] = book;
    }

    // Show All Books of a specific author
    public void showBooksByAuthor(String author) {
        System.out.println("Books by " + author);

        boolean foundAny = false;
        for (int i = 0; i < Book.totalBooks; i++) {
            if (this.books[i].getAuthor().equals(author)) {
                System.out.println("Title: " + this.books[i].getTitle());
                System.out.println("ISBN: " + this.books[i].getISBN());
                System.out.println("Status: " + (this.books[i].getStatus() ? "Issued" : "Available"));
                System.out.println("Price: " + this.books[i].getPrice());
                foundAny = true;
            }
        }

        if (!foundAny) {
            System.out.println("No books found by " + author);
        }
    }

    // Show All Available Books
    public void showAvailableBooks() {
        System.out.println("Available Books");
        for (int i = 0; i < Book.totalBooks; i++) {
            if (!this.books[i].getStatus()) {
                System.out.println("Title: " + this.books[i].getTitle());
                System.out.println("Author: " + this.books[i].getAuthor());
                System.out.println("ISBN: " + this.books[i].getISBN());
                System.out.println("Status: " + (this.books[i].getStatus() ? "Issued" : "Available"));
                System.out.println("Price: " + this.books[i].getPrice());
            }
        }
    }
}
