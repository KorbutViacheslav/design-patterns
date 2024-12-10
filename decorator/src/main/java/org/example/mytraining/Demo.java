package org.example.mytraining;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> ingredients = List.of("Bread", "Cheese");
        Oven pizza = new Pizza(ingredients);

        List<String> meatIngredients = List.of("Beef");
        Oven meatPizza = new MeatPizza(meatIngredients, pizza);

        List<String> vegetableIngredients = List.of("Tomatoes", "Mushroom");
        Oven vegetablePizza = new VegetarianPizza(vegetableIngredients, pizza);

        System.out.println(pizza.bake());
        System.out.println(meatPizza.bake());
        System.out.println(vegetablePizza.bake());
    }
}
