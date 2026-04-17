package org.example.sdev200finalproject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FastFoodMealTest {
    FastFoodMeal defaultMeal = new FastFoodMeal();

    FastFoodMeal specificMeal = new FastFoodMeal(
            "Grilled Chicken Sandwich",
            "Burger King",
            "A Chicken Sandwich",
            "Small",
            "Dinner",
            1,
            2,
            3,
            4,
            5
    );

    @Test
    void getRestaurantName() {
        assertEquals("McDonald's", defaultMeal.getRestaurantName());

        assertEquals("Burger King", specificMeal.getRestaurantName());
    }

    @Test
    void getDescription() {
        assertEquals("Big Mac with Cheese and Fries", defaultMeal.getDescription());

        assertEquals("A Chicken Sandwich", specificMeal.getDescription());
    }

    @Test
    void getTotalCalories() {
        assertEquals(5, defaultMeal.getTotalCalories());

        assertEquals(1, specificMeal.getTotalCalories());
    }

    @Test
    void getTotalProtein() {
        assertEquals(5, defaultMeal.getTotalProtein());

        assertEquals(2, specificMeal.getTotalProtein());
    }

    @Test
    void getTotalFat() {
        assertEquals(5, defaultMeal.getTotalFat());

        assertEquals(3, specificMeal.getTotalFat());
    }

    @Test
    void getTotalCarbs() {
        assertEquals(5, defaultMeal.getTotalCarbs());

        assertEquals(4, specificMeal.getTotalCarbs());
    }

    @Test
    void getTotalFiber() {
        assertEquals(5, defaultMeal.getTotalFiber());

        assertEquals(5, specificMeal.getTotalFiber());
    }
}