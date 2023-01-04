package edu.brain.lesson_13;

import java.util.Arrays;
import java.util.Objects;

class Store {
    private String name;
    private String url;
    private User[] customers;
    private User authorizedUser;

    public Store(String name, String url, User[] customers) {
        this.name = name;
        this.url = url;
        this.customers = customers;
    }

    boolean login(String login, String password) {
        User user = this.getUserByLoginAndPassword(login, password);
        if (user != null) {
            authorizedUser = user;
            return true;
        }
        return false;
    }

    User getUserByLoginAndPassword(String login, String password) {
        User foundUser = null;
        for (User user : customers) {
            if (Objects.equals(login, user.getLogin()) && Objects.equals(password, user.getPassword())) {
                foundUser = user;
            }
        }
        return foundUser;
    }

    void getCurrentUserRights(User user) {
        switch (user.getRole()) {
            case DIRECTOR, ADMINISTRATOR, MANAGER, CUSTOMER, ANONYMOUS -> {
                System.out.println(user);
                System.out.println(user.getRole().description);
            }
            default -> System.out.println("User with that role not found");
        }
    }

    void logout() {
        authorizedUser = null;
        System.out.println("This user logout from system");
    }

    public User getAuthorizedUser() {
        return authorizedUser;
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", customers=" + Arrays.toString(customers) +
                ", authorizedUser=" + authorizedUser +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Store store)) return false;
        return name.equals(store.name) && url.equals(store.url) && Arrays.equals(customers, store.customers) && authorizedUser.equals(store.authorizedUser);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, url, authorizedUser);
        result = 31 * result + Arrays.hashCode(customers);
        return result;
    }
}
