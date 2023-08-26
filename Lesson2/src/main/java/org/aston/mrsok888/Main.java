package org.aston.mrsok888;
import java.util.Random;

public class Main {
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple\n");
    }
    public static void checkSumSign() {
        int a = 700, b = 77;
        if (a + b > 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
        System.out.print("\n");
    }

    public static void printColor() {
        int value = 888;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (0 < value && value <= 100) {
            System.out.println("Желтый");
        } else if (value >= 100) {
            System.out.println("Зеленый");
        }
        System.out.print("\n");
    }

    public static void compareNumbers() {
        Random randomNumber = new Random();
        int a = randomNumber.nextInt(), b = randomNumber.nextInt();
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void main(String[] args) {
        checkSumSign();
        printColor();
        compareNumbers();
    }
}