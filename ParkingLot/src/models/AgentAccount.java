package models;

import Interface.Account;

public class AgentAccount extends Account {
    public boolean processTicket (ParkingTicket ticket){
        // my implementation
        return false;
    }

    @Override
    public boolean resetPassword(){
        return false;
    }
}
