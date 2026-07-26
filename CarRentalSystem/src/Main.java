import constants.*;
import models.*;

public class Main {

    public static void main(String[] args) {

        // Create Branch
        Branch branch = new Branch(1, "Kolkata Branch", "Salt Lake");

        // Create Vehicles
        Vehicle car = new Car(
                "WB20AB1234",
                "Toyota",
                "Innova",
                2500,
                CarType.SUV
        );

        Vehicle bike = new Motorcycle(
                "WB20CD5678",
                "Royal Enfield",
                "Classic 350",
                1200,
                MotorcycleType.CRUISER
        );

        // Add vehicles to branch
        branch.addVehicle(car);
        branch.addVehicle(bike);

        // Create Customer
        Customer customer = new Customer(
                101,
                "Somnath",
                "somnath@gmail.com",
                "9876543210",
                "12345",
                "DL123456"
        );

        // Customer Login
        if (customer.login("somnath@gmail.com", "12345")) {
            System.out.println("Customer Login Successful");
        }

        // Make Reservation
        Reservation reservation = customer.makeReservation(car);

        // Confirm Reservation
        reservation.confirm();

        System.out.println("Reservation Status : " + reservation.getStatus());

        // Equipment
        Equipment gps = new Equipment(
                EquipmentType.GPS,
                300
        );

        // Service
        Service driver = new Service(
                ServiceType.DRIVER,
                800
        );

        System.out.println("GPS Cost : " + gps.getPrice());
        System.out.println("Driver Cost : " + driver.getPrice());

        // Parking Stall
        ParkingStall stall = new ParkingStall("P-101");
        stall.assignVehicle(car);

        System.out.println("Parking Occupied : " + stall.isOccupied());

        // Vehicle Log
        VehicleLog log = new VehicleLog(
                "24-07-2026",
                "Vehicle Issued"
        );

        log.showLog();

        // Fine
        Fine fine = new Fine(
                500,
                "Late Return"
        );

        System.out.println("Fine Amount : " + fine.getAmount());

        // Notification
        Notification notification = new Notification(
                "Your vehicle has been successfully booked."
        );

        notification.send();

        // Complete Reservation
        reservation.complete();

        System.out.println("Reservation Status : " + reservation.getStatus());

        // Customer Logout
        customer.logout();
    }
}