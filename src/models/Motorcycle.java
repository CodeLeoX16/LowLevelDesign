package models;

import constants.MotorcycleType;
import constants.VehicleType;

public class Motorcycle extends Vehicle {

    private MotorcycleType motorcycleType;

    public Motorcycle(String vehicleNo,
                      String company,
                      String model,
                      double rentPerDay,
                      MotorcycleType motorcycleType) {

        super(vehicleNo, company, model,
                rentPerDay, VehicleType.MOTORCYCLE);

        this.motorcycleType = motorcycleType;
    }
}