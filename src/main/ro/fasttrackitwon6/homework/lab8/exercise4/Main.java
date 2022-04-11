package main.ro.fasttrackitwon6.homework.lab8.exercise4;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ion Pop", 8.5);
        Student student1 = new Student("Maria Popescu", 10);
        Student student2 = new Student("Anca Maier", 6.5);
        System.out.println(student.getName() + " " + student.getGrade());
        System.out.println(student1.getName() + " " + student1.getGrade());
        System.out.println(student2.getName() + " " + student2.getGrade());
        System.out.println("The grades average is: " + Student.average());
        System.out.println("Total number of students: " + Student.totalNumberOfStudents);

    }
}
