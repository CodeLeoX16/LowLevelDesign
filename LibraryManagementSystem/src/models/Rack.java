package models;

public class Rack {

    private String rackNumber;
    private String location;

    public Rack(String rackNumber, String location) {
        this.rackNumber = rackNumber;
        this.location = location;
    }

    public void displayRack() {
        System.out.println("Rack : " + rackNumber);
        System.out.println("Location : " + location);
    }
}