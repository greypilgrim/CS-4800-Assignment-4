package Macronutrient_Meals;

import Macronutrient_Meals.FoodItems.Carbs.Carb;
import Macronutrient_Meals.FoodItems.Carbs.CarbFactory;
import Macronutrient_Meals.FoodItems.Fats.Fat;
import Macronutrient_Meals.FoodItems.Fats.FatFactory;
import Macronutrient_Meals.FoodItems.Proteins.Protein;
import Macronutrient_Meals.FoodItems.Proteins.ProteinFactory;

public class MacronutrientAbstractFactory {
    public static Macronutrients createMacronutrients(String carbType, String proteinType, String fatType){
        Carb carb = CarbFactory.createCarb(carbType);
        Protein protein = ProteinFactory.createProtein(proteinType);
        Fat fat = FatFactory.createFat(fatType);
        return new Macronutrients(carb, protein, fat);
    }
}
