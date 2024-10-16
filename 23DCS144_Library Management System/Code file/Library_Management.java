import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private boolean isAvailable;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(" "+this.title+" Borrowed Successfully!!");
        } else {
            System.out.println(" Book is Not Available!!");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println(" "+this.title+" Returned Successfully!!");
    }

    @Override
    public String toString() {
        return " Title     : " + title + 
             "\n Author    : " + author + 
             "\n Price     : $" + price + 
             "\n Available : " + isAvailable+
             "\n";
    }
}


class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
        initializeDefaultBooks();
    }

    private void initializeDefaultBooks() { // adds default book
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 10.99));
        books.add(new Book("1984", "George Orwell", 8.99));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 12.99));
        books.add(new Book("Moby Dick", "Herman Melville", 11.50));
        books.add(new Book("Pride and Prejudice", "Jane Austen", 9.99));
    }

    public void addBook(Book book) {
        books.add(book); 
    }

    public void borrowBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equalsIgnoreCase(title)) {
                books.get(i).borrowBook(); 
                return;
            }
        }
        System.out.println(" Book Not Found!!");
    }

    public void returnBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equalsIgnoreCase(title)) {
                books.get(i).returnBook();  
                return;
            }
        }
        System.out.println(" Book Not Found!!");
    }

    public void displayBooks() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
    }
}


class User {
    private Library library;
    private Scanner scanner;

    public User(Library library) {
        this.library = library;
        scanner = new Scanner(System.in);
    }

    public void start() {
        OUTER:
        while (true) {
            System.out.println();
            System.out.println(" 1. Add Book");
            System.out.println(" 2. Borrow Book");
            System.out.println(" 3. Return Book");
            System.out.println(" 4. Display Books");
            System.out.println(" 5. Exit");
            System.out.print(" Choose an Option : ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    borrowBook();
                    break;
                case 3:
                    returnBook();
                    break;
                case 4:
                    library.displayBooks();
                    break;
                case 5:
                    System.out.println(" Exiting...");
                    break OUTER;
                default:
                    System.out.println(" Invalid choice. Try again.");
                    break;
            }
        }
    }

    private void addBook() {
        System.out.print(" Enter Book Title  : ");
        String title = scanner.nextLine();
        System.out.print(" Enter Book Author : ");
        String author = scanner.nextLine();
        System.out.print(" Enter Book Price  : ");
        double price = scanner.nextDouble();
        scanner.nextLine();  
        Book book = new Book(title, author, price); 
        library.addBook(book);  
        System.out.println(" Book Added Successfully.");
    }

    private void borrowBook() {
        System.out.print(" Enter Book Title to Borrow : ");
        String title = scanner.nextLine();
        library.borrowBook(title); 
    }

    private void returnBook() {
        System.out.print(" Enter Book Title to Return : ");
        String title = scanner.nextLine();
        library.returnBook(title); 
    }
}


public class Library_Management {
    public static void main(String[] args) {
        Library library = new Library();
        User user = new User(library);
        user.start();
    }
}
