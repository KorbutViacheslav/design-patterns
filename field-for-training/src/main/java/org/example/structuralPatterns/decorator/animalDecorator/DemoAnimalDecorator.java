package org.example.structuralPatterns.decorator.animalDecorator;

public class DemoAnimalDecorator {
    public static void main(String[] args) {
        Animal cat = new Cat("Barsik", 18);
        Animal homeCat = new HomeCat(cat);
        homeCat.eat();
        homeCat.sleep();

    }
}
