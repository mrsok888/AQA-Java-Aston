package org.sok;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortAndAddToArray {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("f10", "f15", "f2", "f4", "f4");
        Collections.sort(strings);
        String[] sortedArray = strings.toArray(new String[0]);

        for (String str : sortedArray) {
            System.out.println(str);
        }
    }
}