package edu.brain.lesson12.packages.test;

import edu.brain.lesson12.packages.technics.Passport;
import edu.brain.lesson12.packages.technics.PassportUtil;

class TechnicsMain {
    public static void main(String[] args) {
        Passport laptop = new Passport("MSI Katana");

        // Before warranty replace
        System.out.println(laptop);

        long i = 0;
        while (i < 1e10) {
            i++;
        }
        System.out.println("After some time...");

        // After warranty replace
        PassportUtil.warrantyReplace(laptop);
        System.out.println(laptop);
    }
}
