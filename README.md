# Ajackus-Assignment

# Digital Library Book Management System

## 📖 Project Description
The **Digital Library Book Management System** is a console-based Java application that enables librarians to efficiently manage books in a library. The system allows users to add, update, search, delete, and view books while maintaining their availability status.

## 🛠️ Setup Instructions
### **Prerequisites**
- **Java 17+** installed ([Download JDK](https://jdk.java.net/))
- **Maven** installed (optional, if using for dependency management)
- **Git** installed ([Download Git](https://git-scm.com/))
- **IDE** (IntelliJ IDEA, Eclipse, or VS Code)

### **Clone the Repository**
```sh
git clone <your-github-repo-url>
cd DigitalLibrary
```

### **Run the Application**
#### **Option 1: Run using Java (No Maven)**
```sh
javac -d bin src/models/Book.java src/services/Library.java src/utils/InputValidator.java src/app/LibraryApp.java
java -cp bin app.LibraryApp
```

#### **Option 2: Run using Maven**
```sh
mvn compile
mvn exec:java -Dexec.mainClass="app.LibraryApp"
```

### **Run Tests**
```sh
mvn test
```

## 🔥 Features
- **Add a Book**: Store book details like ID, Title, Author, Genre, and Availability.
- **View All Books**: Display all books available in the collection.
- **Search Books**: Search by **ID** or **Title**.
- **Update Book Details**: Modify book information such as title, author, genre, and availability.
- **Delete a Book**: Remove a book record permanently.
- **Exit System**: Quit the application gracefully.

## 🚀 Challenges Faced
- **Ensuring Unique Book ID**: Used a `HashMap` to store books, enforcing uniqueness.
- **Validating User Input**: Implemented an `InputValidator` class to ensure correct formats.
- **Handling Exceptions**: Managed input errors and edge cases (e.g., book not found, invalid inputs).
- **Unit Testing**: Created test cases for core functionalities to ensure reliability.
- **Modular Code Structure**: Organized the project into separate classes (`Book`, `Library`, `InputValidator`, `LibraryApp`) for better scalability and maintainability.

## 📂 Directory Structure
```
DigitalLibrary/
│── src/
│   ├── models/
│   │   ├── Book.java
│   ├── services/
│   │   ├── Library.java
│   ├── utils/
│   │   ├── InputValidator.java
│   ├── app/
│   │   ├── LibraryApp.java
│── test/
│   ├── LibraryTest.java
│── README.md
│── .gitignore
│── pom.xml  (If using Maven)
```

## 📝 Future Improvements
- Add a **GUI version** using JavaFX or Swing.
- Store books in a **database** instead of an in-memory collection.
- Implement **user authentication** for role-based access.
- Support **CSV/JSON import & export** for book data.

---
💡 **Note:** If you encounter any issues, feel free to raise an issue or contribute to the project! 🚀

