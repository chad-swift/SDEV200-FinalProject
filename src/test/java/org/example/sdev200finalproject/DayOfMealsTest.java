package org.example.sdev200finalproject;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DayOfMealsTest {
    java.util.Date date = new java.util.Date(2026, Calendar.APRIL, 17);
    Meal preparedMeal = new PreparedMeal();
    Meal fastFoodMeal = new FastFoodMeal();

    DayOfMeals day = new DayOfMeals(
            date,
            new ArrayList<Meal>(List.of(preparedMeal, fastFoodMeal)),
            2000
    );

    @Test
    void getTotalCalories() {
        assertEquals(10, day.getTotalCalories());
    }

    @Test
    void getTotalProtein() {
        assertEquals(10, day.getTotalProtein());
    }

    @Test
    void getTotalFat() {
        assertEquals(10, day.getTotalProtein());
    }

    @Test
    void getTotalCarbs() {
        assertEquals(10, day.getTotalCarbs());
    }

    @Test
    void getTotalFiber() {
        assertEquals(10, day.getTotalFiber());
    }

    @Test
    void getRemainingCalories() {
        assertEquals(1990, day.getRemainingCalories());
    }

    @Test
    void isOverCalorieLimit() {
        assertTrue(day.isOverCalorieLimit());
    }

    @Test
    void getDayOfWeek() {
        assertEquals("Friday", day.getDayOfWeek());
    }
}