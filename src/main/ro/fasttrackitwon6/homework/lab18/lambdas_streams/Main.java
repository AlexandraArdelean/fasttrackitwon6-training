package main.ro.fasttrackitwon6.homework.lab18.lambdas_streams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Ion", "Pop", 35, "Iasi"));
        personList.add(new Person("Ion", "Pop", 25, "Cluj"));
        personList.add(new Person("Alex", "Dumitrescu", 68, "Oradea"));
        personList.add(new Person("Alex", "Dragos", 17, "Cluj"));

        PersonService personService = new PersonService(personList);
        System.out.println(personService.getAllNames());
        System.out.println(personService.findAllPersonThatAreMajor());
        System.out.println(personService.findAllPersonsFromIasiOrCluj());
        System.out.println(personService.getNamesInCapitalLetter());
        System.out.println(personService.abbreviateLastName());
        System.out.println(personService.getPersonsWithAgeBetweenRange());
        System.out.println(personService.getAllPersonsWithNameA());
        System.out.println(personService.sortByFirstName());
        System.out.println(personService.sortByLastName());
        System.out.println(personService.sortByFirstNameLastNameAndAge());
        System.out.println(personService.groupByAge());


    }
}
