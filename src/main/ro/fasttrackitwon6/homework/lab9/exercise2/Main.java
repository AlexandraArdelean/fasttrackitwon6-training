package main.ro.fasttrackitwon6.homework.lab9.exercise2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Employee();
        System.out.println("Person with name " + person.getFirstName("Ion ") + person.getLastName("Popescu ") +
                "was born at " + person.getBirthday(LocalDate.of(1991, 11, 2)));


        Person employee = new Employee();
        System.out.println("Employee with name " + employee.getFirstName("Andreea ") + employee.getLastName("Popa ") +
                "was born at " + employee.getBirthday(LocalDate.of(1990, 05, 24)));

        Programmer programmer = new Programmer();
        System.out.println("Programmer with name " + programmer.getFirstName("Dragos ") + programmer.getLastName("Voda ") +
                "was born at " + programmer.getBirthday(LocalDate.of(1969, 10, 24)));


        DatabaseAdmin dbAdmin = new DatabaseAdmin();
        System.out.println("Database admin with name: " + dbAdmin.getFirstName("Ionut ") + dbAdmin.getLastName("Danila ") +
                "was born at " + dbAdmin.getBirthday(LocalDate.of(1969, 03, 01)) + "  lives at address: " +
                dbAdmin.getAddress("Baia Mare, nr. 22A, Str. Plopilor, jud. Maramures") + " and is a " +
                dbAdmin.getDbTechnology("database specialist."));

        Person dbAdmin2 = new DatabaseAdmin();
        System.out.println("Database admin with name: " + dbAdmin2.getFirstName("Maria ") + dbAdmin2.getLastName("Radu ") +
                "was born at " + dbAdmin2.getBirthday(LocalDate.of(1988, 12, 24)) + "  lives at address: " +
                dbAdmin2.getAddress("Baia Mare, nr. 415, Str. Margelelor, jud. Maramures"));

    }


}
