import java.util.Scanner;

public class Book {

    private String title;
    private String author;
    private double price;
    
    //constructor 1: default value
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }
    
    //constructor 2: set book info
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    //method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println();
    }
    
    // Main method to test the Book class
    public static void main(String[] args) {
        Scanner Gojo = new Scanner(System.in);
        
        // Get number of books from user
        System.out.print("Enter the number of books: ");
        int n = Gojo.nextInt();
        Gojo.nextLine(); // Consume newline character
        
        // Array to store books
        Book[] books = new Book[n];
        
        // Input book information
        for(int i=0; i<n; i++) {
            System.out.println("\nBook " + (i+1) + " :");
            System.out.print("Enter title: ");
            String title = Gojo.nextLine();
            System.out.print("Enter author: ");
            String author = Gojo.nextLine();
            System.out.print("Enter price: ");
            double price = Gojo.nextDouble();
            Gojo.nextLine(); 
            
            books[i] = new Book(title, author, price);
        }
        
        //display all books info
        System.out.println("\nAll books information: ");
        for(int i=0; i<n; i++) {
            System.out.println("Book " + (i+1) + " :");
            books[i].displayDetails();
        }
        
        Gojo.close();
    }
}

