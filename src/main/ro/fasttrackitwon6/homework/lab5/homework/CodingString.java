package main.ro.fasttrackitwon6.homework.lab5.homework;

import java.util.Random;

public class CodingString {
    public static void main(String[] args) {
        String[] strings = new String[]{
                "Anamaria Pop",
                "Maria Radu",
                "Anca Popita",
                "Ion Popescu",
                "Alexandra Ardelean"};
        printNameWithLetterA(strings);
        printNamesWithGivenString(strings, "ia");
        replaceLetterR(strings);
        printFirstThreeChars(strings);
        generateRandomLetter(strings);
        abbreviateMiddleName("Ion Marin Popescu");


    }

    public static void printNameWithLetterA(String[] names) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].startsWith("A")) {
                System.out.println(names[i]);
            }
        }
    }

    public static void printNamesWithGivenString(String[] names, String argument) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].contains(argument)) {
                System.out.println(names[i]);
            }
        }
    }

    public static void replaceLetterR(String[] names) {
        for (String name : names) {
            System.out.println(name.replace("r", "*"));
        }
    }

    public static void printFirstThreeChars(String[] names) {
        for (String name : names) {
            System.out.println(name.substring(0, 3));
        }
    }

    public static void generateRandomLetter(String[] names) {
        for (String name : names) {
            Random random = new Random();
            int randomInt = random.nextInt(name.length());
            char randomChar = name.charAt(randomInt);
            System.out.println("Random char from string: " + randomChar);
        }
    }

    public static void abbreviateMiddleName(String fullName) {
        String[] names = fullName.split(" "); // "firstName" "middleName" "surname"
        String firstName = names[0];
        String lastName = names[names.length - 1];
        System.out.print(firstName + " ");
        for (int i = 1; i < names.length - 1; i++) {
            System.out.print(names[i].charAt(0) + ". ");
        }
        System.out.println(lastName);

    }
}
