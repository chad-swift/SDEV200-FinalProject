package org.example.sdev200finalproject;

// Ingredient implements the interface
/**
 * Class representing the individual ingredients that a meal would consist of
 */
public class Ingredient implements NutritionCalculable {
    private final String name;
    private final int calories;
    private final double protein;
    private final double fat;
    private final double carbohydrates;
    private final double fiber;

    // default constructor makes a default ingredient for testing
    public Ingredient() {
        name = "Cheese";
        calories = 5;
        protein = 5.0;
        fat = 5.0;
        carbohydrates = 5.0;
        fiber = 5.0;
    }

    public Ingredient(
            String name,
            int calories,
            double protein,
            double fat,
            double carbs,
            double fiber
    ) {
        this.name = name;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.carbohydrates = carbs;
        this.fiber = fiber;
    }

    // These methods just return the values from the fields

    /**
     * @return String representing the name of the ingredient
     */
    public String getName() {
        return name;
    }

    /**
     * @return integer that represents the calories for this ingredient
     */
    @Override
    public int getTotalCalories() {
        return calories;
    }

    /**
     * @return double that represents the protein for this ingredient
     */
    @Override
    public double getTotalProtein() {
        return protein;
    }

    /**
     * @return double that represents the fat for this ingredient
     */
    @Override
    public double getTotalFat() {
        return fat;
    }

    /**
     * @return double that represents the carbs for this ingredient
     */
    @Override
    public double getTotalCarbs() {
        return carbohydrates;
    }

    /**
     * @return double that represents the fiber for this ingredient
     */
    @Override
    public double getTotalFiber() {
        return fiber;
    }
}
