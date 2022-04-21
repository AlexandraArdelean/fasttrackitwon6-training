package main.ro.fasttrackitwon6.homework.lab9.exercise2;

import java.time.LocalDateTime;


public class CompanyMain {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("java", "Ion",
                "Pop", LocalDateTime.parse("1969-04-25T10:14:15"), "Str. Plopilor 24", "junior",
                LocalDateTime.parse("2001-06-01T15:15:01"));
        System.out.println(getFullName(programmer));
        System.out.println(calculateAge(programmer));

        Employee employee = new Employee("Ana", "Radu",
                LocalDateTime.parse("1991-11-24T12:12:02"), "Baia Mare, Str. Oituz, nr. 2A",
                "administrator", LocalDateTime.parse("2015-10-01T15:00:00"));
        System.out.println(getFullName(employee));
        System.out.println(calculateAge(employee));

        DatabaseAdmin databaseAdmin = new DatabaseAdmin("PSQL", "Andrei", "Popescu",
                LocalDateTime.parse("1991-01-19T14:20:33"),"Baia Mare, str. Republicii, nr. 45/6", "junior database admin",
                LocalDateTime.parse("2022-03-21T18:10:20"));
        System.out.println(getFullName(databaseAdmin));
        System.out.println(calculateAge(databaseAdmin));

    }

    private static String getFullName(Person person) {
        return person.getFirstName() + " " + person.getLastName();
    }

    private static int calculateAge(Person person) {
        LocalDateTime dateOfBirth = person.getBirthday();
        LocalDateTime currentDate = LocalDateTime.now();
        int age = currentDate.getYear() - dateOfBirth.getYear();
        return age;
    }


}
