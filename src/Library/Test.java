package Library;
import java.util.Scanner;  
import Library.LibrarySystem;

public class Test {
    
    private static LibrarySystem catalog = new LibrarySystem();  

    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  
        String option;  

        do {  
            System.out.println("\nLibrary Book Management System");  
            System.out.println("1. Insert New Book");  
            System.out.println("2. Display All Books");  
            System.out.println("3. Find Book by ID or Title");  
            System.out.println("4. Modify Book Information");  
            System.out.println("5. Remove a Book Entry");  
            System.out.println("0. Quit Application");  
            System.out.print("Select an option: ");  
            option = input.nextLine();  

            switch (option) {  
                case "1":  
                    insertBook(input);  
                    break;  
                case "2":  
                    catalog.viewAllBooks();  
                    break;  
                case "3":  
                    findBook(input);  
                    break;  
                case "4":  
                    modifyBook(input);  
                    break;  
                case "5":  
                    removeBook(input);  
                    break;  
                case "0":  
                    System.out.println("Closing the program.");  
                    break;  
                default:  
                    System.out.println("Invalid option. Please try again.");  
            }  
        } while (!option.equals("0"));  
        input.close();  
    }  

    private static void insertBook(Scanner input) {  
        System.out.print("Provide Book ID: ");  
        String id = input.nextLine();  
        System.out.print("Provide Title: ");  
        String title = input.nextLine();  
        System.out.print("Provide Author Name: ");  
        String writer = input.nextLine();  
        System.out.print("Provide Category: ");  
        String category = input.nextLine();  
        System.out.print("Provide Availability (Available/Checked Out): ");  
        String status = input.nextLine();  
        catalog.addBook(id, title, writer, category, status);  
    }  

    private static void findBook(Scanner input) {  
        System.out.print("Enter Book ID or Title for lookup: ");  
        String query = input.nextLine();  
        Books book = catalog.getBookById(query);  
        if (book != null) {  
            System.out.println(book);  
        } else {  
            System.out.println("No book found. Check the ID or Title.");  
        }  
    }  

    private static void modifyBook(Scanner input) {  
        System.out.print("Enter Book ID for modification: ");  
        String id = input.nextLine();  
        System.out.print("Enter updated Title (or press enter to keep same): ");  
        String newTitle = input.nextLine();  
        System.out.print("Enter updated Author (or press enter to keep same): ");  
        String newWriter = input.nextLine();  
        System.out.print("Enter updated Category (or press enter to keep same): ");  
        String newCategory = input.nextLine();  
        System.out.print("Enter updated Availability (Available/Checked Out, or press enter to keep same): ");  
        String newStatus = input.nextLine();  
        catalog.updateBook(id, newTitle, newWriter, newCategory, newStatus);  
    }  

    private static void removeBook(Scanner input) {  
        System.out.print("Enter Book ID for removal: ");  
        String id = input.nextLine();  
        catalog.deleteBook(id);  
    }  
}
