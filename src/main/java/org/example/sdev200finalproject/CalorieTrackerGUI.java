package org.example.sdev200finalproject;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.util.ArrayList;


// Chad Swift
// SDEV200-50P
// Module 5 Final Check-in 4

// Created this for later
public class CalorieTrackerGUI extends Application {
    // meal array list
    ArrayList<Meal> meals = new ArrayList<>();
    ArrayList<Ingredient> ingredients = new ArrayList<>();

    // Section headers that also serve as means to display messages
    Text section1Header = new Text("Day Tracker");
    Text section2Header = new Text("Create New Meal");
    Text section3Header = new Text("Add Ingredients");

    // data fields that link to fields for the classes;
    DatePicker dateField = new DatePicker();
    Spinner<Integer> calorieLimitField = new Spinner<>(500, 4000, 2000, 100);
    ListView<String> mealListView = new ListView<>();
    TextArea outputArea = new TextArea();

    TextField ingredientNameField = new TextField();
    Spinner<Integer> caloriesField = new Spinner<>(0, 4000, 50, 1);
    Spinner<Double> proteinField = new Spinner<>(0.0, 300.0, 0.0, 1);
    Spinner<Double> fatField = new Spinner<>(0.0, 300.0, 0.0, 1);
    Spinner<Double> carbField = new Spinner<>(0.0, 300.0, 0.0, 1);
    Spinner<Double> fiberField = new Spinner<>(0.0, 300.0, 0.0, 1);

    Spinner<Integer> totalCaloriesField = new Spinner<>(0, 4000, 450, 1);
    Spinner<Double> totalProteinField = new Spinner<>(0.0, 300.0, 0.0, 1);
    Spinner<Double> totalFatField = new Spinner<>(0.0, 300.0, 0.0, 1);
    Spinner<Double> totalCarbField = new Spinner<>(0.0, 300.0, 0.0, 1);
    Spinner<Double> totalFiberField = new Spinner<>(0.0, 300.0, 0.0, 1);

    // section2 vbox;
    VBox section2 = new VBox();

    // more fields
    TextField mealNameField = new TextField();
    ComboBox<String> servingSizeCombo = new ComboBox<>();
    ComboBox<String> typeOfMealCombo = new ComboBox<>();
    TextField restaurantNameField = new TextField();
    TextField descriptionField = new TextField();
    CheckBox isFastFood = new CheckBox();
    ListView<String> ingredientViewList = new ListView<>();

    // constants for spacing
    final Insets PADDING = new Insets(8, 8, 8, 8);
    final int SPACING = 8;

