package services;

import models.Book;
import java.util.*;

public class Library {
    private Map<String, Book> bookCollection = new HashMap<>();

    public void addBook(Book book) {
        if (!bookCollection.containsKey(book.getBookId())) {
            bookCollection.put(book.getBookId(), book);
            System.out.println("Book added successfully!");
        } else {
            System.out.println("Book ID must be unique.");
        }
    }

    public void viewAllBooks() {
        if (bookCollection.isEmpty()) System.out.println("No books available.");
        else bookCollection.values().forEach(System.out::println);
    }

    public Book searchBook(String key) {
        return bookCollection.values()
                .stream()
                .filter(b -> b.getBookId().equalsIgnoreCase(key) || b.getTitle().equalsIgnoreCase(key))
                .findFirst().orElse(null);
    }

    public boolean updateBook(String bookId, String title, String author, String genre, boolean isAvailable) {
        if (bookCollection.containsKey(bookId)) {
            bookCollection.put(bookId, new Book(bookId, title, author, genre, isAvailable));
            return true;
        }
        return false;
    }

    public boolean deleteBook(String bookId) {
        return bookCollection.remove(bookId) != null;
    }
}
