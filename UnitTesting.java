package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UnitTesting {

    @Test
    public void testAddingBooksToQueue() {
        // Create a BookShelfArrayQueue (which uses the ArrayList inside)
        BookShelf bookshelf = new BookShelf();

        // Add books to the ArrayList
        bookshelf.addABook("1984", "George Orwell", 1949);
        bookshelf.addABook("To Kill a Mockingbird", "Harper Lee", 1960);
        bookshelf.addABook("The Great Gatsby", "F. Scott Fitzgerald", 1925);

        // Check if the correct number of books were added (ArrayList size should be 3)
        assertEquals(3, bookshelf.getShelfSize());
    }
}

