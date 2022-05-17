package main.ro.fasttrackitwon6.homework.lab5.homework.javayourself;

import java.util.Arrays;

public class TestEA12 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 11, 3, 6};
        int pos = 5;
        arr = removePosition(arr, pos);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] removePosition(int[] arr, int pos) {
        if (pos >= arr.length) {
            return null;
        }

        int[] arr2 = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == pos) {
                continue;
            }
            arr2[k++] = arr[i];
        }
        return arr2;
    }
}
