package main.ro.fasttrackitwon6.homework.lab12.exercise3;

import main.ro.fasttrackitwon6.homework.lab12.exercise1.StudentGrade;
import main.ro.fasttrackitwon6.homework.lab12.exercise2.Classroom;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.regex.Pattern;

public class ReportGenerator {

    public void generateReport(Classroom classroom, String discipline) throws IOException {
        Path path = Path.of("file", "grade-report.out");
        StudentGrade maxGrade = classroom.getMaxGrade();
        String maxReport = "Largest grade: " + maxGrade.getName() + " " + maxGrade.getGrade();
        Files.write(path, maxReport.getBytes());

        String averageGrade = "\nAverage grade: " + classroom.getAverageGrade(discipline);
        Files.write(path,  averageGrade.getBytes(), StandardOpenOption.APPEND);

        String smallestGrade = "\nSmallest grade: " + classroom.getWorstGrade(discipline);
        Files.write(path, smallestGrade.getBytes(), StandardOpenOption.APPEND);

    }
}
