package edu.brain.lesson_13.abstracts;

abstract public class AbstractDevice {
    public String name;
    public int serialNumber;

    public AbstractDevice() {
        powerOn();
    }

    public abstract void powerOn();

    public abstract void powerOff();
}
