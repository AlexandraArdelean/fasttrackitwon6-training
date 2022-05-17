package main.ro.fasttrackitwon6.homework.lab10;

import java.util.List;
import java.util.Objects;

public class Basket {

   private List<String> basket;

    public Basket(List<String> basket) {
        this.basket = basket;
    }

    public boolean find(String fruit) {
        return basket.contains(fruit);
    }

    public boolean remove(String fruit) {
        if (basket.contains(fruit)) {
            basket.remove(fruit);
            return true;
        }
        return false;
    }

    public int position(String fruit) {
        for (int i = 0; i < basket.size(); i++) {
            if (Objects.equals(basket.get(i), fruit)) {
                return i;
            }
        }
        return 0;
    }

    public List<String> distinct() {
        return basket;
    }

    public void addFruits(String fruit) {
        basket.add(fruit);
    }

    public int count() {
        return basket.size();
    }

    public int customCount() {
        int counter = 0;
        for (int i = 0; i < basket.size(); i++) {
            counter++;
        }
        return counter;
    }
}
