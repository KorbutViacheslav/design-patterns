package org.example.structuralPatterns.decorator.humanDecorator;

abstract class HumanDecorator extends Human {
    protected Human human;

    public HumanDecorator(Human human) {
        super(human.getName(), human.getAge());
        this.human = human;
    }

    @Override
    public void eat() {
        human.eat();
    }
}
