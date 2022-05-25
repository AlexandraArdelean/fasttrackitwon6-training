package main.ro.fasttrackitwon6.homework.lab11.exercise1;

import java.util.HashSet;


public class Bouquet {
    private final HashSet<Flower> bouquet;

    public Bouquet(HashSet<Flower> flowers) {
        this.bouquet = flowers;
    }

    public HashSet<Flower> getBouquet() {
        return bouquet;
    }

    public void addFlower(Flower flower){
        bouquet.add(flower);
    }

    public HashSet<Flower> getAllFlowers(){
        return new HashSet<>(this.bouquet);
    }

    public void removeFlower(HashSet<Flower> bouquet, String flowerName){
        bouquet.remove(flowerName);
        System.out.println("Flower: " + flowerName + " was removed from bouquet.");
    }


}
