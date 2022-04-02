package main.ro.fasttrackitwon6.homework.lab7.ex5;

public class Bottle {
    private double totalCapacity;
    private String availableLiquid;
    private boolean open;

    public Bottle(double totalCapacity, String availableLiquid, boolean open) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.open = open;
    }

    public double getTotalCapacity() {
        return totalCapacity;
    }

    public String getAvailableLiquid() {
        return availableLiquid;
    }

    public boolean isOpen() {
        return open;
    }

    public boolean checkIfBottleHasLiquid() {
        if (totalCapacity != 0) {
            return true;
        } else {
            return false;
        }
    }

    public String checkTypeOfLiquid() {
        return availableLiquid;

    }

    public double checkQuantity() {
        if (this.totalCapacity != 0) {
            return totalCapacity;
        } else {
            return 0;
        }
    }

    public void openBottle() {
        if (isOpen()) {
            System.out.println("Bottle is opened.");
        } else {
            open = true;
            System.out.println("The bottle is now opened.");
        }
    }

    public void closeBottle() {
        if (isOpen()) {
            System.out.println("The bottle is now closed.");
            open = false;
        } else {
            System.out.println("The bottle is already closed!");
        }
    }

    public void drinkFromBottle(double amount) {
        double remainedLiquid = totalCapacity - amount;
        if (isOpen()) {
            if (checkIfBottleHasLiquid()) {
                if (checkQuantity() != 0) {
                    if (totalCapacity > amount) {
                        System.out.println("Liquid remained: " + remainedLiquid);
                        closeBottle();
                    } else {
                        System.out.println("You don't have enough liquid in your bottle!");
                    }
                }
            }
        } else {
            openBottle();
            checkIfBottleHasLiquid();
            checkQuantity();
            if (totalCapacity > amount) {
                System.out.println("You have left: " + remainedLiquid + " available liquid");
                closeBottle();
            } else {
                System.out.println("You don't have enough liquid in your bottle!");
            }
        }
    }
}

