package main.ro.fasttrackitwon6.homework.lab5.homework.javayourself;

public class TestEA11 {
    public static void main(String[] args) {
        System.out.println(isUnique(new int[]{2}));
    }
    public static boolean isUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
