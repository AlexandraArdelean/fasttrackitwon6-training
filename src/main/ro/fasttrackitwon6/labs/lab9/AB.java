package main.ro.fasttrackitwon6.labs.lab9;

public class AB {
    public void test(boolean a, boolean b) {
        if (a) {
            System.out.println("A");
        } else if (a && b) {
            System.out.println("A && B");
        } else {
            if (!b) {
                System.out.println("!B");
            } else {
                System.out.println("None");
            }
        }
    }
}
