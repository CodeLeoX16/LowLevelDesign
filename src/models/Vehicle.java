package models;

import constants.VehicleType;

public abstract class Vehicle {

    protected String vehicleNo;
    protected String company;
    protected String model;
    protected double rentPerDay;
    protected boolean available;
    protected VehicleType vehicleType;

    public Vehicle(String vehicleNo, String company,
                   String model, double rentPerDay,
                   VehicleType vehicleType) {

        this.vehicleNo = vehicleNo;
        this.company = company;
        this.model = model;
        this.rentPerDay = rentPerDay;
        this.vehicleType = vehicleType;
        this.available = true;
    }

    public void reserve() {
        available = false;
    }

    public void returnVehicle() {
        available = true;
    }

    public boolean isAvailable() {
        return available;
    }
}