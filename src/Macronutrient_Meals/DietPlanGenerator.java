package Macronutrient_Meals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class DietPlanGenerator {
    public List allCarbs, allProteins, allFats;
    public List paleoCarbs, paleoProteins, paleoFats;
    public List veganCarbs, veganProteins, veganFats;
    public List nutAllergyCarbs, nutAllergyProteins, nutAllergyFats;
    private HashMap<Integer, String> randomDietPlan;
    private String specifiedPlan;
    public final int PLAN_SIZE = 3;

    public DietPlanGenerator(String specifiedPlan){
        this.setSpecifiedPlan(specifiedPlan);
        this.setLists(specifiedPlan);
        this.setRandomDietPlan();
    }

    public void setLists(String specifiedPlan){
        if("No Restriction".equalsIgnoreCase(this.getSpecifiedPlan())){
            this.allCarbs = new ArrayList<String>();
            this.allProteins= new ArrayList<String>();
            this.allFats = new ArrayList<String>();
            
            this.allCarbs.add("Cheese");
            this.allCarbs.add("Bread");
            this.allCarbs.add("Lentils");
            this.allCarbs.add("Pistachio");

            this.allProteins.add("Fish");
            this.allProteins.add("Chicken");
            this.allProteins.add("Beef");
            this.allProteins.add("Tofu");

            this.allFats.add("Avocado");
            this.allFats.add("Sour Cream");
            this.allFats.add("Tuna");
            this.allFats.add("Peanuts");
        }
        else if("Paleo".equalsIgnoreCase(this.getSpecifiedPlan())){
            this.paleoCarbs = new ArrayList<String>();
            this.paleoProteins= new ArrayList<String>();
            this.paleoFats = new ArrayList<String>();

            this.paleoCarbs.add("Pistachio");

            this.paleoProteins.add("Fish");
            this.paleoProteins.add("Chicken");
            this.paleoProteins.add("Beef");

            this.paleoFats.add("Avocado");
            this.paleoFats.add("Tuna");
            this.paleoFats.add("Peanuts");
        }
        else if("Vegan".equalsIgnoreCase(this.getSpecifiedPlan())){
            this.veganCarbs = new ArrayList<String>();
            this.veganProteins= new ArrayList<String>();
            this.veganFats = new ArrayList<String>();

            this.veganCarbs.add("Bread");
            this.veganCarbs.add("Lentils");
            this.veganCarbs.add("Pistachio");

            this.veganProteins.add("Tofu");

            this.veganFats.add("Avocado");
            this.veganFats.add("Tuna");
            this.veganFats.add("Peanuts");
        }
        else if("Nut Allergy".equalsIgnoreCase(this.getSpecifiedPlan())){
            this.nutAllergyCarbs = new ArrayList<String>();
            this.nutAllergyProteins= new ArrayList<String>();
            this.nutAllergyFats = new ArrayList<String>();

            this.nutAllergyCarbs.add("Cheese");
            this.nutAllergyCarbs.add("Bread");
            this.nutAllergyCarbs.add("Lentils");

            this.nutAllergyProteins.add("Fish");
            this.nutAllergyProteins.add("Chicken");
            this.nutAllergyProteins.add("Beef");
            this.nutAllergyProteins.add("Tofu");

            this.nutAllergyFats.add("Avocado");
            this.nutAllergyFats.add("Sour Cream");
            this.nutAllergyFats.add("Tuna");
        }
    }

    public void setSpecifiedPlan(String specifiedPlan){
        this.specifiedPlan = specifiedPlan;
    }
    public String getSpecifiedPlan(){
        return this.specifiedPlan;
    }

    public void setRandomDietPlan(){
        Random randNum = new Random();
        if("No Restriction".equalsIgnoreCase(this.getSpecifiedPlan())){
            randomDietPlan = new HashMap<>();
            for(int i = 0; i < this.PLAN_SIZE; i++){
                if(i == 0){
                    this.randomDietPlan.put(i, (String)this.allCarbs.get(randNum.nextInt(this.allCarbs.size())));
                }
                if(i == 1){
                    this.randomDietPlan.put(i, (String)this.allProteins.get(randNum.nextInt(this.allProteins.size())));
                }
                if(i == 2){
                    this.randomDietPlan.put(i, (String)this.allFats.get(randNum.nextInt(this.allFats.size())));
                }
            }
        }
        else if("Paleo".equalsIgnoreCase(this.getSpecifiedPlan())){
            randomDietPlan = new HashMap<>();
            for(int i = 0; i < this.PLAN_SIZE; i++){
                if(i == 0){
                    this.randomDietPlan.put(i, (String)this.paleoCarbs.get(randNum.nextInt(this.paleoCarbs.size())));
                }
                if(i == 1){
                    this.randomDietPlan.put(i, (String)this.paleoProteins.get(randNum.nextInt(this.paleoProteins.size())));
                }
                if(i == 2){
                    this.randomDietPlan.put(i, (String)this.paleoFats.get(randNum.nextInt(this.paleoFats.size())));
                }
            }
        }
        else if("Vegan".equalsIgnoreCase(this.getSpecifiedPlan())){
            randomDietPlan = new HashMap<>();
            for(int i = 0; i < this.PLAN_SIZE; i++){
                if(i == 0){
                    this.randomDietPlan.put(i, (String)this.veganCarbs.get(randNum.nextInt(this.veganCarbs.size())));
                }
                if(i == 1){
                    this.randomDietPlan.put(i, (String)this.veganProteins.get(randNum.nextInt(this.veganProteins.size())));
                }
                if(i == 2){
                    this.randomDietPlan.put(i, (String)this.veganFats.get(randNum.nextInt(this.veganFats.size())));
                }
            }
        }
        else if("Nut Allergy".equalsIgnoreCase(this.getSpecifiedPlan())){
            randomDietPlan = new HashMap<>();
            for(int i = 0; i < this.PLAN_SIZE; i++){
                if(i == 0){
                    this.randomDietPlan.put(i, (String)this.nutAllergyCarbs.get(randNum.nextInt(this.nutAllergyCarbs.size())));
                }
                if(i == 1){
                    this.randomDietPlan.put(i, (String)this.nutAllergyProteins.get(randNum.nextInt(this.nutAllergyProteins.size())));
                }
                if(i == 2){
                    this.randomDietPlan.put(i, (String)this.nutAllergyFats.get(randNum.nextInt(this.nutAllergyFats.size())));
                }
            }
        }
    }

    public HashMap<Integer, String> getRandomDietPlan(){
        return this.randomDietPlan;
    }
}
