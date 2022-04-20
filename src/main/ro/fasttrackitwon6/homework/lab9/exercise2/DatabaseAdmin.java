package main.ro.fasttrackitwon6.homework.lab9.exercise2;

public class DatabaseAdmin extends Employee{
    private String dbTechnology;

    public DatabaseAdmin() {
    }

    public String getDbTechnology(String dbTechnology) {
        return dbTechnology;
    }

    @Override
    public String getAddress(String address) {
        return address;
    }
}
