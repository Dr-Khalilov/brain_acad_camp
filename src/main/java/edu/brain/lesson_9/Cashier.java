package edu.brain.lesson_9;

import java.util.Objects;

class Cashier extends Employee {
    private int numberCashBox;

    public Cashier(String fullName, int numberPhone, String employmentDate, float salary, String presence, int numberCashBox) {
        super(fullName, numberPhone, employmentDate, salary, presence);
        this.numberCashBox = numberCashBox;
    }

    public int getNumberCashBox() {
        return numberCashBox;
    }

    public void setNumberCashBox(int numberCashBox) {
        this.numberCashBox = numberCashBox;
    }

    void countOfMoney() {
        System.out.println("Кассир считает деньги");
    }

    @Override
    float comeToWork(String presence, float salary) {
        return super.comeToWork(presence, salary);
    }

    @Override
    float toDoWork(String presence, float salary) {
        System.out.println("Работа кассира заключается в обслуживании клиентов за кассой и в правильном подсчитывании денег");
        return super.toDoWork(presence, salary);
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "numberCashBox=" + numberCashBox +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cashier cashier)) return false;
        if (!super.equals(o)) return false;
        return getNumberCashBox() == cashier.getNumberCashBox();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNumberCashBox());
    }
}
