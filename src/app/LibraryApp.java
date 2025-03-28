package app;

import java.util.Scanner;
import models.Book;
import services.Library;
import utils.InputValidator;


public class LibraryApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Digital Library!");
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("\n1. Add Book | 2. View Books | 3. Search | 4. Update | 5. Delete | 6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Book ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter Availability (Available/Checked Out): ");
                    String availability = scanner.nextLine();

                    if (InputValidator.isValidString(title) && InputValidator.isValidString(author) &&
                            InputValidator.isValidAvailability(availability)) {
                        library.addBook(new Book(id, title, author, genre, availability.equalsIgnoreCase("Available")));
                    } else {
                        System.out.println("Invalid input.");
                    }
                }
                case 2 -> library.viewAllBooks();
                case 3 -> {
                    System.out.print("Enter Book ID or Title: ");
                    String key = scanner.nextLine();
                    Book book = library.searchBook(key);
                    System.out.println(book != null ? book : "Book not found.");
                }
                case 4 -> {
                    System.out.print("Enter Book ID to update: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter New Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter New Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter New Genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter Availability (Available/Checked Out): ");
                    String availability = scanner.nextLine();

                    if (library.updateBook(id, title, author, genre, availability.equalsIgnoreCase("Available"))) {
                        System.out.println("Book updated successfully!");
                    } else {
                        System.out.println("Book not found.");
                    }
                }
                case 5 -> {
                    System.out.print("Enter Book ID to delete: ");
                    String id = scanner.nextLine();
                    System.out.println(library.deleteBook(id) ? "Book deleted!" : "Book not found.");
                }
                case 6 -> {
                    System.out.println("Exiting system.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
