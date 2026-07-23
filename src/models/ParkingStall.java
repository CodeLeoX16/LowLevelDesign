package models;

public class ParkingStall {

    private String stallId;
    private Vehicle vehicle;

    public ParkingStall(String stallId) {
        this.stallId = stallId;
    }

    public void assignVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void removeVehicle() {
        this.vehicle = null;
    }

    public boolean isOccupied() {
        return vehicle != null;
    }
}