package org.example.sdev200finalproject;

/**
 * Subclass of Meal that represents a meal from a Fast Food establishment
 */
public class FastFoodMeal extends Meal {
    private final String restaurantName;
    private final String description;
    private final int calorieTotal;
    private final double proteinTotal;
    private final double fatsTotal;
    private final double carbohydratesTotal;
    private final double fiberTotal;

    // default constructor makes  default meal for testing
    public FastFoodMeal() {
        name = "Big Mac";
        restaurantName = "McDonald's";
        description = "Big Mac with Cheese and Fries";
        mealType = "Dinner";
        calorieTotal = 5;
        proteinTotal = 5.0;
        fatsTotal = 5.0;
        carbohydratesTotal = 5.0;
        fiberTotal = 5.0;
    }

    public FastFoodMeal(String mealName,
                        String restaurantName,
                        String description,
                        String servingSize,
                        String mealType,
                        int calories,
                        double protein,
                        double fats,
                        double carbs,
                        double fiber
                        ) {
        this.name = mealName;
        this.servingSize = servingSize;
        this.restaurantName = restaurantName;
        this.description = description;
        this.mealType = mealType;
        calorieTotal = calories;
        proteinTotal = protein;
        fatsTotal = fats;
        carbohydratesTotal = carbs;
        fiberTotal = fiber;
    }

    /**
     * @return String representing the name of the establishment
     */
    public String getRestaurantName() {
        return this.restaurantName;
    }

    /**
     * @return represents the description, which can be what it's made of or other helpful info
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return integer that is the calories for this meal
     */
    @Override
    public int getTotalCalories() {
        return calorieTotal;
    }

    /**
     * @return double that is the protein for this meal
     */
    @Override
    public double getTotalProtein() {
        return proteinTotal;
    }

    /**
     * @return double that is the fat for this meal
     */
    @Override
    public double getTotalFat() {
        return fatsTotal;
    }

    /**
     * @return double that is the carbs for this meal
     */
    @Override
    public double getTotalCarbs() {
        return carbohydratesTotal;
    }

    /**
     * @return double that is the fiber for this meal
     */
    @Override
    public double getTotalFiber() {
        return fiberTotal;
    }

    @Override
    public String toString() {
        return this.name + " from a " + this.restaurantName + " establishment that was " + this.servingSize.toLowerCase() + " meal, as " + this.mealType.toLowerCase();
    }
}
