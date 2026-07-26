package models;

import Interface.ParkingSpot;

public class MotorCycle extends ParkingSpot {
    @Override
    public boolean getIsFree(){
        // implement
        return false;
    }
}
