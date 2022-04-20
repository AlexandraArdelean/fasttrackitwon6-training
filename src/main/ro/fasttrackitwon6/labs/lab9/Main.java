package main.ro.fasttrackitwon6.labs.lab9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int a = 1;
//        if (a % 2 == 0) {
//            System.out.print("Fast");
//        } else
//            System.out.print("Track");
//        System.out.print("IT");
//
//        int sold = 1000;
//        boolean autentificat = true;
//        if (autentificat && sold > 0) {
//            System.out.print("Operatia este posibila");
//        } else {
//            System.out.print("Operatia nu este posibila");
//        }


        int option = 3;
        do {
            System.out.print("The option is " + option + ". ");
        } while (option > 5);

        int a = 2;

        System.out.println(a--);
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.println(value);
    }
}
