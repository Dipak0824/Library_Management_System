package Library;
import Library.Books;

import java.util.*;

public class LibrarySystem {
  
    private ArrayList<Books> collection;  

    public LibrarySystem() {  
        this.collection = new ArrayList<>();  
    }  

    public void addBook(String id, String title, String writer, String category, String status) {  
        if (getBookById(id) == null && !title.isEmpty() && !writer.isEmpty() &&  
                (status.equalsIgnoreCase("Available") || status.equalsIgnoreCase("Checked Out"))) {  
            collection.add(new Books(id, title, writer, category, status));  
            System.out.println("Book successfully added.");  
        } else {  
            System.out.println("Error: Unable to add the book. Ensure ID is unique and fields are not empty.");  
        }  
    }  

    public Books getBookById(String id) {  
        for (Books book : collection) {  
            if (book.getId().equals(id)) {  
                return book;  
            }  
        }  
        return null;  
    }  

    public void viewAllBooks() {  
        if (collection.isEmpty()) {  
            System.out.println("No books available in the library.");  
        } else {  
            for (Books book : collection) {  
                System.out.println(book);  
            }  
        }  
    }  

    public void updateBook(String id, String newTitle, String newWriter, String newCategory, String newStatus) {  
        Books book = getBookById(id);  
        if (book != null) {  
            if (!newTitle.isEmpty()) book.setTitle(newTitle);  
            if (!newWriter.isEmpty()) book.setWriter(newWriter);  
            if (!newCategory.isEmpty()) book.setCategory(newCategory);  
            if (newStatus.equalsIgnoreCase("Available") || newStatus.equalsIgnoreCase("Checked Out")) {  
                book.setStatus(newStatus);  
            }  
            System.out.println("Book details successfully updated.");  
        } else {  
            System.out.println("Error: Book not found.");  
        }  
    }  

    public void deleteBook(String id) {  
        Books book = getBookById(id);  
        if (book != null) {  
            collection.remove(book);  
            System.out.println("Book successfully removed.");  
        } else {  
            System.out.println("Error: Book not found.");  
        }  
    }
}
