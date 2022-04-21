package main.ro.fasttrackitwon6.homework.lab9.exercise2;

import java.time.LocalDateTime;

public class Programmer extends Employee {
    private String language;

    public Programmer(String language, String firstName, String lastName,LocalDateTime birthday,
                      String address,
                      String position,LocalDateTime dateOfEmployment) {
        super(firstName, lastName, birthday, address, position,dateOfEmployment);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String getPosition() {
        System.out.println("Superclass value for position is: " + super.getPosition());
        return "programmer";
    }

}
