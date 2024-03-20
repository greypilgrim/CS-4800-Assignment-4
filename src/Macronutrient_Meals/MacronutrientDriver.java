package Macronutrient_Meals;

import Macronutrient_Meals.Customer.Customer;
import Macronutrient_Meals.FoodItems.Carbs.Carb;
import Macronutrient_Meals.FoodItems.Fats.Fat;
import Macronutrient_Meals.FoodItems.Proteins.Protein;

public class MacronutrientDriver {
    public static void main(String[] args) {
        //JAMES
        Customer james = new Customer("James", "No Restriction");

        Macronutrients jamesNutrients = MacronutrientAbstractFactory.createMacronutrients(
                james.getCustomerDietPlanItems().get(0),
                james.getCustomerDietPlanItems().get(1),
                james.getCustomerDietPlanItems().get(2));

        System.out.println(james.getCustomerName() + "'s diet plan: " + james.getCustomerDietPlanType());
        System.out.println(james.getCustomerName() + "'s randomly chosen meal, according to their diet restrictions:\n");
        jamesNutrients.carb.printInfo();
        jamesNutrients.protein.printInfo();
        jamesNutrients.fat.printInfo();
        System.out.println("\n");

        //BETTY
        Customer betty = new Customer("Betty", "Paleo");

        Macronutrients bettyNutrients = MacronutrientAbstractFactory.createMacronutrients(
                betty.getCustomerDietPlanItems().get(0),
                betty.getCustomerDietPlanItems().get(1),
                betty.getCustomerDietPlanItems().get(2));

        System.out.println(betty.getCustomerName() + "'s diet plan: " + betty.getCustomerDietPlanType());
        System.out.println(betty.getCustomerName() + "'s randomly chosen meal, according to their diet restrictions:\n");
        bettyNutrients.carb.printInfo();
        bettyNutrients.protein.printInfo();
        bettyNutrients.fat.printInfo();
        System.out.println("\n");

        //RICHARD
        Customer richard = new Customer("Richard", "Vegan");

        Macronutrients richardNutrients = MacronutrientAbstractFactory.createMacronutrients(
                richard.getCustomerDietPlanItems().get(0),
                richard.getCustomerDietPlanItems().get(1),
                richard.getCustomerDietPlanItems().get(2));

        System.out.println(richard.getCustomerName() + "'s diet plan: " + richard.getCustomerDietPlanType());
        System.out.println(richard.getCustomerName() + "'s randomly chosen meal, according to their diet restrictions:\n");
        richardNutrients.carb.printInfo();
        richardNutrients.protein.printInfo();
        richardNutrients.fat.printInfo();
        System.out.println("\n");

        //ALEX
        Customer alex = new Customer("Alex", "Nut Allergy");

        Macronutrients alexNutrients = MacronutrientAbstractFactory.createMacronutrients(
                alex.getCustomerDietPlanItems().get(0),
                alex.getCustomerDietPlanItems().get(1),
                alex.getCustomerDietPlanItems().get(2));

        System.out.println(alex.getCustomerName() + "'s diet plan: " + alex.getCustomerDietPlanType());
        System.out.println(alex.getCustomerName() + "'s randomly chosen meal, according to their diet restrictions:\n");
        alexNutrients.carb.printInfo();
        alexNutrients.protein.printInfo();
        alexNutrients.fat.printInfo();
        System.out.println("\n");

        //MIRANDA
        Customer miranda = new Customer("Miranda", "Vegan");

        Macronutrients mirandaNutrients = MacronutrientAbstractFactory.createMacronutrients(
                miranda.getCustomerDietPlanItems().get(0),
                miranda.getCustomerDietPlanItems().get(1),
                miranda.getCustomerDietPlanItems().get(2));

        System.out.println(miranda.getCustomerName() + "'s diet plan: " + miranda.getCustomerDietPlanType());
        System.out.println(miranda.getCustomerName() + "'s randomly chosen meal, according to their diet restrictions:\n");
        mirandaNutrients.carb.printInfo();
        mirandaNutrients.protein.printInfo();
        mirandaNutrients.fat.printInfo();
        System.out.println("\n");

        //ALEJANDRO
        Customer alejandro = new Customer("Alejandro", "Paleo");

        Macronutrients alejandroNutrients = MacronutrientAbstractFactory.createMacronutrients(
                alejandro.getCustomerDietPlanItems().get(0),
                alejandro.getCustomerDietPlanItems().get(1),
                alejandro.getCustomerDietPlanItems().get(2));

        System.out.println(alejandro.getCustomerName() + "'s diet plan: " + alejandro.getCustomerDietPlanType());
        System.out.println(alejandro.getCustomerName() + "'s randomly chosen meal, according to their diet restrictions:\n");
        alejandroNutrients.carb.printInfo();
        alejandroNutrients.protein.printInfo();
        alejandroNutrients.fat.printInfo();
        System.out.println("\n");

    }
}
