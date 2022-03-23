package main.java.homework.lab5.homework.javayourself;

public class TestEA23 {

    public static void main(String[] args) {
        String str = "Ana are MERE";
        System.out.println(camelCase(str));
    }

    public static String camelCase(String input) {
        String[] parts = input.split("[\\W_]+");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            String word = parts[i];
            if (i == 0) {
                word = word.isEmpty() ? word : word.toLowerCase();
            } else {
                word = word.isEmpty() ? word : Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();

            }
            builder.append(word);
        }
        return builder.toString();

    }
}
