package main.ro.fasttrackitwon6.homework.lab7.ex5;

public class Main {
    public static void main(String[] args) {

        int y = 0;

        for(int x =0;y<3;x++) {

            if(x%2==1) continue;

            y += x;

        }

        System.out.println(y);
        Bottle bottle = new Bottle(1000, "water", false);

        System.out.println(bottle.getAvailableLiquid());
        System.out.println(bottle.getTotalCapacity());
        System.out.println(bottle.isOpen());

        System.out.println(bottle.checkIfBottleHasLiquid());
        System.out.println(bottle.checkTypeOfLiquid());
        System.out.println(bottle.checkQuantity());
        bottle.openBottle();
        bottle.closeBottle();

        bottle.drinkFromBottle(999);
    }


}
