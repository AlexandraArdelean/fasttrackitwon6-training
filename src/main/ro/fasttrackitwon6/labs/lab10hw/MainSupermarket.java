package main.ro.fasttrackitwon6.labs.lab10hw;

import java.util.ArrayList;
import java.util.List;

public class MainSupermarket {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addFruits(new Fruit("capsuni", 100));
        System.out.println(basket);
        basket.addFruits(new Fruit("banane", 50));
        basket.addFruits(new Fruit("mere", 15));
        System.out.println(basket);

        List<Fruit> existingFruits = new ArrayList<>();
        existingFruits.add(new Fruit("pere", 5));
        existingFruits.add(new Fruit("cirese", 1));
        existingFruits.add(new Fruit("portocale", 5));
        Basket filledBasket = new Basket(existingFruits);
        System.out.println(filledBasket);

        existingFruits.add(new Fruit("mango", 3));
        System.out.println(filledBasket);
    }

}
