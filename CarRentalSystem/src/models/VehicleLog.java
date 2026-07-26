package models;

public class VehicleLog {

    private String date;
    private String description;

    public VehicleLog(String date, String description) {
        this.date = date;
        this.description = description;
    }

    public void showLog() {
        System.out.println(date + " : " + description);
    }
}