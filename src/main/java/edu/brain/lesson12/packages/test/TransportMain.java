package edu.brain.lesson12.packages.test;

import java.util.Calendar;
import java.util.Date;

import edu.brain.lesson12.packages.transport.Passport;

class TransportMain {
    public static void main(String[] args) {
        // Create new person
        edu.brain.lesson12.packages.citizen.Passport firstPerson = new edu.brain.lesson12.packages.citizen.Passport("Umar", "Khalilov", new Date(93, Calendar.DECEMBER, 12));

        // Create new car with owner
        Passport carPassport = new Passport(firstPerson, "Tesla Cybertruck");
        System.out.println("Before change owner:");
        System.out.println(carPassport);

        // Create new person yet
        edu.brain.lesson12.packages.citizen.Passport secondPerson = new edu.brain.lesson12.packages.citizen.Passport("Selime", "Kurtametova", new Date(91, Calendar.MARCH, 14));

        // Change car`s owner
        Passport soldCar = carPassport.changeOwner(secondPerson);
        System.out.println("After changed owner:");
        System.out.println(soldCar);
    }
}
