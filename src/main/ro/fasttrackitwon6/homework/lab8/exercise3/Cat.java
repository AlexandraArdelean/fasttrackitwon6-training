package main.ro.fasttrackitwon6.homework.lab8.exercise3;

public class Cat implements Animal{
    @Override
    public String walk() {
        return "The cat walks";
    }

    @Override
    public String talk() {
        return "The cat says meow!";
    }

    @Override
    public String eat() {
        return "The cat eats Whiskies";
    }
}
