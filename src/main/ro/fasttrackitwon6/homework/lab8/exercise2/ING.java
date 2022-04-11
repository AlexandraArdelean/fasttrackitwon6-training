package main.ro.fasttrackitwon6.homework.lab8.exercise2;

public class ING implements Banking {
    double availableMoney;

    @Override
    public void deposit(double depositAmount) {
        availableMoney = availableMoney + depositAmount;
        System.out.println("You have deposited " + depositAmount + ". You now have " + availableMoney + " money in your bank account");
    }

    @Override
    public void withdraw(double withdrawAmount) {
        if (availableMoney > withdrawAmount) {
            System.out.println("Success! " + withdrawAmount + " was withdrew from your bank account!" +
                    "You now have " + (availableMoney - withdrawAmount) + " left.");
        } else {
            System.out.println("You don't have enough credit. Please check your bank account");
        }
    }
}
