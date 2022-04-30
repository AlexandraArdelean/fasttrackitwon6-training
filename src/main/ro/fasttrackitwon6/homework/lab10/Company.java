package main.ro.fasttrackitwon6.homework.lab10;

import java.util.ArrayList;
import java.util.List;

public class Company {
    public static void main(String[] args) {
        List<Person> workersList = new ArrayList<>();

        Person manager = new Person("Ion Pop", 35, "manager");
        Person welder = new Person("Vasile Ionescu", 45, "welder");
        Person carpenter1 = new Person("Gheorghe Muresan", 51, "carpenter");
        Person carpenter2 = new Person("Maria Dragomir", 49, "carpenter");
        Person plumber = new Person("Ghita Marincas", 55, "plumber");

        workersList.add(manager);
        workersList.add(welder);
        workersList.add(carpenter1);
        workersList.add(carpenter2);
        workersList.add(plumber);

        System.out.println(getManager(workersList));
        System.out.println(getPersons(workersList, "carpenter"));
        System.out.println(getPersonsOlder(workersList, 45));
        System.out.println(getPersonName(workersList, "Ion Pop"));
        employ(workersList, new Person("Ion Pop", 35, "worker"));
        roster(workersList);


    }

    private static void roster(List<Person> givenList) {
        givenList.stream()
                .forEach(person -> System.out.println(person.getName() + ", " +
                        person.getAge() + " years old, is a " + person.getPosition()));
    }

    private static void employ(List<Person> givenList, Person person) {
        if (!givenList.contains(person)) {
            givenList.add(person);
            System.out.println(person + " was hired");

        } else {
            System.out.println("Already hired!");
        }
    }

    private static List<Person> getPersonName(List<Person> givenList, String filterName) {
        List<Person> newList = new ArrayList<>();
        for (Person person : givenList) {
            if (person.getName().equals(filterName)) {
                newList.add(person);
            }
        }
        return newList;
    }

    private static List<Person> getPersonsOlder(List<Person> givenList, int age) {
        List<Person> newList = new ArrayList<>();
        for (Person person : givenList) {
            if (person.getAge() > age) {
                newList.add(person);
            }
        }
        return newList;
    }

    private static List<Person> getPersons(List<Person> givenList, String profession) {
        List<Person> newList = new ArrayList<>();
        for (Person p : givenList) {
            if (p.getPosition().equals(profession)) {
                newList.add(p);
            }
        }
        return newList;
    }

    private static Person getManager(List<Person> givenList) {
        for (Person p : givenList) {
            if (p.getPosition().equals("manager")) {
                return p;
            }
        }
        return null;
    }


}
