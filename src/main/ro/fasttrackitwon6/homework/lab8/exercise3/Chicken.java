package main.ro.fasttrackitwon6.homework.lab8.exercise3;

public class Chicken implements Animal{
    @Override
    public String walk() {
        return "The chicken walks";
    }

    @Override
    public String talk() {
        return "The chicken says cucuriguu";
    }

    @Override
    public String eat() {
        return "The chicken eats corn";
    }
}
