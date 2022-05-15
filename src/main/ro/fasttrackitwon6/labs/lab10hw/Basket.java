package main.ro.fasttrackitwon6.labs.lab10hw;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    List<Fruit> cumparaturi;

    public Basket() {
        this.cumparaturi = new ArrayList<>();
    }

    public Basket(List<Fruit> existingFruits) {
//        List<Fruit> copy = new ArrayList<>();
//        for (Fruit f : existingFruits) {
//            copy.add(f);
//        }
        this.cumparaturi = new ArrayList<>(existingFruits);
    }

    public void addFruits(Fruit fruit) {
        cumparaturi.add(fruit);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "cumparaturi=" + cumparaturi +
                '}';
    }
}
