package models;

import constants.TruckType;
import constants.VehicleType;

public class Truck extends Vehicle {

    private TruckType truckType;

    public Truck(String vehicleNo,
                 String company,
                 String model,
                 double rentPerDay,
                 TruckType truckType) {

        super(vehicleNo, company, model,
                rentPerDay, VehicleType.TRUCK);

        this.truckType = truckType;
    }
}