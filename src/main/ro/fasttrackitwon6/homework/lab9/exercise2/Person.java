package main.ro.fasttrackitwon6.homework.lab9.exercise2;

import java.time.LocalDate;

public interface Person {
    String getFirstName(String firstName);
    String getLastName(String lastName);
    LocalDate getBirthday(LocalDate birthday);
    String getAddress(String address);

}
