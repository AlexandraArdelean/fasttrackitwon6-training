package main.ro.fasttrackitwon6.homework.lab8.exercise3;

public class Duck implements Animal{
    @Override
    public String walk() {
        return "The duck walks";
    }

    @Override
    public String talk() {
        return "The duck says quack quack";
    }

    @Override
    public String eat() {
        return "The duck eats grass and corn";
    }
}
