package org.aston.mrsok888;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(pair(-2, 1));
        check(1);
        System.out.println(check2(0));
        printstring("sok", 10);
        System.out.println(leapYear(1984));
        array();
        array2();
        array3();
        diag();
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
    public static void check(int x) {
        if (x >= 0)
            System.out.println("x is positive");
        else
            System.out.println("x is negative");
    }

    //3
    public static boolean check2(int x) {
        boolean flag = !(x >= 0);

        return flag;
    }

    //4
    public static void printstring(String a, int x) {
        if (x > 0)
            for (int i = 0; i < x; i++)
                System.out.println(a);
    }

    //5
    public static boolean leapYear(int x) {
        boolean flag = false;

        if (x % 4 == 0)
            flag = true;
        else if (x % 400 == 0)
            flag = true;
        else if (x % 100 == 0)
            flag = false;

        return flag;
    }

    //6
    public static void array() {
        int[] myArray = new int[]{0, 1, 0, 0, 1, 1, 0, 1, 0, 1};

        for (int i = 0; i < myArray.length; i++)
            if (myArray[i] == 0)
                myArray[i] = 1;
            else
                myArray[i] = 0;

        for (int i = 0; i < myArray.length; i++)
            System.out.println(myArray[i]);
    }

    //7
    public static void array2() {
        int[] myArray = new int[100];

        for (int i = 0; i < myArray.length; i++)
            myArray[i] = i + 1;

        for (int i = 0; i < myArray.length; i++)
            System.out.println(myArray[i]);

    }

    //8
    public static void array3() {
        int[] myArray = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 48, 9, 1};

        for (int i = 0; i < myArray.length; i++)
            if (myArray[i] < 6)
                myArray[i] *= 2;

        for (int i = 0; i < myArray.length; i++)
            System.out.println(myArray[i]);
    }

    //9
    public static void diag() {
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