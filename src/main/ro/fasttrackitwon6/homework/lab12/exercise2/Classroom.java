package main.ro.fasttrackitwon6.homework.lab12.exercise2;

import main.ro.fasttrackitwon6.homework.lab12.exercise1.StudentGrade;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Classroom {
    private List<StudentGrade> studentGradeList;

    public Classroom(List<StudentGrade> studentGradeList) {
        this.studentGradeList = studentGradeList;
    }

    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> grades = new ArrayList<>();
        for (StudentGrade student : studentGradeList) {
            if (student.getDiscipline().equals(discipline)) {
                grades.add(student.getGrade());
            }
        }
        return grades;
    }

    public List<Integer> getGradesForStudent(String student) {
        List<Integer> grades = new ArrayList<>();
        for (StudentGrade s : studentGradeList) {
            if (s.getName().equals(student)) {
                grades.add(s.getGrade());
            }
        }
        return grades;
    }

    public StudentGrade getMaxGrade(String discipline) {
        StudentGrade bestStudent = new StudentGrade("", "", 0);
        for (StudentGrade s : studentGradeList) {
            if (s.getDiscipline().equals(discipline)) {
                if (s.getGrade() > bestStudent.getGrade()) {
                    bestStudent = s;
                }

            }
        }
        return bestStudent;
    }

    public StudentGrade getMaxGrade() {
        StudentGrade bestStudent = new StudentGrade("","",0);
        for (StudentGrade student : studentGradeList) {
            if (student.getGrade() > bestStudent.getGrade()) {
                bestStudent = student;
            }
        }
        return bestStudent;
    }

    public Integer getAverageGrade(String discipline) {
        int sum = 0;
        int count = 0;
        for (StudentGrade student : studentGradeList) {
            if (student.getDiscipline().equals(discipline)) {
                sum = sum + student.getGrade();
                count++;
            }
        }
        return sum / count;
    }

    public StudentGrade getWorstGrade(String discipline) {
        StudentGrade worstStudent = new StudentGrade("","",17);
        for (StudentGrade student : studentGradeList) {
            if (student.getDiscipline().equals(discipline)) {
                if (student.getGrade() < worstStudent.getGrade()) {
                    worstStudent = student;
                }

            }
        }
        return worstStudent;
    }


    @Override
    public String toString() {
        return "Classroom{" +
                "studentGradeList=" + studentGradeList +
                '}';
    }
}
