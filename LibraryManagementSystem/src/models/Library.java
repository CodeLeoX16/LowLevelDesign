package models;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private String name;
    private List<BookItem> books;

    public Library(String name) {

        this.name = name;
        books = new ArrayList<>();
    }

    public void addBook(BookItem book) {
        books.add(book);
    }

    public void removeBook(BookItem book) {
        books.remove(book);
    }

    public void showBooks() {

        for (BookItem book : books) {
            book.displayDetails();
            System.out.println("--------------------");
        }
    }
}