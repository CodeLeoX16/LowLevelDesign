package models;

import constants.AccountType;

public class Librarian extends Account {

    public Librarian(int id,
                     String name,
                     String email,
                     String phone,
                     String password) {

        super(id, name, email,
                phone, password,
                AccountType.LIBRARIAN);
    }

    public void addBook(Library library, BookItem book) {
        library.addBook(book);
    }

    public void removeBook(Library library, BookItem book) {
        library.removeBook(book);
    }
}