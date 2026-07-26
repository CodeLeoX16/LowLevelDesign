package models;

import constants.AccountType;

public class Member extends Account {

    private LibraryCard libraryCard;
    private int borrowedBooks;

    public Member(int id,
                  String name,
                  String email,
                  String phone,
                  String password,
                  LibraryCard libraryCard) {

        super(id, name, email, phone,
                password, AccountType.MEMBER);

        this.libraryCard = libraryCard;
    }

    public BookLending borrowBook(BookItem bookItem) {
        borrowedBooks++;
        return new BookLending(this, bookItem);
    }

    public BookReservation reserveBook(BookItem bookItem) {
        return new BookReservation(this, bookItem);
    }

    public void returnBook(BookLending lending) {
        borrowedBooks--;
        lending.returnBook();
    }
}