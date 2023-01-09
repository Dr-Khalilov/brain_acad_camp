package edu.brain.lesson12.packages.technics;

import java.util.Date;

public class PassportUtil {
    private PassportUtil() {
        /**
         * Private constructor
         */
    }

    public static void warrantyReplace(Passport passport) {
        passport.setWarrantyStartDate(new Date());
    }
}
