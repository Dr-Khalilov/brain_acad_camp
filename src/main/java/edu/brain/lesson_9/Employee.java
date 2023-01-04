package edu.brain.lesson_9;

import java.util.Objects;

class Employee extends Person {
    private String employmentDate;
    private float salary;
    private String presence;

    public Employee(String fullName, int numberPhone, String employmentDate, float salary, String presence) {
        super(fullName, numberPhone);
        this.employmentDate = employmentDate;
        this.salary = salary;
        this.presence = presence;
    }

    public String getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(String employmentDate) {
        this.employmentDate = employmentDate;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getPresence() {
        return presence;
    }

    public void setPresence(String presence) {
        this.presence = presence;
    }

    float comeToWork(String presence, float salary) {
        float sal = 0;
        this.setPresence(presence);
        this.setSalary(salary);
        if (presence.equals("At work")) {
            sal = salary;
            return sal += 100.0;
        } else {
            return 0;
        }
    }

    void goToLunch(String presence) {
        this.setPresence(presence);
        if (Objects.equals(presence, "On Lunch")) {
            System.out.println("All right");
        }
    }

    float toDoWork(String presence, float salary) {
        this.setPresence(presence);
        this.setSalary(salary);
        double money = 500;
        System.out.println("Сотрудник работает");
        if (Objects.equals(presence, "Doing work")) {
            return (float) (salary * money);
        } else {
            return salary * 0;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employmentDate='" + employmentDate + '\'' +
                ", salary=" + salary +
                ", presence='" + presence + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        if (!super.equals(o)) return false;
        return Float.compare(employee.getSalary(), getSalary()) == 0 && getEmploymentDate().equals(employee.getEmploymentDate()) && getPresence().equals(employee.getPresence());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getEmploymentDate(), getSalary(), getPresence());
    }
}
