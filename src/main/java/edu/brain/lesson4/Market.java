package edu.brain.lesson4;

import java.util.Objects;

class Market {
    private static final int DIRECTORS = 3;
    private String name;
    private int amountClients;
    private int bonus;

    public Market(String name, int amountClients) {
        this.name = name;
        this.amountClients = amountClients;
    }

    public String addCart(String name) {
        if (Objects.equals(name, "Умар")) {
            return "Возьмите пожалуйста корзину с полки и наполняйте её по мере необходимости товарами";
        } else {
            return "Возьми пакет и клади туда не больше 2-х вещей";
        }
    }

    public String getBonusCash(int amountBonus) {
        return "У вас " + (amountBonus / 10 + this.bonus) + " накопленных бонусных денег!";
    }

    public String buyProduct(int cash, String creditCard) {
        if (cash <= 1000) {
            return "" + cash;
        } else {
            return creditCard;
        }
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getDIRECTORS() {
        return DIRECTORS;
    }

    public int getClients() {
        return this.amountClients;
    }

    public void setClients(int clients) {
        this.amountClients = clients;
    }

    @Override
    public String toString() {
        return "class Market{" +
                "name='" + name + '\'' +
                ", amountClients=" + amountClients +
                ", bonus=" + bonus +
                '}';
    }
}
