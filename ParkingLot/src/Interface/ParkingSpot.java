package Interface;
import Interface.Payment;
import Interface.Vehicle;
public abstract class ParkingSpot {
private int id;
private boolean isFree;
private Vehicle vehicle;
public abstract boolean getIsFree();

}
