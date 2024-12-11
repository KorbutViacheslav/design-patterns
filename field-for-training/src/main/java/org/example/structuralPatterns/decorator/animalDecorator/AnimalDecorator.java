package org.example.structuralPatterns.decorator.animalDecorator;

public class AnimalDecorator extends Animal {
    protected Animal animal;

    public AnimalDecorator(Animal animal) {
        super(animal.getName(), animal.getAge());
        this.animal = animal;
    }

    @Override
    public void eat() {
        animal.eat();
    }

    @Override
    public void sleep() {
        animal.sleep();
    }
}
