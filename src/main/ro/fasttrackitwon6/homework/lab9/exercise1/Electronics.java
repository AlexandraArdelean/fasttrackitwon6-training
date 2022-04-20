package main.ro.fasttrackitwon6.homework.lab9.exercise1;

public class Electronics extends Product{
    private String type;
    private int length;
    private int width;
    private int height;
    private double weight;

    public Electronics(int price, String name, String description, double quantity, String type, int length,
                       int width, int height, double weight) {
        super(price, name, description, quantity);
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
