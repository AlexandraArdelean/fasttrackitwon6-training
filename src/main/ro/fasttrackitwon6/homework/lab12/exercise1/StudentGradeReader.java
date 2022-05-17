package main.ro.fasttrackitwon6.homework.lab12.exercise1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class StudentGradeReader {

    public List<StudentGrade> readStudentsFromFile(String filePath) throws IOException {
        List<String> lines = Files.readAllLines(Path.of(filePath));
        List<StudentGrade> studentsList = new ArrayList<>();
        for (String line : lines) {
            studentsList.add(readStudentsFromLine(line));

        }

        return studentsList;
    }

    private static StudentGrade readStudentsFromLine(String line) {
        String[] tokens = line.split(Pattern.quote("|"));
        return new StudentGrade(tokens[0], tokens[1], Integer.parseInt(tokens[2]));
    }
}
