package models;

import constants.NotificationType;

public class Notification {

    private String message;
    private NotificationType type;

    public Notification(String message,
                        NotificationType type) {

        this.message = message;
        this.type = type;
    }

    public void send() {

        System.out.println("Notification : " + message);
    }
}