    @Override
    public void start(Stage primaryStage) {

        // new horizontal box
        HBox pane = new HBox();

        VBox section1 = new VBox();
        // grid for the first section
        GridPane section1Grid = new GridPane();

        // adjust settings for fields
        calorieLimitField.setMinWidth(380);
        dateField.setMinWidth(380);
        outputArea.setEditable(false);
        mealListView.setMaxWidth(380);

        caloriesField.setEditable(true);
        proteinField.setEditable(true);
        fatField.setEditable(true);
        carbField.setEditable(true);
        fiberField.setEditable(true);
        outputArea.setPrefWidth(380);

        totalCaloriesField.setEditable(true);
        totalProteinField.setEditable(true);
        totalFatField.setEditable(true);
        totalCarbField.setEditable(true);
        totalFiberField.setEditable(true);

        section1Grid.setPadding(PADDING);
        section1Grid.setHgap(SPACING);
        section1Grid.setVgap(SPACING);

        HBox section1HeaderBox = new HBox();
        section1HeaderBox.getChildren().add(section1Header);
        section1HeaderBox.setAlignment(Pos.CENTER);

        // create labels
        Label dateLabel = new Label("Date");
        Label calorieLimitLabel = new Label("Calorie Limit");
        Label mealsLabel = new Label("Meals");
        Label outputLabel = new Label("Output");

        // create buttons and adjust settings
        Button removeSelectedBtn = new Button("Remove Selected");
        removeSelectedBtn.setMinWidth(380);
        Button calculateAndGenerateOutputBtn = new Button("Calculate and Generate Output");
        calculateAndGenerateOutputBtn.setMinWidth(380);
        outputArea.setMinWidth(380);

        section1Header.setTextAlignment(TextAlignment.CENTER);

        // add the parts to section1
        section1.getChildren().addAll(section1HeaderBox, section1Grid);

        // add the fields to the grid
        section1Grid.add(dateLabel, 0, 0);
        // some fields need to span more than one column
        section1Grid.add(dateField, 1, 0, 3, 1);
        section1Grid.add(calorieLimitLabel, 0, 1);
        section1Grid.add(calorieLimitField, 1, 1, 3, 1);
        section1Grid.add(mealsLabel, 0, 2);
        section1Grid.add(mealListView, 1, 2, 3, 1);
        section1Grid.add(removeSelectedBtn, 1, 3, 3, 1);
        section1Grid.add(calculateAndGenerateOutputBtn, 1, 4, 3, 1);
        section1Grid.add(outputLabel, 0, 5);
        section1Grid.add(outputArea, 1, 5, 3, 1);

        // add choices to the combo boxes
        typeOfMealCombo.getItems().addAll("Breakfast", "Lunch", "Dinner");
        servingSizeCombo.getItems().addAll("Small", "Medium", "Large");

        // set the spacing to the main vbox
        pane.setSpacing(SPACING);
        pane.setPadding(PADDING);

        HBox section2HeaderBox = new HBox();
        section2HeaderBox.setAlignment(Pos.CENTER);

        // this adds the text to the box so that it can be centered
        section2HeaderBox.getChildren().add(section2Header);

        // top part of the second section grid stays the same
        GridPane topPartGrid = new GridPane(50, SPACING);
        topPartGrid.setPadding(PADDING);

        // make labels for the first part
        Label mealNameLabel = new Label("Meal Name");
        Label servingSizeLabel = new Label("Serving Size");
        Label typeOfMealLabel = new Label("Type of Meal");
        Label isFastFoodLabel = new Label("Is Fast Food?");


        // add the properties to the top part of the grid
        topPartGrid.addRow(0, mealNameLabel, mealNameField);
        topPartGrid.addRow(1, servingSizeLabel, servingSizeCombo);
        topPartGrid.addRow(2, typeOfMealLabel, typeOfMealCombo);
        topPartGrid.addRow(3, isFastFoodLabel, isFastFood);

        // grid section for the fastFood meal bit
        GridPane fastFoodMealGrid = new GridPane(SPACING, SPACING);
        fastFoodMealGrid.setPadding(PADDING);

        // set some widths
        servingSizeCombo.setMinWidth(200);
        typeOfMealCombo.setMinWidth(200);

        // create labels for the fast food section
        Label restaurauntLabel = new Label("Restaurant");
        Label descriptionLabel = new Label("Description");
        Label totalCaloriesLabel = new Label("Total Calories");
        Label totalProteinLabel = new Label("Total Protein");
        Label totalFatLabel = new Label("Total Fat");
        Label totalCarbsLabel = new Label("Total Carbohydrates");
        Label totalFiberLabel = new Label("Total Fiber");
        Button addFastFoodMealBtn = new Button("Add Fast Food Meal to Meal List");

        // add the fast food meal button to a box so I can center it
        HBox addFastFoodBox = new HBox(addFastFoodMealBtn);
        addFastFoodBox.setAlignment(Pos.CENTER);

        // add the relevant fields to the fast food meal section
        fastFoodMealGrid.addRow(0, restaurauntLabel, restaurantNameField);
        fastFoodMealGrid.addRow(1, descriptionLabel, descriptionField);
        fastFoodMealGrid.addRow(2, totalCaloriesLabel, totalCaloriesField);
        fastFoodMealGrid.addRow(3, totalProteinLabel, totalProteinField);
        fastFoodMealGrid.addRow(4, totalFatLabel, totalFatField);
        fastFoodMealGrid.addRow(5, totalCarbsLabel, totalCarbField);
        fastFoodMealGrid.addRow(6, totalFiberLabel, totalFiberField);

        isFastFood.setSelected(true);

        // create prepared meal section and relevant buttons and labels
        GridPane preparedMealGrid = new GridPane(60, SPACING);
        preparedMealGrid.setPadding(PADDING);
        Button addPreparedMealBtn = new Button("Add Prepared Meal to Meal List");
        HBox addPreparedBox = new HBox(addPreparedMealBtn);
        addPreparedBox.setAlignment(Pos.CENTER);
        Button removeSelectedIngredientBtn = new Button("Remove Selected Ingredient");
        Label ingredientsListLabel = new Label("Ingredients");
        preparedMealGrid.add(ingredientsListLabel, 0, 0);
        preparedMealGrid.add(ingredientViewList, 1, 0);
        preparedMealGrid.add(removeSelectedIngredientBtn, 1, 1);

        ingredientViewList.setPrefWidth(200);

        // add all the parts to section 2, starting with the fast food bit enabled first
        section2.getChildren().addAll(section2HeaderBox, topPartGrid, fastFoodMealGrid, addFastFoodBox);

        // create section 3 and adjust settings
        VBox section3 = new VBox();
        section3.setPadding(PADDING);
        section3.setSpacing(SPACING);
        section3.setAlignment(Pos.CENTER);
        GridPane section3Grid = new GridPane(SPACING, SPACING);
        section3Grid.setPadding(PADDING);

        // create labels for the ingredients section
        Label IngredientNameLabel = new Label("Ingredient Name");
        Label caloriesLabel = new Label("Calories");
        Label proteinLabel = new Label("Protein");
        Label fatLabel = new Label("Fat");
        Label carbsLabel = new Label("Carbohydrates");
        Label fiberLabel = new Label("Fiber");

        // make a box so I can center the text
        HBox section3HeadBox = new HBox(section3Header);
        section3HeadBox.setAlignment(Pos.CENTER);

        // add all the fields and labels to the ingredients section
        section3Grid.addRow(0, IngredientNameLabel, ingredientNameField);
        section3Grid.addRow(1, caloriesLabel, caloriesField);
        section3Grid.addRow(2, proteinLabel, proteinField);
        section3Grid.addRow(3, fatLabel, fatField);
        section3Grid.addRow(4, carbsLabel, carbField);
        section3Grid.addRow(5, fiberLabel, fiberField);

        Button addIngredientBtn = new Button("Add Ingredient to Meal");

        // button added to box so I can center it
        HBox ingredientBtnBox = new HBox(addIngredientBtn);
        ingredientBtnBox.setAlignment(Pos.CENTER);

        // add all the parts of the third section to the box
        section3.getChildren().addAll(section3HeadBox, section3Grid, ingredientBtnBox);

        // separator between sections 1 and 2
        Separator separator = new Separator();

        // make it vertical
        separator.setOrientation(Orientation.VERTICAL);

        // add the first section, the second section, and the separator to the final horizontal box pane
        pane.getChildren().addAll(section1, separator, section2);

        // numbers to set these just in case we use them multiple places
        final int MAX_SCENE_WIDTH = 1150;
        final int MIN_SCENE_WIDTH = 850;

        // place the pane in the scene
        Scene scene = new Scene(pane, MIN_SCENE_WIDTH, 775);
        // set the title
        primaryStage.setTitle("Calorie Tracker App");
        // place the scene in the stage
        primaryStage.setScene(scene);

        // show the stage
        primaryStage.show();

        // cool event, this will change the form dynamically as the fast food checkbox is checked
        isFastFood.setOnAction(e -> {
            // if it is checked
            if (isFastFood.isSelected()) {
                // take all the prepared meal stuff out
                section2.getChildren().removeAll(preparedMealGrid, addPreparedBox);
                // add in all the fast foodstuff
                section2.getChildren().addAll(fastFoodMealGrid, addFastFoodBox);
                // we don't need section 3 regarding ingredients
                pane.getChildren().remove(section3);
                // change the size of the stage
                primaryStage.setWidth(MIN_SCENE_WIDTH);
            } else {
                // take all the fast foodstuff out
                section2.getChildren().removeAll(fastFoodMealGrid, addFastFoodBox);
                // add in the prepared meal stuff
                section2.getChildren().addAll(preparedMealGrid, addPreparedBox);
                // add in the stuff for section 3
                pane.getChildren().add(section3);
                // adjust the size of the stage
                primaryStage.setWidth(MAX_SCENE_WIDTH);
            }
        });

        // set an event for the next event, which is to create new fast food meal
        addFastFoodMealBtn.setOnAction(e -> createNewFastFoodMeal());

        addIngredientBtn.setOnAction(e -> createIngredient());

        addPreparedMealBtn.setOnAction(e -> createPreparedMeal());

        removeSelectedIngredientBtn.setOnAction(e -> deleteIngredient());

        removeSelectedBtn.setOnAction(e -> deleteMeal());

        calculateAndGenerateOutputBtn.setOnAction(e -> runDayReport());
    }

