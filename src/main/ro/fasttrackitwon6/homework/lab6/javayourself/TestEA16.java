package main.ro.fasttrackitwon6.homework.lab6.javayourself;

public class TestEA16 {
    public static void main(String[] args) {
        System.out.println(countAppearances(new int[]{1, 2, 3, 2, 3, 4, 1, 2, 4}, new int[]{}));

    }

    public static int countAppearances(int[] a, int[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    if (a.length > (i + 1) && b.length > (j + 1)) {
                        if (a[i + 1] == b[j + 1]) {
                            count += 1;
                            continue;
                        }
                    }
                }
            }
            if (count < b.length){
                return 0;
            }
        }
        return count;
    }
}
