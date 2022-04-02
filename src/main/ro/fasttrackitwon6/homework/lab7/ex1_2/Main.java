package main.ro.fasttrackitwon6.homework.lab7.ex1_2;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ana", 25, false);
        Person p2 = new Person("Dan", 45, true);
        Person p3 = new Person("Ion", 30, false);

        System.out.println("Person with name " + p1.getName() + " and age " + p1.getAge() + " is married?  " + p1.isMarried());
        System.out.println("Person with name  " + p2.getName() + " and age " + p2.getAge() + " is married? " + p2.isMarried());
        System.out.println("Person with name " + p3.getName() + " and age " + p3.getAge() + " is married? " + p3.isMarried());

    }
}
