package org.example.sdev200finalproject;

// this class implements NutritionCalculable interface for the subclasses

/**
 * Abstract class containing the base elements for a meal
 */
public abstract class Meal implements NutritionCalculable {
    protected String name;
    protected String servingSize;
    protected String mealType;

    protected Meal() {

    }

    public String getName() {
        return name;
    }

    public String getServingSize() {
        return servingSize;
    }

    public String getMealType() {
        return mealType;
    }
}
