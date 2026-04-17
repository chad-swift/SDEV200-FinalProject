package org.example.sdev200finalproject;


/**
 * This interface ensures all parts of the application chain down properly
 */
public interface NutritionCalculable {
    int getTotalCalories();
    double getTotalProtein();
    double getTotalFat();
    double getTotalCarbs();
    double getTotalFiber();
}
