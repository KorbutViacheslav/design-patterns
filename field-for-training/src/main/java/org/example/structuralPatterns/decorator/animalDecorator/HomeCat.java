package org.example.structuralPatterns.decorator.animalDecorator;

public class HomeCat extends AnimalDecorator {

    public HomeCat(Animal animal) {
        super(animal);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        homeFood();
        super.sleep();
    }

    private void homeFood() {
        System.out.println("Whiskas food");
    }
}
