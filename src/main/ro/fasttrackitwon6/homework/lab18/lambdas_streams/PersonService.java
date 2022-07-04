package main.ro.fasttrackitwon6.homework.lab18.lambdas_streams;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonService {
    private List<Person> personList;

    public PersonService(List<Person> personList) {
        this.personList = Collections.unmodifiableList(personList);
    }

    public List<String> getAllNames() {
        return personList.stream()
                .map(person -> person.firstName() + " " + person.lastName()).toList();
    }

    public List<Person> findAllPersonThatAreMajor() {
        return personList.stream()
                .filter(person -> person.age() >= 18).toList();
    }

    public List<Person> findAllPersonsFromCluj() {
        return personList.stream()
                .filter(person -> person.city().equals("Cluj")).toList();
    }

    public List<Person> findAllPersonsFromIasiOrCluj() {
        return personList.stream()
                .filter(person -> person.city().equals("Cluj") || person.city().equals("Iasi")).toList();
    }

    public List<String> getNamesInCapitalLetter() {
        return personList.stream()
                .map(person -> person.firstName().toUpperCase() + " " + person.lastName().toUpperCase()).toList();
    }

    public List<String> abbreviateLastName() {
        return personList.stream()
                .map(person -> person.firstName() + " " + person.lastName().charAt(0) + ".").toList();
    }

    public List<Person> getPersonsWithAgeBetweenRange() {
        return personList.stream()
                .filter(person -> person.age() < 18 || person.age() < 60).toList();

    }

    public List<Person> getAllPersonsWithNameA() {
        return personList.stream()
                .filter(person -> person.firstName().startsWith("A")).toList();
    }

    public List<String> listFirstNamesUniquely() {
        // not sure about the implementation, because I didn't really  understand what "uniquely" refers to
        return personList.stream()
                .sorted(Comparator.comparing(Person::age))
                .map(Person::firstName)
                .toList();
    }

    public List<Person> sortByFirstName() {
        return personList.stream()
                .sorted(Comparator.comparing(Person::firstName)).toList();
    }

    public List<Person> sortByLastName() {
        return personList.stream()
                .sorted(Comparator.comparing(Person::lastName))
                .toList();
    }

    public List<Person> sortByFirstNameLastNameAndAge() {
        return personList.stream()
                .sorted(Comparator.comparing(Person::firstName).thenComparing(Person::lastName).thenComparing(Person::age))
                .toList();
    }

    public List<Person> groupByAge() {
        return personList.stream()
                .sorted(Comparator.comparingInt(Person::age))
                .toList();
    }

}

