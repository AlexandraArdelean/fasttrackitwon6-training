package main.java.homework.lab5.homework.javayourself;

import java.util.Arrays;

public class TestEA13 {
    public static void main(String[] args) {
        int[] array = {};
        System.out.println(getMaxTriple(array));

    }

    public static int getMaxTriple(int[] arr) {
        int sum = 0;
        if (arr.length < 4) {
            for (int i = 0; i < arr.length; i++){
                sum = sum + arr[i];
            }
        }
        for (int i = 0; i < arr.length - 2; i++) {
            int seqSum = arr[i] + arr[i + 1] + arr[i + 2];
            if (seqSum > sum) {
                sum = seqSum;
            }
        }
        return sum;
    }
}
