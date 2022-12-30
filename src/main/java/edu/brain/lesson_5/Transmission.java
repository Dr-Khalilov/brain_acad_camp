package edu.brain.lesson_5;

class Transmission {
    private String type;
    private String gear;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "type='" + type + '\'' +
                ", gear='" + gear + '\'' +
                '}';
    }
}
