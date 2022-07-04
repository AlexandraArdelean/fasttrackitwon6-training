package main.ro.fasttrackitwon6.homework.lab18;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        System.out.println("Sum of digits is: " + sumOfDigits(num));
        System.out.println("Recursive: " + sumOfDigitsRecursive(num));
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }

    private static int sumOfDigitsRecursive(int num) {
        if (num == 0) {
            return 0;
        }
        return num % 10 + sumOfDigitsRecursive(num / 10);
    }
}
