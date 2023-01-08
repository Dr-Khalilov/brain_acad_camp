package edu.brain.lesson9;

import java.util.Arrays;
import java.util.Objects;

class Shop {
    private final String name;
    private final String address;
    private final Manager[] managers;
    private final Cashier[] cashiers;
    private final Security[] security;
    private final Customer[] customers;

    public Shop(String name, String address) {
        this.name = name;
        this.address = address;
        openUp();
        sellProduct();
        goToLunch();
    }

    {
        this.managers = new Manager[]{
                new Manager("Linda Hilton", +39094939, "10.12.1999", 50, "At work", "Staff"),
                new Manager("Herman Andersen", +425635, "10.12.1999", 42.4F, "At work", "Head")
        };
        this.cashiers = new Cashier[]{
                new Cashier("Margaret Newman", +3422522, "20.09.2010", 40, "At work", 3),
                new Cashier("Tom Berth", +5225242, "22.11.2020", 53.2f, "At work", 4)};

        this.security = new Security[]{
                new Security("Kevin Kostner", +4255222, "22.11.2020", 30, "At work", "Васёк"),
                new Security("Larry Bronson", +534221, "10.12.1999", 553.2f, "Unknown", "Bronson"),
        };

        this.customers = new Customer[]{
                new Customer("Harold Harmon", +4325522, "Silpo", 1000),
                new Customer("Hercules Harmon", +4325555, "Metro", 2000),
                new Customer("Herman Harmon", +4322521, "ATB", 3000),
        };

    }

    public void openUp() {
        System.out.println("Магазин открывается");
        System.out.println("Все сотрудники приходят на работу");
        for (Manager manager : managers) {
            System.out.println(manager.comeToWork("At work", 50.3f) + " " + manager);
        }

        for (Cashier cashier : cashiers) {
            System.out.println(cashier.comeToWork("At work", 40) + " " + cashier);
        }

        for (Security security : security) {
            System.out.println(security.comeToWork("At work", 30) + " " + security);
        }
    }

    public void sellProduct() {
        System.out.println("Магазин начинает продавать товары");
        System.out.println(customers[0].knowAboutProduct());
        System.out.println(customers[1].buy(24.5f));
        System.out.println(customers[0].knowAboutProduct());
        managers[0].toDoWork("At work", 50);
        managers[1].consulting();
        managers[0].sayAboutDiscount();
        managers[1].giveAdvice();
        cashiers[0].toDoWork("At work", 40);
        cashiers[1].countOfMoney();
        security[0].toDoWork("At work", 30);
        System.out.println(security[1].talkOnTheRadio("Васёк"));
    }

    public void goToLunch() {
        System.out.println("Магазин закрывается на обед. Все сотрудники пошли на обед");
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", managers=" + Arrays.toString(managers) +
                ", cashiers=" + Arrays.toString(cashiers) +
                ", security=" + Arrays.toString(security) +
                ", customers=" + Arrays.toString(customers) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shop shop)) return false;
        return name.equals(shop.name) && address.equals(shop.address) && Arrays.equals(managers, shop.managers) && Arrays.equals(cashiers, shop.cashiers) && Arrays.equals(security, shop.security) && Arrays.equals(customers, shop.customers);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, address);
        result = 31 * result + Arrays.hashCode(managers);
        result = 31 * result + Arrays.hashCode(cashiers);
        result = 31 * result + Arrays.hashCode(security);
        result = 31 * result + Arrays.hashCode(customers);
        return result;
    }
}

