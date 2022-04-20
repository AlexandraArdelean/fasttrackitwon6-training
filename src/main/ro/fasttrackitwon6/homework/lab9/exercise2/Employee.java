package main.ro.fasttrackitwon6.homework.lab9.exercise2;

import java.time.LocalDate;
import java.util.Date;

public class Employee implements Person{
    private Date dateOfEmployment;
    protected String position;

    public Employee() {
    }

    public Date getDateOfEmployment() {
        return dateOfEmployment;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String getFirstName(String firstName) {
        return firstName;
    }

    @Override
    public String getLastName(String lastName) {
        return lastName;
    }

    @Override
    public LocalDate getBirthday(LocalDate birthday) {
        return birthday;
    }

    @Override
    public String getAddress(String address) {
        return address;
    }
}
