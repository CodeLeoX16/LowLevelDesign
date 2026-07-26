package models;

import java.util.ArrayList;
import java.util.List;

public class Branch {

    private int branchId;
    private String name;
    private String address;

    private List<Vehicle> vehicles = new ArrayList<>();

    public Branch(int branchId, String name, String address) {
        this.branchId = branchId;
        this.name = name;
        this.address = address;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}