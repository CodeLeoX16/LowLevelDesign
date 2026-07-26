package models;

import constants.BookStatus;

public class BookItem extends Book {

    private String barcode;
    private Rack rack;
    private BookStatus status;

    public BookItem(String isbn,
                    String title,
                    String author,
                    String subject,
                    constants.BookFormat format,
                    String barcode,
                    Rack rack) {

        super(isbn, title, author,
                subject, format);

        this.barcode = barcode;
        this.rack = rack;
        this.status = BookStatus.AVAILABLE;
    }

    public boolean isAvailable() {
        return status == BookStatus.AVAILABLE;
    }

    public void checkout() {
        status = BookStatus.LOANED;
    }

    public void returnBook() {
        status = BookStatus.AVAILABLE;
    }

    public void reserve() {
        status = BookStatus.RESERVED;
    }
}