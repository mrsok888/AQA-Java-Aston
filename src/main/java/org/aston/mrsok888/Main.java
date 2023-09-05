package org.aston.mrsok888;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(pair(-2, 1));
        checkSign(1);
        System.out.println(checkRound(0));
        printString("sok", 2);
        System.out.println(leapYear(2024));
        arrayReplace();
        arrayFill();
        arrayDecrease();
        diagonalMatrix();
        System.out.println(Arrays.toString(array4(5, 1)));
    }

    //1
    public static boolean pair(int x, int y) {
        boolean flag;

        if (x + y >= 10 && x + y <= 20)
            flag = true;
        else
            flag = false;

        return flag;
    }

    //2
    public static void checkSign(int x) {
        if (x >= 0)
            System.out.println("x is positive");
        else
            System.out.println("x is negative");
    }

    //3
    public static boolean checkRound(int x) {
        return !(x >= 0);
    }

    //4
    public static void printString(String a, int x) {
        if (x > 0)
            for (int i = 0; i < x; i++)
                System.out.println(a);
    }

    //5
    public static boolean leapYear(int x) {
        return (x % 4 == 0) && (x % 100 != 0) || (x % 400 == 0);
    }

    //6
    public static void arrayReplace() {
        int[] myArray = new int[]{0, 1, 0, 0, 1, 1, 0, 1, 0, 1};

        for (int i = 0; i < myArray.length; i++)
            if (myArray[i] == 0)
                myArray[i] = 1;
            else
                myArray[i] = 0;

        for (int i = 0; i < myArray.length; i++)
            System.out.print(myArray[i] + " ");
    }

    //7
    public static void arrayFill() {
        int[] myArray = new int[100];

        for (int i = 0; i < myArray.length; i++)
            myArray[i] = i + 1;

        for (int i = 0; i < myArray.length; i++)
            System.out.print(myArray[i] + " ");
        
        System.out.println();

    }

    //8
    public static void arrayDecrease() {
        int[] myArray = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 48, 9, 1};

        for (int i = 0; i < myArray.length; i++)
            if (myArray[i] < 6)
                myArray[i] *= 2;

        for (int i = 0; i < myArray.length; i++)
            System.out.print(myArray[i] + " ");
            
        System.out.println();
    }

    //9
    public static void diagonalMatrix() {
        int n = 5;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            matrix[i][i] = 1;
            matrix[i][n - 1 - i] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(matrix[i][j] + " ");

            System.out.println();
        }
    }

    //10
    public static int[] array4(int len, int initialValue) {
        int[] arr = new int[len];

        for(int i = 0; i < len; i++)
            arr[i] = initialValue;

        return arr;
    }
}
