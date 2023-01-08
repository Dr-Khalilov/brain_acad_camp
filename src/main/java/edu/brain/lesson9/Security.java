package edu.brain.lesson9;

import java.util.Objects;

class Security extends Employee {
    protected String name;

    public Security(String fullName, int numberPhone, String employmentDate, float salary, String presence, String name) {
        super(fullName, numberPhone, employmentDate, salary, presence);
        this.name = name;
    }

    String talkOnTheRadio(String name) {
        this.name = name;
        return "Охранник " + name + " говорит по рации";
    }

    @Override
    float comeToWork(String presence, float salary) {
        return super.comeToWork(presence, salary);
    }

    @Override
    float toDoWork(String presence, float salary) {
        System.out.println("Охранник следит за порядком в магазине, отвечает за безопасность сотрудников и имущество");
        return super.toDoWork(presence, salary);
    }

    @Override
    public String toString() {
        return "Security{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Security security)) return false;
        if (!super.equals(o)) return false;
        return name.equals(security.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }
}
