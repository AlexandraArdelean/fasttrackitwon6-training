package main.ro.fasttrackitwon6.homework.lab12.exercise2;

import main.ro.fasttrackitwon6.homework.lab12.exercise1.StudentGrade;
import main.ro.fasttrackitwon6.homework.lab12.exercise1.StudentGradeReader;
import main.ro.fasttrackitwon6.homework.lab12.exercise3.ReportGenerator;

import java.io.IOException;
import java.util.List;

public class ClassroomMain {
    public static void main(String[] args) throws IOException {
        StudentGradeReader studentGradeReader = new StudentGradeReader();
        List<StudentGrade> students = studentGradeReader.readStudentsFromFile("file/grades.txt");
        Classroom classroom = new Classroom(students);
        System.out.println(students);

        System.out.println(classroom.getGradesForDiscipline("Computer Science"));
        System.out.println(classroom.getGradesForStudent("Ealhstan Saira"));
        System.out.println(classroom.getMaxGrade("Physics"));
        System.out.println(classroom.getMaxGrade());
        System.out.println(classroom.getAverageGrade("Physics"));
        System.out.println(classroom.getWorstGrade("Physics"));

        ReportGenerator reportGenerator = new ReportGenerator();
        reportGenerator.generateReport(classroom.getMaxGrade("Physics"), classroom.getAverageGrade("Physics"),
                classroom.getWorstGrade("Physics"));
    }
}
