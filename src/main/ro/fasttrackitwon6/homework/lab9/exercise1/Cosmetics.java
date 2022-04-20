package main.ro.fasttrackitwon6.homework.lab9.exercise1;

public class Cosmetics extends Product{
    private String color;
    private double weight;

    public Cosmetics(int price, String name, String description, double quantity, String color, double weight) {
        super(price, name, description, quantity);
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }
}
