package edu.brain.lesson_9;

import java.util.Objects;

class Manager extends Employee {
    private String department;

    public Manager(String fullName, int numberPhone, String employmentDate, float salary, String presence, String department) {
        super(fullName, numberPhone, employmentDate, salary, presence);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void consulting() {
        System.out.println("Менеджер рассказывает о товаре");
    }

    public void sayAboutDiscount() {
        System.out.println("Менеджер рассказывает о скидках");
    }

    public void giveAdvice() {
        System.out.println("Менеджер советует потребителям");
    }

    @Override
    float comeToWork(String presence, float salary) {
        return super.comeToWork(presence, salary);
    }

    @Override
    float toDoWork(String presence, float salary) {
        System.out.println("Менеджер отвечает за правильную организацию рабочего процесса");
        return super.toDoWork(presence, salary);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "department='" + department + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager manager)) return false;
        if (!super.equals(o)) return false;
        return getDepartment().equals(manager.getDepartment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDepartment());
    }
}
