package main.ro.fasttrackitwon6.homework.lab8.exercise4;

public class Student {
    String name;
    double grade;
    static double sum = 0;
    static int totalNumberOfStudents = 0;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
        totalNumberOfStudents++;
        sum = sum + grade;
    }


    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public static double average() {
        return sum / totalNumberOfStudents;

    }

}
