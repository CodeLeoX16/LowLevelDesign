package models;

public class BookLending {

    private static int counter = 1;

    private int lendingId;
    private Member member;
    private BookItem bookItem;

    public BookLending(Member member, BookItem bookItem) {

        this.lendingId = counter++;
        this.member = member;
        this.bookItem = bookItem;

        bookItem.checkout();
    }

    public void returnBook() {
        bookItem.returnBook();
    }

    public Fine calculateFine(int lateDays) {

        if (lateDays <= 0)
            return null;

        return new Fine(lateDays * 10);
    }
}