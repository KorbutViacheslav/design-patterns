package org.example.mytraining;

import java.util.List;

public class Pizza implements Oven {
    private final List<String> ingredients;

    public Pizza(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String bake() {
        StringBuilder bake = new StringBuilder();
        for (String ingredient : ingredients) {
            bake.append(ingredient).append(", ");
        }
        bake.replace(bake.length() - 2, bake.length(), ".");
        return "Bake with: " + bake.toString();
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
