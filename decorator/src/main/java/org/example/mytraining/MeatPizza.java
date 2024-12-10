package org.example.mytraining;

import java.util.List;

public class MeatPizza extends OvenDecorator {
    private final List<String> ingredients;

    public MeatPizza(List<String> ingredients, Oven oven) {
        super(oven);
        this.ingredients = ingredients;
    }

    @Override
    public String bake() {
        StringBuilder bake = new StringBuilder(prepare());
        bake.append(super.bake());
        bake.replace(bake.length() - 1, bake.length(), ", ");
        for (String ingredient : ingredients) {
            bake.append(ingredient).append(", ");
        }
        bake.replace(bake.length() - 2, bake.length(), ".");
        return bake.toString();
    }

    private String prepare() {
        return "Prepare meat.";
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
