package models;

import Interface.Vehicle;

public class ParkingTicket {
    private  int ticketNo;
    private Date entryTimestamp;
    private  Date  exitTimestamp;
    private double amount;
    private boolean status;
    private Vehicle vehicle;
    private Payment payment;
    private Entrance entrance;
    private Exit exit;
}
