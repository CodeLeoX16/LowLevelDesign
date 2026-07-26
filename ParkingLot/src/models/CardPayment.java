package models;
import Interface.Payment;
public class CardPayment extends Payment{
    @Override

    public  boolean initiateTransaction(){
        return false;
    }
}
