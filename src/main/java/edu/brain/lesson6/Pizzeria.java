package edu.brain.lesson6;

class Pizzeria {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Львовская", "Сыр, колбаса, грибы, лук, чеснок, тесто, томаты", 10, 20);
        Pizza pizza2 = new Pizza("Крымская", "Мясо говяжье, мясо куриное, томаты, лук," +
                " перец болгарский, перец чили", 15, 15);
        Pizza pizza3 = new Pizza("Итальянская", "Сыр, колбаса, брынза, укроп, петрушка, лук, " +
                "перец болгарский, томаты яйца", 20, 12);
        Pizza pizza4 = new Pizza("Карбонара", "Тесто, сыр, мясо, томаты, лук, перец", 13, 20);
        Pizza pizza5 = new Pizza("Запорожская", "Картошка, сыр, сухожилия, кости, кожа", 22, 29);

        Pizza[] pizzaList = {pizza1, pizza2, pizza3, pizza4, pizza5};

        for (Pizza pizza : pizzaList) {
            System.out.println(pizza);
        }

    }
}
