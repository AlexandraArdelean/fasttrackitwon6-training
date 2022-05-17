package main.ro.fasttrackitwon6.homework.lab12.exercise1;

import java.io.IOException;
import java.util.List;

public class StudentGradeMain {
    public static void main(String[] args) throws IOException {
        StudentGradeReader reader = new StudentGradeReader();
        List<StudentGrade> students = reader.readStudentsFromFile("file/grades.txt");
        System.out.println(students);
    }
}
