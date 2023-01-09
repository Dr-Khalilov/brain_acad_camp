package edu.brain.lesson12.packages.test;

import java.util.Calendar;
import java.util.Date;

import edu.brain.lesson12.packages.citizen.Passport;

import static edu.brain.lesson12.packages.citizen.PassportUtil.registerMarriage;


class CitizenMain {
    public static void main(String[] args) {
        Passport husbandPassport = new Passport("Umar", "Khalilov", new Date(93, Calendar.DECEMBER, 12));
        Passport wifePassport = new Passport("Selime", "Kurtametova", new Date(91, Calendar.MARCH, 14));
        registerMarriage(husbandPassport, wifePassport);

        System.out.println(husbandPassport);
        System.out.println(wifePassport);
    }
}
