package main.ro.fasttrackitwon6.homework.lab6.javayourself;

import java.util.Arrays;

public class TestEA17 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDuplicates(new int[]{1})));

    }

    public static int[] removeDuplicates(int[] arr) {
        int j = 0; // index without duplicates
        int lastIndex = arr.length - 1;
        for (int i = 0; i < lastIndex; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        if (arr[j] != arr[lastIndex]) {
            arr[j++] = arr[lastIndex];
        }
        return Arrays.copyOf(arr, j);
    }
}
