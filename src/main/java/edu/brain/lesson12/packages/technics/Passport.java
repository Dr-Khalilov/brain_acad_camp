package edu.brain.lesson12.packages.technics;

import java.util.Date;
import java.util.UUID;

public class Passport {
    private final UUID uniqueId;
    private final String deviceName;
    private Date warrantyStartDate;

    public Passport(String deviceName) {
        this.uniqueId = UUID.randomUUID();
        this.deviceName = deviceName;
        this.warrantyStartDate = new Date();
    }

    public void setWarrantyStartDate(Date warrantyStartDate) {
        this.warrantyStartDate = warrantyStartDate;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "uniqueId=" + uniqueId +
                ", deviceName='" + deviceName + '\'' +
                ", warrantyStartDate=" + warrantyStartDate +
                '}';
    }
}
