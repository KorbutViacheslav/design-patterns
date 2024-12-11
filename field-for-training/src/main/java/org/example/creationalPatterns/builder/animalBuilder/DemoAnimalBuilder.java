package org.example.creationalPatterns.builder.animalBuilder;

public class DemoAnimalBuilder {
    public static void main(String[] args) {
        Animal animal = Animal.builder().name("Barsik").age(2).isVaccinated(true).build();
        System.out.println(animal);
    }
}
