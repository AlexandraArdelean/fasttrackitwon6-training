package main.java.homework.lab5.homework;

import java.util.Arrays;

public class Confidential {
    public static void main(String[] args) {
//        System.out.println(countChar("ana", 'a'));
//        redact("word");
//        System.out.println(contains(new String[]{"Ana", "are", "mere"}, "are"));
//        System.out.println(printArray("Ana are mere"));
        confidentialString("Ana are mere multe si mere dulci", new String[]{"Ana", "mere"});
    }

    public static int countChar(String s, char c) {
        s = s.toLowerCase();
        int count = 0;
        char temp;
        for (int i = 0; i < s.length(); i++) {
            temp = s.charAt(i);
            if (temp == c) {
                count++;
            }
        }
        return count;
    }

    public static void redact(String s) {
        s.toLowerCase();
        String str = new String();
        str = s.replaceAll("[a-zA-Z]", "*");
        System.out.print(str + " ");
    }

    public static boolean contains(String[] string, String word) {
        boolean found = false;
        for (int i = 0; i < string.length; i++) {
            if (string[i].contains(word)) {
                found = true;
            }
        }
        return found;
    }

    public static String printArray(String string) {
        String[] words = string.split(" ");
        return Arrays.toString(words);
    }

    public static void confidentialString(String phrase, String[] words) {
        if (countChar(phrase, 'a') > 0) {
            if (contains(words, phrase)) {
                for (int i = 0; i < words.length; i++) {
                    redact(words[i]);
                }
            }
        }
        printArray(phrase);
    }
}