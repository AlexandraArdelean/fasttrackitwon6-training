package main.ro.fasttrackitwon6.homework.lab11.exercise3;

import java.util.*;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Ana Maries", 35, "brown hair"));
        personList.add(new Person("Ana Marinescu", 45, "blonde hair"));
        personList.add(new Person("Andrei Debreceni", 25, "black hair"));

        createListOfPersonsName(personList);
        createMapOfPersonsNameAndAge(personList);
        getOlderPersons(personList, 33);
        createMapOfPersonsNameAndHairColour(personList);
        sortListByAgeOrHairColour(personList);
        sortByLastLetterFromName(personList);

    }

    private static void sortByLastLetterFromName(List<Person> personList) {
        Collections.sort(personList, new CustomComparatorByLastLetterFromName());
        System.out.println(personList);
    }


    private static void sortListByAgeOrHairColour(List<Person> personList) {
        for (int i = 0; i< personList.size()-1; i++) {
            if (personList.get(i) != personList.get(i + 1)){
                personList.sort(new CustomComparatorByAge());

            } else {
                personList.sort(new CustomComparatorByHairColour());

            }
        }
        System.out.println(personList);
    }


    private static void createMapOfPersonsNameAndHairColour(List<Person> personList) {
        Map<String, String> newMap = new HashMap<>();
        for (Person person: personList) {
            newMap.put(person.getName(), person.getHairColor());
        }
        System.out.println(newMap);
    }

    private static void getOlderPersons(List<Person> personList, int givenAge) {
        Map<String, Integer> olderPersons = new HashMap<>();
        for (Person person: personList) {
            if (person.getAge() > givenAge) {
                olderPersons.put(person.getName(), person.getAge());
            }

        }
        System.out.println(olderPersons);
    }


    private static void createMapOfPersonsNameAndAge(List<Person> personList) {
        Map<String, Integer> newPersonsMap = new HashMap<>();
        for (Person person: personList) {
            newPersonsMap.put(person.getName(), person.getAge());

        }
        System.out.println("Map is: " + newPersonsMap);
    }

    private static void createListOfPersonsName(List<Person> personList) {
//        List<String> nameList = personList.stream()
//                .map(Person::getName)
//                .collect(Collectors.toList());
//        System.out.println(nameList);

        List<String> nameList = new ArrayList<>();
        for (Person person: personList) {
            nameList.add(person.getName());
        }
        System.out.println(nameList);
    }
}
