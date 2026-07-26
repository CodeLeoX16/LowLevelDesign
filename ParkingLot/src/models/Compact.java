package models;

import Interface.ParkingSpot;

public class Compact extends ParkingSpot {
    @Override
    public boolean getIsFree(){
        // implement
        return false;
    }
}
