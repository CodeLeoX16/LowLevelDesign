package Interface;

import constants.PaymentStatus;

public abstract class Payment {
    private double amount;
    private PaymentStatus status;
    private Date timestamp;
    private string transactionID;


    public abstract  boolean initiateTransaction();
}
