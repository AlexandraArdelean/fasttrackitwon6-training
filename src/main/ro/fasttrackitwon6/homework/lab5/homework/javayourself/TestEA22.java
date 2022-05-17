package main.ro.fasttrackitwon6.homework.lab5.homework.javayourself;

public class TestEA22 {
    public static void main(String[] args) {
        System.out.println(stringSum("1 ,5, 32, 8"));
    }

    public static int stringSum(String input) {
        int sum = 0;
        String[] numbers = input.split("\\s*,\\s*");

        for (int i = 0; i < numbers.length; i++) {
            sum += Integer.parseInt(numbers[i]);

        }
        return sum;
    }
}
