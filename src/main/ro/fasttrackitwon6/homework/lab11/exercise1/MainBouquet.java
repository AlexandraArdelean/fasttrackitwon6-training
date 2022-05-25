package main.ro.fasttrackitwon6.homework.lab11.exercise1;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Flow;

public class MainBouquet {
    public static void main(String[] args) {
        HashSet<Flower> flowers = new HashSet<>();
        Flower flower1 = new Flower("Lilly");
        Flower flower2 = new Flower("Peonies");
        Flower flower3 = new Flower("Cactus");
        flowers.add(flower1);
        flowers.add(flower2);
        flowers.add(flower3);

        Bouquet myBouquet = new Bouquet(flowers);
        System.out.println(myBouquet.getAllFlowers());

        System.out.println(myBouquet.getAllFlowers());
        myBouquet.removeFlower(flowers, "Cactus");
        System.out.println(myBouquet.getAllFlowers());
    }
}
