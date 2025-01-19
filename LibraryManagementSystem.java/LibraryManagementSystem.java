// Class representing an International Standard Book Number (ISBN)
class ISBN {
    private String isbn;

    // Constructor to initialize the ISBN
    public ISBN(String isbn) {
        this.isbn = isbn;
    }

    // Setter method to set the ISBN
    public void setISBN(String isbn) {
        this.isbn = isbn;
    }

    // Getter method to get the ISBN
    public String getISBN() {
        return isbn;
    }
}

// Class representing a Book
class Book {
    private String title;
    private String author;
    private String publisher;
    private String city;
    private String publicationDate;
    private double price;
    private ISBN isbnNum; // Composition relationship with ISBN

    // Constructor to initialize the Book
    public Book(String title, String author, String publisher, String city, String publicationDate, double price, ISBN isbn) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.city = city;
        this.publicationDate = publicationDate;
        this.price = price;
        this.isbnNum = isbn;
    }

    // Method to set the ISBN for the book
    public void setBookISBN(ISBN isbn) {
        this.isbnNum = isbn;
    }

    // Method to get the author of the book
    public String getAuthor() {
        return author;
    }

    // Method to get the ISBN of the book
    public String getBookISBN() {
        return isbnNum.getISBN();
    }

    // Method to print the details of the book
    public void printDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("City: " + city);
        System.out.println("Publication Date: " + publicationDate);
        System.out.println("Price: $" + price);
        System.out.println("ISBN: " + isbnNum.getISBN());
    }
}

// Test Class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Creating an ISBN object
        ISBN isbn = new ISBN("0 941831 39 6");

        // Creating a Book object
        Book book = new Book(
            "Object-oriented Programming with Java",
            "David J. Barnes and Michael Kolling",
            "Prentice Hall",
            "London",
            "2008",
            59.99,
            isbn
        );

        // Printing book details
        book.printDetails();
    }
}
