public class LibraryTest {

    public static void main(String[] args) {
        Library library = new Library("Test Library", "Test Address");

        Book book1 = new Book("Book1", "Author1", "ISBN1", 10.0);
        Book book2 = new Book("Book2", "Author2", "ISBN2", 20.0);
        Book book3 = new Book("Book3", "Author1", "ISBN3", 12.0);
        Book book4 = new Book("Book4", "Author3", "ISBN4", 9.0);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        book3.issueBook();

        if (!book3.getStatus()) {
            System.out.println("Book is available, but it should be issued!");
        } else {
            System.out.println("Book is issued correctly!");
        }

        book3.returnBook();

        if (book3.getStatus()) {
            System.out.println();
            System.out.println("Book is not available, but it should be returned!");
        } else {
            System.out.println();
            System.out.println("Book is returned correctly!");
        }

        book3.issueBook();

        System.out.println();
        library.showBooksByAuthor("Author1");

        System.out.println();
        library.showAvailableBooks();
    }
}