package edu.brain.lesson9;

import java.util.Objects;

class Person {
    private String fullName;
    private String birthday;
    private int numberPhone;

    public Person(String fullName, int numberPhone) {
        this.fullName = fullName;
        this.numberPhone = numberPhone;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    void sayHello() {
        System.out.println("Hello");
    }

    void sayBuy() {
        System.out.println("Goodbye");
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return getNumberPhone() == person.getNumberPhone() && getFullName().equals(person.getFullName()) && getBirthday().equals(person.getBirthday());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFullName(), getBirthday(), getNumberPhone());
    }
}
