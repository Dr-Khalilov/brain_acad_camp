package edu.brain.lesson_13.abstracts;

abstract public class AbstractMultiCooker extends AbstractDevice {
    @Override
   public void powerOn() {
        System.out.println("MultiCooker is turn on");
    }

    @Override
   public void powerOff() {
        System.out.println("MultiCooker is turn off");
    }

   public abstract void cook();
}
