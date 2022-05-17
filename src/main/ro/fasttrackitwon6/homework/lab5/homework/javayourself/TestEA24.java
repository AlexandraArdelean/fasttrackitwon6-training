package main.ro.fasttrackitwon6.homework.lab5.homework.javayourself;

public class TestEA24 {
    public static void main(String[] args) {
        System.out.println(countOccurences("aaaabbaabaa", "ccc"));
    }

    public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }

    public static int countOccurences(String source, String target) {
        if (isEmpty(source) || isEmpty(target)) {
            throw new IllegalArgumentException();
        }
        int index = 0;
        int count = 0;
        while (true) {
            index = source.indexOf(target, index);
            if (index != -1) {
                count++;
                index += target.length();
            } else {
                break;
            }
        }
        return count;

    }

}