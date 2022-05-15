package main.ro.fasttrackitwon6.homework.lab11.exercise3;

import java.util.Comparator;

public class CustomComparatorByLastLetterFromName implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Character.compare(
                o1.getName().charAt(o1.getName().length()-1),
                o2.getName().charAt(o2.getName().length()-1));
    }
}
