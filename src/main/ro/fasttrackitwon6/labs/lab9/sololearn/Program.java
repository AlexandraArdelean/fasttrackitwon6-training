package main.ro.fasttrackitwon6.labs.lab9.sololearn;

import java.util.Scanner;

    class Converter{
        static String toBinary(int num) {
            String binary = "";
            while(num > 0) {
                binary = (num%2) + binary;
                num /=2;

            }
            return binary;

        }

    }


    public class Program {
        public static void main(String[ ] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            System.out.print(Converter.toBinary(x));
        }
    }

