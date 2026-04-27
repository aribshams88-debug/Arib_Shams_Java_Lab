class Book {
    String author;
    String title;
    double price;
    String publisher;

    // Constructor
    Book(String author, String title, double price, String publisher) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.publisher = publisher;
    }
}

public class BookDemo {
    public static void main(String[] args) {

        // Creating 4 book objects
        Book b1 = new Book("Author A", "Book One", 450.50, "Publisher X");
        Book b2 = new Book("Author B", "Book Two", 299.99, "Publisher Y");
        Book b3 = new Book("Author C", "Book Three", 550.00, "Publisher Z");
        Book b4 = new Book("Author D", "Book Four", 399.75, "Publisher W");

        // Store books in an array
        Book[] books = {b1, b2, b3, b4};

        // Find book with highest price
        Book maxBook = books[0];

        for (int i = 1; i < books.length; i++) {
            if (books[i].price > maxBook.price) {
                maxBook = books[i];
            }
        }

        // Display result
        System.out.println("Book with highest price: " + maxBook.title);
        System.out.println("Price: " + maxBook.price);
    }
}