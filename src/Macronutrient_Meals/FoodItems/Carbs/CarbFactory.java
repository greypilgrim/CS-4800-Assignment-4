package Macronutrient_Meals.FoodItems.Carbs;

public class CarbFactory {

    private static CarbFactory carbFactory = null;
    private CarbFactory(){}
    public static CarbFactory getInstance(){
        if(carbFactory == null){
            carbFactory = new CarbFactory();
        }
        return carbFactory;
    }
    public static Carb createCarb(String carbType){
        if(carbType.equalsIgnoreCase("Bread")){
            return new Bread();
        }
        else if(carbType.equalsIgnoreCase("Cheese")){
            return new Cheese();
        }
        else if(carbType.equalsIgnoreCase("Lentils")){
            return new Lentils();
        }
        else if(carbType.equalsIgnoreCase("Pistachio")){
            return new Pistachio();
        }
        else {
            System.out.println("Incorrect Carb Type");
            return null;
        }
    }
}
