package main.ro.fasttrackitwon6.homework.lab9.exercise2;

import java.time.LocalDateTime;

public class DatabaseAdmin extends Employee {
    private String dbTechnology;

    public DatabaseAdmin(String dbTechnology, String firstName, String lastName, LocalDateTime birthday,
                         String address, String position,
                         LocalDateTime dateOfEmployment) {
        super(firstName, lastName, birthday, address, position, dateOfEmployment);
        this.dbTechnology = dbTechnology;

    }

    public String getDbTechnology(String dbTechnology) {
        return dbTechnology;
    }

    @Override
    public String getAddress() {
        return "db admin " + super.getAddress();
    }
}
