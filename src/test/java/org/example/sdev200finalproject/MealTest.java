package org.example.sdev200finalproject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MealTest {

    Meal defaultMeal = new PreparedMeal();
    Meal specificMeal = new FastFoodMeal(
            "McChicken",
            "McDonald's",
            "A sandwich",
            "Large",
            "Lunch",
            5,
            5,
            5,
            5,
            5
    );

    @Test
    void getName() {
        assertEquals("Stew", defaultMeal.getName());

        assertEquals("McChicken", specificMeal.getName());
    }

    @Test
    void getServingSize() {
        assertEquals("Medium", defaultMeal.getServingSize());

        assertEquals("Large", specificMeal.getServingSize());
    }

    @Test
    void getMealType() {
        assertEquals("Dinner", defaultMeal.getMealType());

        assertEquals("Lunch", specificMeal.getMealType());
    }
}