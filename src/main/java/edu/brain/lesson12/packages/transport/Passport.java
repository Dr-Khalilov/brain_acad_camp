package edu.brain.lesson12.packages.transport;

import java.util.UUID;

public class Passport {
    private final UUID uniqueId;
    private edu.brain.lesson12.packages.citizen.Passport owner;
    private final String transportName;

    public Passport(edu.brain.lesson12.packages.citizen.Passport owner, String transportName) {
        this.uniqueId = UUID.randomUUID();
        this.owner = owner;
        this.transportName = transportName;
    }

    public void setOwner(edu.brain.lesson12.packages.citizen.Passport owner) {
        this.owner = owner;
    }


    public Passport changeOwner(edu.brain.lesson12.packages.citizen.Passport owner) {
        return PassportUtil.changeOwner(this, owner);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "uniqueId=" + uniqueId +
                ", owner=" + owner +
                ", transportName='" + transportName + '\'' +
                '}';
    }
}
