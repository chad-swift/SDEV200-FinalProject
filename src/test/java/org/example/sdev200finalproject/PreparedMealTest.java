package org.example.sdev200finalproject;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PreparedMealTest {

    Ingredient ingredient1 = new Ingredient("Sauce", 1, 2, 3, 4, 5);
    Ingredient ingredient2 = new Ingredient("Banana", 5, 4, 3, 2, 1);

    PreparedMeal meal = new PreparedMeal(
            "Sauced Banana",
            "Medium",
            "Dessert",
            new ArrayList<Ingredient>(List.of(ingredient1, ingredient2))
    );

    @Test
    void getTotalCalories() {
        assertEquals(6, meal.getTotalCalories());
    }

    @Test
    void getTotalProtein() {
        assertEquals(6, meal.getTotalProtein());
    }

    @Test
    void getTotalFat() {
        assertEquals(6, meal.getTotalFat());
    }

    @Test
    void getTotalCarbs() {
        assertEquals(6, meal.getTotalCarbs());
    }

    @Test
    void getTotalFiber() {
        assertEquals(6, meal.getTotalFiber());
    }
}