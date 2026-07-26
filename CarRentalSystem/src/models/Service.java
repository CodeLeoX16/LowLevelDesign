package models;

import constants.ServiceType;

public class Service {

    private ServiceType type;
    private double price;

    public Service(ServiceType type, double price) {
        this.type = type;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}