    public void createNewFastFoodMeal() {
        //  any of the fields are blank, we want to show an error
        if (
                mealNameField.getText().isBlank()
                || restaurantNameField.getText().isBlank()
                || servingSizeCombo.getValue() == null
                || typeOfMealCombo.getValue() == null
        ) {
            section2Header.setText("No Blanks Are Allowed");
            return;
        }

        // if everything is good, we want to create a new meal and add it to the list
        FastFoodMeal meal = new FastFoodMeal(
                mealNameField.getText(),
                restaurantNameField.getText(),
                descriptionField.getText(),
                servingSizeCombo.getValue(),
                typeOfMealCombo.getValue(),
                totalCaloriesField.getValue(),
                totalProteinField.getValue(),
                totalFatField.getValue(),
                totalCarbField.getValue(),
                totalFiberField.getValue()
            );
            meals.add(meal);
            // add the name of the meal to the ListView so we can see what's there
            mealListView.getItems().add(meal.getName());
            // clear the meal form so the user doesn't have to manually do it if they want to add another one
            clearMealForm();
            // change the text back, just in case there was an error
            section2Header.setText("Create New Meal");

    }

    public void createIngredient() {

        if (ingredientNameField.getText().isBlank()) {
            section3Header.setText("Ingredient Name can't be blank");
        } else {
            Ingredient ingredient = new Ingredient(
                    ingredientNameField.getText(),
                    caloriesField.getValue(),
                    proteinField.getValue(),
                    fatField.getValue(),
                    carbField.getValue(),
                    fiberField.getValue()
            );

            ingredients.add(ingredient);
            ingredientViewList.getItems().add(ingredient.getName());
            ingredientNameField.clear();
        }

    }

