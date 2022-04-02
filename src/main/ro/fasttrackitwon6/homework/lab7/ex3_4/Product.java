package main.ro.fasttrackitwon6.homework.lab7.ex3_4;

public class Product {
    private String name;
    private double price;
    private double quantity;
    private String category;

    public Product(String name, double price, double quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public boolean hasStock() {
        if (this.quantity != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isCategory(String category) {
        if (this.category == category) {
            return true;
        } else {
            return false;
        }
    }
}
