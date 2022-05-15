package main.ro.fasttrackitwon6.homework.lab11.exercise2;

import java.util.*;

public class StudentMain {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Ionel Marcel Pop", 10);
        students.put("Maria Andreea Anca", 8);
        students.put("Andrei Ovidiu Ardelean", 9);
        students.put("Ana Maria Cucuta", 5);
        students.put("Costel George Basescu", 4);

        //print all students with their grade
        for (Map.Entry<String, Integer> studentEntry : students.entrySet()) {
            System.out.println(studentEntry.getKey() + " are nota " + studentEntry.getValue());
        }

        // find the highest grade
        findHighestGrade(students);

        //sorted set of students based on grade
        sortByGrades(students);

        //set with all grades
        getAllGradesSorted(students);

        //set cu prima litera a numelui studentilor
        System.out.println(getFirstLetter(students));

        // middle name set
        getMiddleName(students);
    }

    private static void getMiddleName(Map<String, Integer> students) {
        Set<String> middleNames = new HashSet<>();
        for (String name : students.keySet()) {
            middleNames.add(name.split(" ")[1]);
        }

        System.out.println(middleNames);
    }


    private static void sortByGrades(Map<String,Integer> unsortedMap) {
        // convert map to list
        List<Map.Entry<String,Integer>> list = new ArrayList<>(unsortedMap.entrySet());
        // sort the list with Collections.sort using custom comparator
        list.sort(new StudentCustomComparator());
        System.out.println(list);
    }

    private static void getAllGradesSorted(Map<String, Integer> students) {
        Set<Integer> grades = new HashSet<>();
        for (Map.Entry<String, Integer> s : students.entrySet()) {
            grades.add(s.getValue());
        }
        System.out.println(grades);
    }

    private static void findHighestGrade(Map<String, Integer> students) {
        int highestGrade = 0;
        String bestStudent = "";
        for (Map.Entry<String, Integer> s : students.entrySet()) {
            if (s.getValue() > highestGrade) {
                highestGrade = s.getValue();
                bestStudent = s.getKey();
            }
        }
        System.out.println("Best student in class is: " + bestStudent);
    }

    public static Set<Character> getFirstLetter(Map<String, Integer> students) {
        Set<Character> result = new HashSet<>();
        for (String name : students.keySet()) {
            result.add(name.charAt(0));
        }
        return result;
    }

}
