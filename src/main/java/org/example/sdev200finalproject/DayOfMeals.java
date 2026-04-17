package org.example.sdev200finalproject;

import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Locale;

// Set up the day, this class should implement my interface
/**
 * Class used for setting up the daily nutrition value
 */
public class DayOfMeals implements NutritionCalculable {
    private final java.util.Date date;
    private final ArrayList<Meal> meals = new ArrayList<>();
    private final int dailyCalorieLimit;

    // default actually does something, mostly for testing
    public DayOfMeals() {
        this.date = new java.util.Date();
        this.meals.add(new FastFoodMeal());
        this.dailyCalorieLimit = 2000;
    }

    public DayOfMeals(
            java.util.Date date,
            ArrayList<Meal> meals,
            int dailyCalorieLimit
    ) {
        this.date = date;
        this.meals.addAll(meals);
        this.dailyCalorieLimit = dailyCalorieLimit;
    }

    // Methods for NutritionCalculable just loop over meals and call meal's version
    // of same method, because Meal also implements NutritionCalculable
    /**
     * @return integer that is the combined total of all calories for all meals for the day
     */
    @Override
    public int getTotalCalories() {
        int total = 0;
        for (Meal meal : meals) {
            total += meal.getTotalCalories();
        }
        return total;
    }

    /**
     * @return double that is the combined total of all protein for all meals for the day
     */
    @Override
    public double getTotalProtein() {
        double total = 0;
        for (Meal meal : meals) {
            total += meal.getTotalProtein();
        }
        return total;
    }


    /**
     * @return double that is the combined total of all fat for all meals for the day
     */
    @Override
    public double getTotalFat() {
        double total = 0;
        for (Meal meal : meals) {
            total += meal.getTotalFat();
        }
        return total;
    }

    /**
     * @return double that is the combined total of all carbs for all meals for the day
     */
    @Override
    public double getTotalCarbs() {
        double total = 0;
        for (Meal meal : meals) {
            total += meal.getTotalCarbs();
        }
        return total;
    }


    /**
     * @return double that is the combined total of all fiber for all meals for the day
     */
    @Override
    public double getTotalFiber() {
        double total = 0;
        for (Meal meal : meals) {
            total += meal.getTotalFiber();
        }
        return total;
    }

    /**
     * @return int representing the remaining calories the user will have for the day to meet their limit
     */
    public int getRemainingCalories() {
        return dailyCalorieLimit - getTotalCalories();
    }


    /**
     * @return boolean representing whether the calories went over the daily amount specified
     */
    public boolean isOverCalorieLimit() {
        return getRemainingCalories() > 0;
    }

    /**
     * @return String representing the string value of the day of the week entered for the current day
     */
    public String getDayOfWeek() {
        GregorianCalendar calendar = new GregorianCalendar();

        ZonedDateTime zdt = calendar.toZonedDateTime();

        return zdt.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.US);
    }
}
