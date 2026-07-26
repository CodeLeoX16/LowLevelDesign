package models;

import constants.DirectionStatus;

public class HallButton extends Button {
    private DirectionStatus DirectionButton;

    @Override
    public boolean press() {
        return false;
    }

    @Override
    public boolean isPressed() {
        return false;
    }
}
