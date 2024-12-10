package com.pattern.mytraining;

public class PizzaBuilder {
    private String bread;
    private String cheese;
    private String paper;
    private String meat;
    private String mushrooms;

    public PizzaBuilder() {
    }

    public PizzaBuilder bread(String bread) {
        this.bread = bread;
        return this;
    }

    public PizzaBuilder cheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    public PizzaBuilder paper(String paper) {
        this.paper = paper;
        return this;
    }

    public PizzaBuilder meat(String meat) {
        this.meat = meat;
        return this;
    }

    public PizzaBuilder mushrooms(String mushrooms) {
        this.mushrooms = mushrooms;
        return this;
    }

    public Pizza build() {
        Pizza pizza = new Pizza();
        pizza.setBread(bread);
        pizza.setCheese(cheese);
        pizza.setPaper(paper);
        pizza.setMeat(meat);
        pizza.setMushrooms(mushrooms);
        return pizza;
    }

}
