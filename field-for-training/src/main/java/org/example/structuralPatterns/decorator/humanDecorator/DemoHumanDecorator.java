package org.example.structuralPatterns.decorator.humanDecorator;

public class DemoHumanDecorator {
    public static void main(String[] args) {
        Human human = new Human("Mike",18){
            @Override
            public void eat() {
                System.out.println(getName() + " is eating...");
            }
        };
        YoungMan youngMan = new YoungMan(human);
        AdultMan adultMan = new AdultMan(youngMan);
        adultMan.eat();
    }
}
