package test;

import models.Book;
import services.Library;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    @Test
    public void testAddBook() {
        Library library = new Library();
        Book book = new Book("1", "Java Basics", "John Doe", "Programming", true);
        library.addBook(book);
        assertNotNull(library.searchBook("1"));
    }
}
