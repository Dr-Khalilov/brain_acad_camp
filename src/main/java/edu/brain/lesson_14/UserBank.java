package edu.brain.lesson_14;

class UserBank {
    public static void main(String[] args) {
        try {
            MoneyTransactionUtil.sendTo(123456789, 987654321, 100);
        } catch (AccountException | MoneyValueException e) {
            e.printStackTrace();
        }

        try {
            MoneyTransactionUtil.sendTo(12345, 12345, 100);
        } catch (AccountException | MoneyValueException e) {
            if (e instanceof AccountException) {
                System.err.println("Ошибка с реквизитами банка. Возможно, номер карты отправителя и получателя совпадают");
            }
        }
        try {
            MoneyTransactionUtil.sendTo(123456, 654321, 100_000_0);
        } catch (AccountException | MoneyValueException exception) {
            exception.printStackTrace();
            if (exception instanceof MoneyValueException) {
                System.err.println("Ошибка с суммой отправки. Сумма должна быть больше 0. Сумма не должна превышать лимит в 100_000");
            }
        }
    }
}
