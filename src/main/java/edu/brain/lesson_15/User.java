package edu.brain.lesson_15;

import java.util.Objects;

class User {
    private final String login;
    private final String password;
    private String name;
    private UserRoles role;

    public User(String login, String password, String name) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.role = UserRoles.ANONYMOUS;
    }

    public String getLogin() {
        return login;
    }


    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserRoles getRole() {
        return role;
    }

    public void setRole(UserRoles role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", role=" + role +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return getLogin().equals(user.getLogin()) && getPassword().equals(user.getPassword()) && getName().equals(user.getName()) && getRole() == user.getRole();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLogin(), getPassword(), getName(), getRole());
    }
}
