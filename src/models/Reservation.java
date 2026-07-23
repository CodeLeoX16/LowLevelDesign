package models;

import constants.ReservationStatus;

public class Reservation {

    private static int counter = 1;

    private int reservationId;
    private Customer customer;
    private Vehicle vehicle;
    private ReservationStatus status;

    public Reservation(Customer customer, Vehicle vehicle) {
        this.reservationId = counter++;
        this.customer = customer;
        this.vehicle = vehicle;
        this.status = ReservationStatus.CREATED;
    }

    public void confirm() {
        status = ReservationStatus.CONFIRMED;
        vehicle.reserve();
    }

    public void cancel() {
        status = ReservationStatus.CANCELLED;
        vehicle.returnVehicle();
    }

    public void complete() {
        status = ReservationStatus.COMPLETED;
        vehicle.returnVehicle();
    }

    public ReservationStatus getStatus() {
        return status;
    }
}