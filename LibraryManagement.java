class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void issueBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Successfully issued: \"" + title + "\"");
        } else {
            System.out.println("Sorry, \"" + title + "\" is already issued.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Successfully returned: \"" + title + "\"");
        } else {
            System.out.println("The book \"" + title + "\" was not issued.");
        }
    }

    public void displayBook() {
        System.out.println("ID: " + bookId + " | Title: " + title + " | Author: " + author + 
                           " | Status: " + (isAvailable ? "Available" : "Issued"));
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Book b1 = new Book(101, "Effective Java", "Joshua Bloch");
        b1.displayBook();
        b1.issueBook();
        b1.issueBook(); // Attempting to issue again
        b1.returnBook();
        b1.displayBook();
    }
}
