package org.sok;

import java.util.Random;

public class CountEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = generateRandomNumbers(10, 1, 100);
        int evenCount = countEvenNumbers(numbers);
        System.out.println("Количество четных чисел: " + evenCount);
    }

    public static int[] generateRandomNumbers(int count, int min, int max) {
        int[] numbers = new int[count];
        Random rand = new Random();
        System.out.print("Массив случайных чисел:");
        for (int number :  numbers) {
            numbers[number] = rand.nextInt(max - min + 1) + min;
            System.out.print(" " + numbers[number]);
        }
        System.out.println();
        return numbers;
    }

    public static int countEvenNumbers(int[] numbers) {
        int evenCount = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }
}