package models;

public class ElevatorButton extends Button {
    private int destinationFloorNumber;
    @Override
    public boolean press() {
        return false;
    }

    @Override
    public boolean isPressed() {
        return false;
    }
}
