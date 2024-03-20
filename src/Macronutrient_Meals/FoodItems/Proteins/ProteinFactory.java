package Macronutrient_Meals.FoodItems.Proteins;

public class ProteinFactory {

    private static ProteinFactory proteinFactory = null;
    private ProteinFactory(){}
    public static ProteinFactory getInstance(){
        if(proteinFactory == null){
            proteinFactory = new ProteinFactory();
        }
        return proteinFactory;
    }
    public static Protein createProtein(String proteinType){
        if(proteinType.equalsIgnoreCase("Fish")){
            return new Fish();
        }
        else if(proteinType.equalsIgnoreCase("Chicken")){
            return new Chicken();
        }
        else if(proteinType.equalsIgnoreCase("Beef")){
            return new Beef();
        }
        else if(proteinType.equalsIgnoreCase("Tofu")){
            return new Tofu();
        }
        else{
            System.out.println("Incorrect Protein Type");
            return null;
        }
    }
}
