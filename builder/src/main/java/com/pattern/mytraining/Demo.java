package com.pattern.mytraining;

public class Demo {
    public static void main(String[] args) {
        Pizza pizza = Pizza.builder().bread("Bread").cheese("Chese").build();

        System.out.println(pizza.toString());
    }
}
