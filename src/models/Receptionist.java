package models;

import constants.AccountType;

public class Receptionist extends Account {

    public Receptionist(int id, String name, String email,
                        String phone, String password) {

        super(id, name, email, phone, password,
                AccountType.RECEPTIONIST);
    }

    public void addVehicle(Branch branch, Vehicle vehicle) {
        branch.addVehicle(vehicle);
    }

    public void removeVehicle(Branch branch, Vehicle vehicle) {
        branch.removeVehicle(vehicle);
    }
}