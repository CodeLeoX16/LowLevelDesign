package models;

import Interface.ParkingSpot;

public class Handicapped extends ParkingSpot {
    @Override

    public boolean getIsFree(){
        // implement
        return false;
    }

}
