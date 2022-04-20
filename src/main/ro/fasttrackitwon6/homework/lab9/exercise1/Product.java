package main.ro.fasttrackitwon6.homework.lab9.exercise1;

public class Product {
    private int price;
    private String name;
    private String description;
    private double quantity;

    public Product(int price, String name, String description, double quantity) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getQuantity() {
        return quantity;
    }
}
