package edu.brain.lesson12.packages.citizen;

import java.util.Date;
import java.util.UUID;

public class Passport {
    private final UUID uniqueId;
    private UUID spouseId;
    private final String name;
    private final String surname;
    private final Date birthday;

    public Passport(String name, String surname, Date birthday) {
        this.uniqueId = UUID.randomUUID();
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public UUID getUniqueId() {
        return uniqueId;
    }

    public void setSpouseId(UUID spouseId) {
        this.spouseId = spouseId;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "uniqueId=" + uniqueId +
                ", spouseId=" + spouseId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
