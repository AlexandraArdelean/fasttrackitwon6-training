package main.ro.fasttrackitwon6.homework.lab11.exercise1;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Bouquet {
    private final HashSet<String> bouquet;

    public Bouquet(HashSet<String> bouquet) {
        this.bouquet = bouquet;
    }

    public HashSet<String> getBouquet() {
        return bouquet;
    }

    public void addFlower(String flower){
        bouquet.add(flower);
    }

    public Collection<String> getAllFlowers(){
        return new HashSet<>(this.bouquet);
    }

    public void removeFlower(String flowerToRemove){
        bouquet.remove(flowerToRemove);
        System.out.println("Flower: " + flowerToRemove + " was removed from bouquet.");
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "bouquet=" + bouquet +
                '}';
    }


}
