package models;

import Interface.Account;
import Interface.ParkingSpot;

public class AdminAccount extends Account {


    public  boolean addEntrance (Entrance entrance){
        //add my
        return false;
    }
    public  boolean addExit (Exit exit){
        //add my
        return false;
    }
    public  boolean addParkingSpot (ParkingSpot spot){
        //add my
        return false;
    }
    public  boolean DisplayBoard (DisplayBoard board){
        //add my
        return false;
    }

    @Override
    public boolean resetPassword() {
        // add ur own implementation
        return false;
    }
}
