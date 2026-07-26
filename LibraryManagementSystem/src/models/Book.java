package models;

import constants.BookFormat;

public class Book {

    protected String isbn;
    protected String title;
    protected String author;
    protected String subject;
    protected BookFormat format;

    public Book(String isbn,
                String title,
                String author,
                String subject,
                BookFormat format) {

        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.subject = subject;
        this.format = format;
    }

    public void displayDetails() {

        System.out.println("ISBN : " + isbn);
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Subject : " + subject);
    }
}