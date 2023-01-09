package edu.brain.lesson12.packages.citizen;

public class PassportUtil {
    private PassportUtil() {
        /**
         * Private constructor
         */
    }

    public static void registerMarriage(Passport firstPassport, Passport secondPassport) {
        firstPassport.setSpouseId(secondPassport.getUniqueId());
        secondPassport.setSpouseId(firstPassport.getUniqueId());
    }
}
