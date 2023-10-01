package org.sok;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class StringCollectionManipulation {
    public static void main(String[] args) {
        List<String> collection = new ArrayList<>();
        collection.add("Highload");
        collection.add("High");
        collection.add("Load");
        collection.add("Highload");

        int highCount = Collections.frequency(collection, "High");
        System.out.println("Количество вхождений \"High\": " + highCount);

        String firstElement = getFirstElement(collection);
        System.out.println("Первый элемент коллекции: " + firstElement);

        String lastElement = getLastElement(collection);
        System.out.println("Последний элемент коллекции: " + lastElement);
    }

    public static String getFirstElement(List<String> collection) {
        if (!collection.isEmpty()) {
            return collection.get(0);
        } else {
            return "0";
        }
    }

    public static String getLastElement(List<String> collection) {
        if (!collection.isEmpty()) {
            return collection.get(collection.size() - 1);
        } else {
            return "0";
        }
    }
}