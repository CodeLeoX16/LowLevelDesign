package models;

import constants.ReservationStatus;

public class BookReservation {

    private static int counter = 1;

    private int reservationId;
    private Member member;
    private BookItem bookItem;
    private ReservationStatus status;

    public BookReservation(Member member, BookItem bookItem) {

        this.reservationId = counter++;
        this.member = member;
        this.bookItem = bookItem;
        this.status = ReservationStatus.PENDING;
    }

    public void reserve() {
        status = ReservationStatus.COMPLETED;
        bookItem.reserve();
    }

    public void cancel() {
        status = ReservationStatus.CANCELLED;
    }

    public ReservationStatus getStatus() {
        return status;
    }
}