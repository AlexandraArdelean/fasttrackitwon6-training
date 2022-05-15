package main.ro.fasttrackitwon6.homework.lab11.exercise3;

import java.util.Comparator;

public class CustomComparatorByHairColour implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getHairColor().compareTo(o2.getHairColor());
    }
}
