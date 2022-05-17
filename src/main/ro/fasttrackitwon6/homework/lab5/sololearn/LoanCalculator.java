package main.ro.fasttrackitwon6.homework.lab5.sololearn;

import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int[] month = {1, 2, 3};
        for (int i = 0; i < month.length; i++){
            int monthlyPayment = amount * 10 / 100;
            System.out.println("Month " + month[i]);
            System.out.println("Payment: 10% of " + amount + "= " + monthlyPayment);
            amount = amount - monthlyPayment;
            System.out.println("Remaining amount: " + amount);
        }
    }
}