package models;

import Interface.ParkingSpot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class DisplayBoard {
    private int id;
    private Map<String,List<ParkingSpot>> parkingSpots;

    // constructor
    public DisplayBoard(int id){
        this.id=id;
        parkingSpots=new HashMap<>();
    }
    public  void showFree(){};
    public void sendParkingFullNotification(){};
    public void addParkingSlot(String spotType,List<ParkingSpot>spots){

    }
}




