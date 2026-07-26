package models;

import Interface.ParkingSpot;
import Interface.Vehicle;

import java.util.Map;

public class ParkingLotSystem {
    private int id;
    private String name;
    private String address;
    private final int MAX_CAPACITY=40000;
    private Map<String,Entrance> entrence;
    private Map<String,Exit>exit;
    private ParkingRate parkingRate;
    private Map<String , DisplayBoard>displayBoards;
    private Map<String, ParkingSpot>parkingSpot;

    private Map<String, ParkingTicket>ParkingTickets;
    // single ton design pattern

    private  static ParkingLotSystem parkinglot=null;

    private ParkingLotSystem(){};

    public static ParkingLotSystem getInstance(){
        // will this work on multu -thread env
        if(parkinglot==null){
            parkinglot=new ParkingLotSystem();
        }
        return parkinglot;

    }
    public ParkingTicket getParkingTicket(Vehicle vehicle){
        return null;
    }
    public boolean isFull(){
        return false;
    }
    public boolean addEntrance (Entrance entrance){
        return false;
    };
    public boolean addExit(Exit exit){
        return false;

    };


}
