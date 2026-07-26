package models;

public abstract   class Button {
    private boolean status;
    // add getter seeter
    public abstract boolean press();
    public abstract boolean isPressed();
}
