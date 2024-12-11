package org.example.structuralPatterns.decorator.animalDecorator;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eating...");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeping...");
    }
}
