package main.ro.fasttrackitwon6.homework.lab9.exercise2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Employee implements Person {
    private String firstName;
    private String lastName;
    private String address;
    private LocalDateTime birthday;

    protected String position;
    private LocalDateTime dateOfEmployment;

    public Employee(String firstName, String lastName,LocalDateTime birthday,
                    String address,
                    String position,
                    LocalDateTime dateOfEmployment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.birthday = birthday;
        this.dateOfEmployment = dateOfEmployment;
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public LocalDateTime getBirthday() {
        return birthday;
    }

    @Override
    public String getAddress() {
        return address;
    }
}
