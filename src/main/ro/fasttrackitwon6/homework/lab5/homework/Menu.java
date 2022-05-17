package main.ro.fasttrackitwon6.homework.lab5.homework;

import java.util.Scanner;

import static java.lang.System.exit;

public class Menu {
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
                "5- Exit"};
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        while (option != 5) {
            System.out.println("Menu options: ");
            printMenu(options);
            option = scanner.nextInt();
            switch (option) {
                case 1: {
                    System.out.printf("You ordered a %s. Thank you! \n", options[0]);
                }
                break;
                case 2: {
                    System.out.printf("You ordered a %s. Thank you! \n", options[1]);
                }
                break;
                case 3: {
                    System.out.printf("You ordered an %s. Thank you! \n", options[2]);
                }
                break;
                case 4: {
                    System.out.printf("You ordered a %s. Thank you! \n", options[3]);
                }
                break;
                case 5:
                    exit(0);
                default:
                    System.out.println("Please enter option between 1 and 4!");
            }
        }
    }
}