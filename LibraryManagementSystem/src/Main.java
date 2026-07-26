import constants.*;
import models.*;

public class Main {

    public static void main(String[] args) {

        // ============================
        // Create Library
        // ============================

        Library library = new Library("Central Library");

        // ============================
        // Create Rack
        // ============================

        Rack rack1 = new Rack("R-101", "Ground Floor");

        // ============================
        // Create Books
        // ============================

        BookItem javaBook = new BookItem(
                "9780135166307",
                "Effective Java",
                "Joshua Bloch",
                "Programming",
                BookFormat.HARDCOVER,
                "B001",
                rack1
        );

        BookItem dsaBook = new BookItem(
                "9780073523408",
                "Data Structures",
                "Seymour Lipschutz",
                "Computer Science",
                BookFormat.PAPERBACK,
                "B002",
                rack1
        );

        // ============================
        // Create Librarian
        // ============================

        Librarian librarian = new Librarian(
                1,
                "Admin",
                "admin@gmail.com",
                "9999999999",
                "admin123"
        );

        // Login

        if (librarian.login("admin@gmail.com", "admin123")) {
            System.out.println("Librarian Login Successful\n");
        }

        // Add Books

        librarian.addBook(library, javaBook);
        librarian.addBook(library, dsaBook);

        System.out.println("Books Added Successfully\n");

        // ============================
        // Display Books
        // ============================

        System.out.println("Available Books");
        System.out.println("--------------------------");

        library.showBooks();

        // ============================
        // Create Member
        // ============================

        LibraryCard card = new LibraryCard("LIB1001");

        Member member = new Member(
                101,
                "Somnath",
                "somnath@gmail.com",
                "9876543210",
                "12345",
                card
        );

        // Login

        if (member.login("somnath@gmail.com", "12345")) {
            System.out.println("\nMember Login Successful\n");
        }

        // ============================
        // Borrow Book
        // ============================

        BookLending lending = member.borrowBook(javaBook);

        System.out.println("Book Borrowed Successfully\n");

        // ============================
        // Reserve Book
        // ============================

        BookReservation reservation =
                member.reserveBook(dsaBook);

        reservation.reserve();

        System.out.println(
                "Reservation Status : "
                        + reservation.getStatus());

        // ============================
        // Return Book
        // ============================

        member.returnBook(lending);

        System.out.println("\nBook Returned Successfully");

        // ============================
        // Calculate Fine
        // ============================

        Fine fine = lending.calculateFine(3);

        if (fine != null) {
            System.out.println(
                    "Fine Amount : ₹"
                            + fine.getAmount());
        }

        // ============================
        // Notification
        // ============================

        Notification notification =
                new Notification(
                        "Book returned successfully.",
                        NotificationType.GENERAL
                );

        notification.send();

        // ============================
        // Logout
        // ============================

        member.logout();
        librarian.logout();
    }
}