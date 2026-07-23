package models;

import constants.CarType;
import constants.VehicleType;

public class Car extends Vehicle {

    private CarType carType;

    public Car(String vehicleNo,
               String company,
               String model,
               double rentPerDay,
               CarType carType) {

        super(vehicleNo, company, model,
                rentPerDay, VehicleType.CAR);

        this.carType = carType;
    }
}