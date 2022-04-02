package main.ro.fasttrackitwon6.homework.lab7.ex3_4;

public class Main {
    public static void main(String[] args) {
        Product prod1 = new Product("bread", 2.50, 500, "food");
        Product prod2 = new Product("sugar", 5, 100, "food");
        Product prod3 = new Product("coffee", 21.00, 500, "food");

        printMessage(prod1);
        printMessage(prod2);
        printMessage(prod3);
    }

    private static void printMessage(Product product) {
        System.out.println("Today we bought some " + product.getName() + " from the " + product.getCategory() +
                " aisle and the price for the quantity "
                + product.getQuantity() + " gr was " + product.getPrice() + " RON");
        System.out.println(product.getName() + " is in stock: " + product.hasStock());
        System.out.println("Category:food  " + product.isCategory("food"));
    }
}
