package edu.brain.lesson_19;

import java.util.Objects;

class User {
    private final String name;
    private final int old;
    private final String phone;

    public User(String name, int old, String phone) {
        this.name = name;
        this.old = old;
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return old == user.old && name.equals(user.name) && phone.equals(user.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, old, phone);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", old=" + old +
                ", phone='" + phone + '\'' +
                '}';
    }
}
