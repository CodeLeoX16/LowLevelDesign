package models;

import constants.AccountType;

public class Customer extends Account {

    private String drivingLicense;

    public Customer(int id, String name, String email, String phone,
                    String password, String drivingLicense) {

        super(id, name, email, phone, password, AccountType.CUSTOMER);
        this.drivingLicense = drivingLicense;
    }

    public Reservation makeReservation(Vehicle vehicle) {
        return new Reservation(this, vehicle);
    }

    public void cancelReservation(Reservation reservation) {
        reservation.cancel();
    }
}