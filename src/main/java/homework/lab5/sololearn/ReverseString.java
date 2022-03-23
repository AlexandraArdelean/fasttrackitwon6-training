package main.java.homework.lab5.sololearn;

import java.util.Scanner;

public class ReverseString {
    // write a method to reverse a String
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray(); // descompune stringul intr-un array de caractere
        for (int i = arr.length-1; i >=0; i--) { // mergem cu i de la lungimea array-ului -1 pana la valoarea 0 si printam

            System.out.print(arr[i]);

        }
    }
}
