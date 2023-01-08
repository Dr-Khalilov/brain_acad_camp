package edu.brain.lesson_16;

class MoneyTransactionUtil {

    private MoneyTransactionUtil() {
    }

    public static void sendTo(int firstCardNumber, int secondCardNumber, double sum) throws AccountException, MoneyValueException {

        if (firstCardNumber == secondCardNumber || firstCardNumber != 0 && secondCardNumber != 0) {
            throw new AccountException();
        } else if (sum <= 0 || sum > 100_000) {
            throw new MoneyValueException();
        } else {
            System.out.println("Сумма " + sum + ", со счёта " + firstCardNumber + " успешно переведена на счёт " + secondCardNumber);
        }
    }
}
