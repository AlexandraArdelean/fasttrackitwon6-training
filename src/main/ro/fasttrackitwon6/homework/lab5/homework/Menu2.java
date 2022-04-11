package main.ro.fasttrackitwon6.homework.lab5.homework;

import java.util.Scanner;

public class Menu2 {
    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.print("Choose your option: ");

    }

    public static void main(String[] args) {
        String[] options = {
                "1- Latte Macchiato",
                "2- Flat White",
                "3- Smoothie",
                "4- Cola",
                "5- Exit"
        };
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        while (option != 5) {
            System.out.println("Menu options: ");
            printMenu(options);
            option = scanner.nextInt();
            for (int i = 0; i < options.length; i++) {
                if (option == i) {
                    System.out.printf("You ordered a %s. Thank you! \n", options[i - 1]);

                }
            }
        }
    }
}
