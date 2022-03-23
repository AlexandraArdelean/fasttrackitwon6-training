package main.java.homework.lab5.homework.javayourself;

import java.util.Arrays;

public class TestEA8 {
    public static void main(String[] args) {
        System.out.println(contains(new int[]{1, 2, 3, 4, 2, 1, 3, 4}, new int[]{1, 4, 3}));
    }

    public static boolean contains(int[] a, int[] b) {
        if (a.length == 0) {
            return false;
        } else if (b.length == 0) {
            return true;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j])
                    return true;
            }
        }
        return false;
    }
}
