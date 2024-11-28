public class Book {
    static int totalBooks = 0;

    private String title;
    private String author;
    private String isbn;
    private Double price;
    private Boolean isIssued;


    // Default Constructor
    public Book() {
        this.title = "";
        this.author = "";
        this.isbn = "";
        this.price = 0.0;
        this.isIssued = false;
    }

    // Parameterized Constructor
    public Book(String title, String author, String isbn, Double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.isIssued = false;
    }

    // To get the title of the book
    public String getTitle() {
        return this.title;
    }

    // To get the author of the book
    public String getAuthor() {
        return this.author;
    }

    // To get the ISBN of the book
    public String getISBN() {
        return this.isbn;
    }

    // To get the price of the book
    public Double getPrice() {
        return this.price;
    }

    // To get the status of the book
    public Boolean getStatus() {
        return this.isIssued;
    }


    // To mark the book as issued
    public void issueBook() {
        this.isIssued = true;
    }

    // To mark the book as not issued
    public void returnBook() {
        this.isIssued = false;
    }
}
