package main.ro.fasttrackitwon6.homework.lab11.exercise1;


import java.util.HashSet;

public class MainBouquet {
    public static void main(String[] args) {
        Bouquet myBouquet = new Bouquet(new HashSet<>());
        myBouquet.addFlower("Lilly");
        myBouquet.addFlower("Lilly of the Valley");
        myBouquet.addFlower("Peonies");
        myBouquet.addFlower("Roses");
        myBouquet.addFlower("Sun Flower");

        System.out.println(myBouquet.getAllFlowers());
        myBouquet.addFlower("Cactus");
        System.out.println(myBouquet.getAllFlowers());
        myBouquet.removeFlower("Cactus");
    }
}
