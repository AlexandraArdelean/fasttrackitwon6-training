package main.ro.fasttrackitwon6.homework.lab5.homework;

import java.util.Arrays;

public class Confidential {
    public static void main(String[] args) {
        System.out.println(countChar("ana", 'a'));
        redact("word");
        System.out.println(contains(new String[]{"Ana", "are", "mere"}, "are"));
        System.out.println(Arrays.toString(printArray("Ana are mere")));
        System.out.println(confidentialString("Ana are mere multe si mere dulci", new String[]{"Ana", "mere"}));
    }

    public static int countChar(String s, char c) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }
        return count;
    }

    public static String redact(String s) {
        String str = "";
        str = s.replaceAll("[a-zA-Z]", "*");
        return str;

//        String redacted="";
//        for (char c: s.toCharArray()){
//            redacted += "*";
//        }
//        return redacted;
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

    public static String[] printArray(String string) {
        return string.split(" ");
    }

    public static String confidentialString(String text, String[] taboo) {
        String[] words = printArray(text);
        String confidential = "";
        for (String word : words) {
            String redacted = detectRedacted(taboo, word);
            confidential += redacted + " ";
        }
        return confidential.trim();
    }

    private static String detectRedacted(String[] taboo, String word) {
        String redacted = word;
        if (contains(taboo, word)) {
            redacted = redact(word);
        }
        return redacted;
    }
}