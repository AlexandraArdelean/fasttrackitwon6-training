package main.ro.fasttrackitwon6.homework.lab11.exercise4;

import main.ro.fasttrackitwon6.homework.lab11.exercise3.Person;

public class Employee extends Person {
    private final String company;
    private final Integer salary;

    public Employee(String company, int salary) {
        this.company = company;
        this.salary = salary;
    }

    public Employee(String name, Integer age, String hairColor, String company, Integer salary) {
        super(name, age, hairColor);
        this.company = company;
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "company='" + company + '\'' +
                ", salary=" + salary +
                '}' + super.toString();
    }
}
