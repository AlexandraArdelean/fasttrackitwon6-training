package main.java.homework.lab5.homework;

import java.util.Random;
import java.util.Scanner;

public class ExtraCoding {
    public static void main(String[] args) {
        count();
        printArray(new int[]{1, 2, 3, 4, 5,});
        printThirdElement(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        printStringElements(new String[]{"Sergiu", "Ana", "Matei", "Elena"}, 2);
        System.out.println(formatString("abc", 6));
        System.out.println(sumOddDigit(154123));
        generateRandomNumber();
        buildArray();
        guessTheNumber();
    }

    public static void count() {
        int i = 0;

        for (i = 0; i <= 100; i++) {
            System.out.println(i);
        }
//        while (i <= 100) {
//            System.out.println(i++);
//        }
//        do {
//            System.out.println(i++);
//        } while (i <= 100);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void printThirdElement(int[] arr) {
        for (int i = 2; i < arr.length; i += 3) {
            System.out.println(arr[i]);
        }
    }

    public static void printStringElements(String[] strings, int line) {
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
            if (i % line == line - 1)
                System.out.println();
        }
    }

    public static String formatString(String s, int x) {
        return String.format("%1$" + x + "s", s);
    }

    public static int sumOddDigit(int x) {
        int sum = 0;
        int lastDigit = 0;
        while (x != 0) {
            lastDigit = x % 10; // find the last digit
            if (lastDigit % 2 != 0) { // check if last digit is odd
                sum = sum + lastDigit; // if true, add it to sum
            }
            x = x / 10; // remove the last digit from number
        }
        return sum;
    }

    public static void generateRandomNumber() {
        Random random = new Random();
        int upperBound = 30;
        int randomNumber = random.nextInt(upperBound);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        if (number == randomNumber) {
            System.out.println("You win!");
        } else if (number < randomNumber) {
            System.out.println("Sorry, you are too low. Try again.");
        } else {
            System.out.println("You are too high. Try again.");
        }

    }

    public static void buildArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the value of n: ");
        int n = scanner.nextInt();
        System.out.print("Please enter the value of k: ");
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 1; i < n; i++) {
            arr[i] = i;
            if (arr[i] % k == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void guessTheNumber() {
        int randomNumber = (int) (Math.random() * 10 + 1);
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int guess;
        do {
            System.out.print("Insert your number: ");
            guess = scanner.nextInt();
            if (guess != randomNumber) {
                System.out.println("You didn't guess. Try again.");
                count++;
            } else {
                System.out.println("You guessed the number in " + count + " tries.");
            }


        } while (guess != randomNumber);
    }
}



