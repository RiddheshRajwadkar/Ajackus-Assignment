package models;

public class Book {
    private String bookId, title, author, genre;
    private boolean isAvailable;

    public Book(String bookId, String title, String author, String genre, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
    }

    public String getBookId() { return bookId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public boolean isAvailable() { return isAvailable; }

    public void setAvailable(boolean available) { isAvailable = available; }

    @Override
    public String toString() {
        return "ID: " + bookId + ", Title: " + title + ", Author: " + author +
                ", Genre: " + genre + ", Available: " + (isAvailable ? "Yes" : "No");
    }
}