    public void deleteIngredient() {
        if (ingredients.isEmpty()) {
            section2Header.setText("There are no ingredients to remove");
            return;
        }

        ingredients.remove(ingredientViewList.getSelectionModel().getSelectedIndex());
        ingredientViewList.getItems().remove(ingredientViewList.getSelectionModel().getSelectedIndex());
    }

    public void deleteMeal() {
        if (meals.isEmpty()) {
            section1Header.setText("There are no meals to remove");
            return;
        }

        meals.remove(mealListView.getSelectionModel().getSelectedIndex());
        mealListView.getItems().remove(mealListView.getSelectionModel().getSelectedIndex());
    }

    public void createPreparedMeal() {
        if (ingredients.isEmpty()) {
            section2Header.setText("Must have at least one ingredient");
            return;
        }

        if (
                mealNameField.getText().isBlank()
                || servingSizeCombo.getValue() == null
                || typeOfMealCombo.getValue() == null
        ) {
            section2Header.setText("No Blanks Allowed!");
            return;
        }


        PreparedMeal meal = new PreparedMeal(
                mealNameField.getText(),
                servingSizeCombo.getValue(),
                typeOfMealCombo.getValue(),
                ingredients
        );

        meals.add(meal);
        mealListView.getItems().add(meal.getName());
        clearIngredients();
        clearMealForm();
        section2Header.setText("Create New Meal");
    }

    // method that clears the meal form
    public void clearMealForm() {
        mealNameField.clear();
        servingSizeCombo.setValue(null);
        typeOfMealCombo.setValue(null);
        restaurantNameField.clear();
        descriptionField.clear();

    }

    // method that clears the ingredients
    public void clearIngredients() {
        ingredients.clear();
        ingredientNameField.clear();
        ingredientViewList.getItems().clear();
    }

    public void runDayReport() {
        if (meals.isEmpty()) {
            section1Header.setText("There are no meals");
            return;
        }

        if (dateField.getValue() == null) {
            section1Header.setText("The date cannot be blank!");
            return;
        }

        DayOfMeals day = new DayOfMeals(java.sql.Date.valueOf(dateField.getValue()), meals, calorieLimitField.getValue());

        String[] mealsConsumed = mealListView.getItems().toArray(new String[0]);

        outputArea.setText(
                "Today is " + day.getDayOfWeek() + "\n" +
                "Calorie Limit is set at " + calorieLimitField.getValue() + "\n" +
                "Meals eaten today: \n\t" + String.join("\n\t", mealsConsumed) + "\n" +
                "The total amount of calories consumed is " + day.getTotalCalories() + "\n" +
                "The total amount of protein consumed is " + day.getTotalProtein() + "\n" +
                "The total amount of carbohydrates consumed is " + day.getTotalCarbs() + "\n" +
                "The total amount of fat consumed is " + day.getTotalFat() + "\n" +
                "The total amount of fiber consumed is " + day.getTotalFiber() + "\n" +
                "Under Calories? " + (day.isOverCalorieLimit()
                        ? "Yes! Calories remaining is " + day.getRemainingCalories()
                        : "No. Calorie deficit is " + day.getRemainingCalories())
        );

    }
}
