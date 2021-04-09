package ru.geekbrains.myhomework;

public class Main {

    public static void main(String[] args) {
        printSum(12, 7);
        someNumber(-4);
        isNumintrettrue(-1);
        newCycle("Hello my friend", 8);
    }

    public static boolean printSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void someNumber(int c) {
        if (c >= 0) {
            System.out.println("Передано положительное число");
        } else {
            System.out.println("Передано отрицательное число");
        }
    }

    public static boolean isNumintrettrue(int d) {
        if (d >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void newCycle(String sumword, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(sumword);
        }
    }
}
