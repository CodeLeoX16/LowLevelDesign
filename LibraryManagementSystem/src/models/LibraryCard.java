package models;

public class LibraryCard {

    private String cardNumber;
    private boolean active;

    public LibraryCard(String cardNumber) {
        this.cardNumber = cardNumber;
        this.active = true;
    }

    public boolean isActive() {
        return active;
    }

    public void deactivate() {
        active = false;
    }
}