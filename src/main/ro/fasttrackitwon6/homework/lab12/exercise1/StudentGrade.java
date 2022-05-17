package main.ro.fasttrackitwon6.homework.lab12.exercise1;

import java.util.Objects;

public class StudentGrade {
    private  String name;
    private  String discipline;
    private  Integer grade;

    public StudentGrade() {
    }

    public StudentGrade(String name, String discipline, Integer grade) {
        this.name = name;
        this.discipline = discipline;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getDiscipline() {
        return discipline;
    }

    public Integer getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "StudentGrade{" +
                "name='" + name + '\'' +
                ", discipline='" + discipline + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentGrade that = (StudentGrade) o;
        return Objects.equals(name, that.name) && Objects.equals(discipline, that.discipline) && Objects.equals(grade, that.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, discipline, grade);
    }
}
