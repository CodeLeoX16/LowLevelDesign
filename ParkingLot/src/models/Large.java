package models;

import Interface.ParkingSpot;

public class Large extends ParkingSpot {
    @Override
    public boolean getIsFree(){
        // implement
        return false;
    }
}
