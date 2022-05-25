package main.ro.fasttrackitwon6.homework.lab12.exercise2;

import main.ro.fasttrackitwon6.homework.lab12.exercise1.StudentGrade;

import java.util.ArrayList;
import java.util.List;


public class Classroom {
    private final List<StudentGrade> studentGradeList;

    public Classroom(List<StudentGrade> studentGradeList) {
        this.studentGradeList = new ArrayList<>(studentGradeList);
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

    public List<Integer> getGradesForStudent(String studentName) {
        List<Integer> grades = new ArrayList<>();
        for (StudentGrade student : studentGradeList) {
            if (student.getName().equals(studentName)) {
                grades.add(student.getGrade());
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
        StudentGrade bestStudent = new StudentGrade("", "", 0);
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
        int worstGrade = Integer.MAX_VALUE;
        StudentGrade worstStudent = null;
        for (StudentGrade student : studentGradeList) {
            if (student.getDiscipline().equals(discipline)
                    && student.getGrade() < worstGrade) {
                worstGrade = student.getGrade();
                worstStudent = student;
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
