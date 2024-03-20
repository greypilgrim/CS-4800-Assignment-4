package Macronutrient_Meals;

import Macronutrient_Meals.FoodItems.Carbs.Carb;
import Macronutrient_Meals.FoodItems.Fats.Fat;
import Macronutrient_Meals.FoodItems.Proteins.Protein;

public class Macronutrients {
    public Carb carb;
    public Protein protein;
    public Fat fat;
    public Macronutrients(Carb carb, Protein protein, Fat fat){
        this.carb = carb;
        this.protein = protein;
        this.fat = fat;
    }
}
