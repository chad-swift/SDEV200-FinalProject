package org.example.sdev200finalproject;

import java.util.ArrayList;

/**
 * Subclass of Meal representing a meal that the user would prepare themselves
 */
public class PreparedMeal extends Meal {
    private final ArrayList<Ingredient> ingredients = new ArrayList<>();

    // default constructor makes a default meal with one ingredient for testing
    public PreparedMeal() {
        this.name = "Stew";
        this.servingSize = "Medium";
        this.mealType = "Dinner";
        ingredients.add(new Ingredient());
    }

    public PreparedMeal(
            String name,
            String servingSize,
            String mealType,
            ArrayList<Ingredient> ingredients
    ) {
        this.name = name;
        this.servingSize = servingSize;
        this.mealType = mealType;
        this.ingredients.addAll(ingredients);
    }
    // These methods on here loop through each ingredient in the meal
    // Ingredient also implements NutritionCalculable

    /**
     * @return int representing the total amount of calories from all ingredients in this meal
     */
    @Override
    public int getTotalCalories() {
        int total = 0;
        for (Ingredient ingredient : this.ingredients) {
            total += ingredient.getTotalCalories();
        }
        return total;
    }

    /**
     * @return double representing the total amount of protein from all ingredients in this meal
     */
    @Override
    public double getTotalProtein() {
        double total = 0.0;
        for (Ingredient ingredient : this.ingredients) {
            total += ingredient.getTotalProtein();
        }
        return total;
    }

    /**
     * @return double representing the total amount of fat from all ingredients in this meal
     */
    @Override
    public double getTotalFat() {
        double total = 0.0;
        for (Ingredient ingredient : this.ingredients) {
            total += ingredient.getTotalFat();
        }
        return total;
    }

    /**
     * @return double representing the total amount of carbs from all ingredients in this meal
     */
    @Override
    public double getTotalCarbs() {
        double total = 0.0;
        for (Ingredient ingredient : this.ingredients) {
            total += ingredient.getTotalCarbs();
        }
        return total;
    }

    /**
     * @return double representing the total amount of fiber from all ingredients in this meal
     */
    @Override
    public double getTotalFiber() {
        double total = 0.0;
        for (Ingredient ingredient : this.ingredients) {
            total += ingredient.getTotalFiber();
        }
        return total;
    }
}
