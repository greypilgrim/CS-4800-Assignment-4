package Macronutrient_Meals.FoodItems.Fats;

public class FatFactory {

    private static FatFactory fatFactory = null;
    private FatFactory(){}
    public static FatFactory getInstance(){
        if(fatFactory == null){
            fatFactory = new FatFactory();
        }
        return fatFactory;
    }
    public static Fat createFat(String fatType){
        if(fatType.equalsIgnoreCase("Avocado")){
            return new Avocado();
        }
        else if(fatType.equalsIgnoreCase("Sour Cream")){
            return new SourCream();
        }
        else if(fatType.equalsIgnoreCase("Tuna")){
            return new Tuna();
        }
        else if(fatType.equalsIgnoreCase("Peanuts")){
            return new Peanuts();
        }
        else{
            System.out.println("Incorrect Fat Type");
            return null;
        }
    }
}
