package tests;

import java.util.ArrayList;

public class BookShelf {

    ArrayList<Book> bookList;   // Replacing ArrayQueue with ArrayList
    final int capacity = 3;

    public BookShelf() {
        // Create the blank ArrayList to store the books
        bookList = new ArrayList<Book>();
    }

    // Method to add a book using parameters (title, author, year)
    public void addABook(String title, String author, int year) {
        Book aBook = new Book(title, author, year);
        bookList.add(aBook);  // Add book to ArrayList
    }

    // Corrected: Return the size of the ArrayList
    public int getShelfSize() {
        return bookList.size();  // Return the number of books in the ArrayList
    }

    // Method to display the books (not used in testing)
    public void displayBooks() {
        System.out.println("Size: " + bookList.size());
        for (Book book : bookList) {
            System.out.println("The book is: " + book.getTitle());
        }
    }
}

	

