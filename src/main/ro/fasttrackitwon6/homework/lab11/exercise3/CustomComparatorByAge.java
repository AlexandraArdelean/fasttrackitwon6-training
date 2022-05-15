package main.ro.fasttrackitwon6.homework.lab11.exercise3;

import java.util.Comparator;

public class CustomComparatorByAge implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(),o2.getAge());
    }
}