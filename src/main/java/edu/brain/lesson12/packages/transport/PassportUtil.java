package edu.brain.lesson12.packages.transport;

public class PassportUtil {
    private PassportUtil() {
        /**
         * Private constructor
         */
    }

    static Passport changeOwner(Passport passport, edu.brain.lesson12.packages.citizen.Passport owner) {
        passport.setOwner(owner);
        return passport;
    }
}
