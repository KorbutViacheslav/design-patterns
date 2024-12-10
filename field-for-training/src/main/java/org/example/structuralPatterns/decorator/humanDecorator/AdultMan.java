package org.example.structuralPatterns.decorator.humanDecorator;

public class AdultMan extends HumanDecorator {
    public AdultMan(Human human) {
        super(human);
    }

    @Override
    public void eat() {
        work();
        super.eat();
    }

    public void work() {
        System.out.println(getName() + " working...");
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
