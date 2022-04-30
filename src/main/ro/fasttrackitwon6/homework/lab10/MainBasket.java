package main.ro.fasttrackitwon6.homework.lab10;

import java.util.ArrayList;
import java.util.List;

public class MainBasket {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Pear");
        list.add("Mango");
        list.add("Banana");
        list.add("Grapes");
        Basket basket = new Basket(list);
        basket.addFruits("Apple");

        System.out.println(basket.distinct());
        System.out.println(basket.count());
        System.out.println(basket.customCount());
        System.out.println(basket.find("Pear"));
        System.out.println(basket.remove("Apple"));
        System.out.println(basket.remove("Apple"));
        System.out.println(basket.distinct());
        System.out.println(basket.position("Mango"));


    }
}
