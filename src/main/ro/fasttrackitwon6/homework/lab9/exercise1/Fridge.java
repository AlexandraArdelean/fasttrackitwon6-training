package main.ro.fasttrackitwon6.homework.lab9.exercise1;

public class Fridge extends Electronics{
    private double temperature;

    public Fridge(int price, String name, String description, double quantity, String type,
                  int length, int width, int height, double weight, double temperature) {

        super(price, name, description, quantity, type, length, width, height, weight);
        this.temperature = temperature;
    }
}
