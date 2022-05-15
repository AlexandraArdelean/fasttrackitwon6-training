package main.ro.fasttrackitwon6.homework.lab11.exercise1;

public class Flower {
    private final String name;

    public Flower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                '}';
    }
}
