package models;

import constants.VanType;
import constants.VehicleType;

public class Van extends Vehicle {

    private VanType vanType;

    public Van(String vehicleNo,
               String company,
               String model,
               double rentPerDay,
               VanType vanType) {

        super(vehicleNo, company, model,
                rentPerDay, VehicleType.VAN);

        this.vanType = vanType;
    }
}