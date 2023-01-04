package edu.brain.lesson_9;

import java.util.Objects;

class Customer extends Person {
    private String discountCard;
    private float amountOfMoney;

    public Customer(String fullName, int numberPhone, String discountCard, float amountOfMoney) {
        super(fullName, numberPhone);
        this.discountCard = discountCard;
        this.amountOfMoney = amountOfMoney;
    }

    public String getDiscountCard() {
        return discountCard;
    }

    public void setDiscountCard(String discountCard) {
        this.discountCard = discountCard;
    }

    public float getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(float amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    String knowAboutProduct() {
        return "Клиент узнаёт про товары";
    }

    float buy(float amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
        System.out.println("Клиент покупает товары");
        float pay = 0;
        return amountOfMoney - pay;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "discountCard='" + discountCard + '\'' +
                ", amountOfMoney=" + amountOfMoney +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer customer)) return false;
        if (!super.equals(o)) return false;
        return Float.compare(customer.getAmountOfMoney(), getAmountOfMoney()) == 0 && getDiscountCard().equals(customer.getDiscountCard());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDiscountCard(), getAmountOfMoney());
    }
}
