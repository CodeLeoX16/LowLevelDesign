package models;

public class Fine {

    private double amount;
    private String reason;

    public Fine(double amount, String reason) {
        this.amount = amount;
        this.reason = reason;
    }

    public double getAmount() {
        return amount;
    }
}