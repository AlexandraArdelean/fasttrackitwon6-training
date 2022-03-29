package main.java.homework.lab6.homeworkl6;


import java.util.Arrays;

public class Agenda {
    public static void main(String[] args) {
        int[] agenda = new int[4];
        System.out.println(add(agenda, 10));
        System.out.println(Arrays.toString(agenda));
        System.out.println(replace(agenda, 0, 5));
        System.out.println(Arrays.toString(agenda));
        System.out.println(replace(agenda, 0, 35));
        System.out.println(Arrays.toString(agenda));
        System.out.println(replace(agenda, 0, 88));
        System.out.println(Arrays.toString(agenda));
        System.out.println(remove(agenda, 10));
        System.out.println(Arrays.toString(agenda));
        System.out.println(search(agenda, 35));
      //  System.out.println(Arrays.toString(agenda));
    }

    public static int add(int[] arr, int nr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nr;
            return i;
        }
        return -1;
    }

    public static int replace(int[] agenda, int actual, int newNr) {
        for (int i = 0; i < agenda.length; i++)
            if (agenda[i] == actual) {
                agenda[i] = newNr;
                return i;
            }
        return -1;
    }

    public static int remove(int[] agenda, int nr) {
        for (int i = 0; i < agenda.length; i++) {
            if (agenda[i] == nr) {
                for (int j = i; j < agenda.length - 1; j++) {
                    agenda[j] = agenda[j + 1];
                }
                return i;
            }
        }
        return -1;
    }

    public static int search(int[] agenda, int nr) {
        for (int i = 0; i < agenda.length; i++) {
            if (agenda[i] == nr) {
                return i;
            }
        }
        return -1;
    }
}
