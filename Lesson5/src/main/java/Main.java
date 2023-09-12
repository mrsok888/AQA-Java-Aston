class Animal {
    private String name;
    private int runLimit;
    private int swimLimit;
    private boolean isHungry;

    private static int animalCount = 0;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.isHungry = true;
        animalCount++;
    }

    public String getName() {
        return name;
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    public void swim(int distance) {
        if (swimLimit == 0) {
            System.out.println(name + " не умеет плавать.");
        } else if (distance <= swimLimit) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м.");
        }
        System.out.println();
    }

    public void eatFromPlate(Plate plate, int amount) {
        if (plate.getFoodAmount() >= amount) {
            plate.decreaseFood(amount);
            isHungry = false;
            System.out.println(name + " поел из миски.");
        } else {
            System.out.println(name + " не смог поесть из миски.");
        }
    }

    public boolean isHungry() {
        return isHungry;
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}

class Cat extends Animal {
    private static int catCount = 0;

    public Cat(String name) {
        super(name, 200, 0);
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }
}

class Dog extends Animal {
    private static int dogCount = 0;

    public Dog(String name) {
        super(name, 500, 10);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }
}

class Plate {
    private int foodAmount;

    public Plate(int initialFood) {
        foodAmount = initialFood;
    }

    public void addFood(int amount) {
        foodAmount += amount;
    }

    public void decreaseFood(int amount) {
        if (foodAmount >= amount) {
            foodAmount -= amount;
        } else {
            System.out.println("В миске не хватает еды.");
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}

public class Main {
    public static void main(String[] args) {
        //1
        Dog dog1 = new Dog("Жук");
        Dog dog2 = new Dog("Рекс");

        Cat cat1 = new Cat("Мотя");
        Cat cat2 = new Cat("Хвост");

        dog1.run(300);
        dog1.swim(5);

        dog2.run(400);
        dog2.swim(8);

        cat1.run(150);
        cat1.swim(3);

        cat2.run(250);
        cat2.swim(0);

        System.out.println("Количество животных: " + Animal.getAnimalCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println();

        //2
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Барсик");
        cats[1] = new Cat("Мурзик");
        cats[2] = new Cat("Васька");

        Plate plate = new Plate(100);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eatFromPlate(plate, 50);
        }
        System.out.println();

        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].getName() + " голоден: " + cats[i].isHungry());
        }
        System.out.println();
        System.out.println("Количество животных: " + Animal.getAnimalCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
    }
}