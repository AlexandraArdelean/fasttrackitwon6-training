package main.ro.fasttrackitwon6.homework.lab6.homeworkl6;

import java.util.Random;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {10, 9, 1, 5, 4, 2, 15, 22, 8, 3};
        System.out.println("Produsul elementelor din array este: " + calculateProduct(arr));
        System.out.println("Totalul numerelor impare din sir: " + countOddNumbers(arr));
        System.out.println((returnSmallerNumbers(arr, 10)));
        receiveDonations(3000);
        maxDonationsNumber(3000, 10);
        System.out.println(printPhrase("Ana are mere.Merele sunt bune si coapte.Ana ar vrea si niste pere, dar nu mai are bani."));

    }

    public static int calculateProduct(int[] array) {
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            product *= array[i];
        }
        return product;
    }

    public static int countOddNumbers(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count++;

            }
        }
        return count;
    }

    public static String returnSmallerNumbers(int[] array, int n) {
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < n) {
//                count++;
//            }
//        }
//
//        Arrays.sort(array);
//        int[] result;
//        result = Arrays.copyOf(array, count);
//
//        return result;
        String result = "";
        for (int num: array){
            if (num < n){
                result = result + num + " ";
            }
        }
        result = result.trim();
        return result;


    }

    public static void receiveDonations(int target) {
        Random random = new Random();
        int donatedSum = random.nextInt(1000);
        int donation = 0;
        while (donation < target) {
            donation += donatedSum;
        }

        System.out.println("Success ");

    }

    public static void maxDonationsNumber(int target, int max) {
        int count = 0;
        int donation = 0;
        Random random = new Random();
        int donatedSum = random.nextInt(1000);
        while (donation < target || count == max) {
            count++;
            donation += donatedSum;
        }
        System.out.println("Success! We received: " + count + " donations.");

    }

    public static String printPhrase(String phrase) {
        String s = "";
        s = phrase.replace(".", "\n");
        return s;
    }

}