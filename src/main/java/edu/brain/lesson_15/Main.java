package edu.brain.lesson_15;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        User director = new User("NeoLog123", "123456", "Umar");
        director.setRole(UserRoles.DIRECTOR);

        User administrator = new User("cjxcs", "434424", "Slava");
        administrator.setRole(UserRoles.ADMINISTRATOR);


        User manager = new User("mykhaylov191", "243932749234", "Владик");
        manager.setRole(UserRoles.MANAGER);


        User customer = new User("Papan", "38984928", "Вася");
        customer.setRole(UserRoles.CUSTOMER);

        User anonymous = new User("uruk221", "e47854875", "Petya");

        User[] users = {customer, manager, director, administrator, anonymous};
        Store adidas = new Store("Adidas", "www.adidas.com", users);


        while (true) {
            tryLogin(adidas);
        }
    }

    static void tryLogin(Store store) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин:");
        String login = scanner.nextLine();
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();
        if (store.login(login, password)) {
            store.getCurrentUserRights(store.getAuthorizedUser());
            store.logout();
        } else {
            System.out.println("Неверный логин или пароль");
        }
    }
}
