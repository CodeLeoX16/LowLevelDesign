package models;

import constants.EquipmentType;

public class Equipment {

    private EquipmentType type;
    private double price;

    public Equipment(EquipmentType type, double price) {
        this.type = type;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}