package org.example.sdev200finalproject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IngredientTest {

    Ingredient ingredient = new Ingredient(
            "Tomato",
            1,
            2.0,
            3.0,
            4.0,
            5.0
    );

    @Test
    void getName() {
        assertEquals("Tomato", ingredient.getName());
    }

    @Test
    void getTotalCalories() {
        assertEquals(1, ingredient.getTotalCalories());
    }

    @Test
    void getTotalProtein() {
        assertEquals(2, ingredient.getTotalProtein());
    }

    @Test
    void getTotalFat() {
        assertEquals(3, ingredient.getTotalFat());
    }

    @Test
    void getTotalCarbs() {
        assertEquals(4, ingredient.getTotalCarbs());
    }

    @Test
    void getTotalFiber() {
        assertEquals(5, ingredient.getTotalFiber());
    }
}