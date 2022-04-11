package main.ro.fasttrackitwon6.homework.lab8.exercise3;

public class Mouse implements Animal{
    @Override
    public String walk() {
        return "The mouse walks";
    }

    @Override
    public String talk() {
        return "The mouse says chit, chit!";
    }

    @Override
    public String eat() {
        return "The mouse eats cheese";
    }
}
