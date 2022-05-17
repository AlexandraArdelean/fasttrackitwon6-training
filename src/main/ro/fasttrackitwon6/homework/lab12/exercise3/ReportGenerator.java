package main.ro.fasttrackitwon6.homework.lab12.exercise3;

import main.ro.fasttrackitwon6.homework.lab12.exercise1.StudentGrade;
import main.ro.fasttrackitwon6.homework.lab12.exercise2.Classroom;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReportGenerator {

    public void generateReport(StudentGrade student, Integer gradesAverage, StudentGrade worstStudent) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("file/grade-reports.out"))) {
            writer.write("Largest grade: " + student.getName() + " " + student.getGrade() + "\n");
            writer.write("Average Grade: " + gradesAverage + "\n");
            writer.write("Smallest grade: " + worstStudent.getName() + " " + worstStudent.getGrade());
        }
    }


}
