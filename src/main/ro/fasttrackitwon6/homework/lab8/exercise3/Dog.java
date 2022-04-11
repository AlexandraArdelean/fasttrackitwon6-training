package main.ro.fasttrackitwon6.homework.lab8.exercise3;

public class Dog implements Animal{
    @Override
    public String walk() {
        return "The dog walks";
    }

    @Override
    public String talk() {
        return "The dog says woof, woof!";
    }

    @Override
    public String eat() {
        return "The dog eats ham";
    }
}
