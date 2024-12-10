package org.example.structuralPatterns.decorator.humanDecorator;

public class YoungMan extends HumanDecorator {

    public YoungMan(Human human) {
        super(human);
    }

    @Override
    public void eat() {
        byProducts();
        super.eat();
    }

    public void byProducts() {
        System.out.println("By products...");
    }
}
