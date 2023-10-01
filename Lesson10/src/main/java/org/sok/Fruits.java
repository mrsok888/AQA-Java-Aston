package org.sok;

import java.util.*;

public class Fruits {
    public static void main(String[] args) {

        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println("Вес коробки 1 с яблоками: " + appleBox1.getWeight());
        System.out.println("Вес коробки 2 с яблоками: " + appleBox2.getWeight());
        System.out.println("\nВес коробки с апельсинами: " + orangeBox.getWeight());

        System.out.println("\nСравнение коробок с яблоками: " + appleBox1.compare(appleBox2));
        System.out.println("Сравнение коробок с яблоками и апельсинами: " + appleBox1.compare(orangeBox));

        appleBox1.transferFruits(appleBox2);
        System.out.println("\nПересыпали фрукты из первой коробки во вторую");
        System.out.println("\nВес коробки 1 с яблоками: " + appleBox1.getWeight());
        System.out.println("Вес коробки 2 с яблоками: " + appleBox2.getWeight());
    }
}

class Fruit {
    private float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }
}

class Apple extends Fruit {
    public Apple() {
        super(1.0f);
    }
}

class Orange extends Fruit {
    public Orange() {
        super(1.5f);
    }
}

class Box<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        float totalWeight = 0;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box<?> anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
    }

    public void transferFruits(Box<T> anotherBox) {
        anotherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}