package main.ro.fasttrackitwon6.homework.lab5.homework.javayourself;

public class TestEA10 {
    public static void main(String[] args) {
        System.out.println(fibo(-9));
    }
    public static int fibo(int n) {
        if (n < 0) {
            return -1;
        } else if (n<=1){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
