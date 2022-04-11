package main.ro.fasttrackitwon6.homework.lab8.exercise3;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Chicken chicken = new Chicken();
        Dog dog = new Dog();
        Duck duck = new Duck();
        Mouse mouse = new Mouse();

        printMethodMessage(cat);
        printMethodMessage(chicken);
        printMethodMessage(dog);
        printMethodMessage(duck);
        printMethodMessage(mouse);
    }

    private static void printMethodMessage(Animal animal) {
        System.out.println(animal.eat());
        System.out.println(animal.talk());
        System.out.println(animal.walk());
    }
}
