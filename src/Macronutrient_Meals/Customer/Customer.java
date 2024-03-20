package Macronutrient_Meals.Customer;

import Macronutrient_Meals.DietPlanGenerator;

import java.util.HashMap;

public class Customer implements Customers{
    private String customerName;
    private String dietPlanType;
    private HashMap<Integer, String> customerDietPlanItems;
    public DietPlanGenerator dietPlanGenerator;

    public Customer(String customerName, String dietPlanType){
        this.setCustomerName(customerName);
        this.setCustomerDietPlanType(dietPlanType);
        this.dietPlanGenerator = new DietPlanGenerator(this.getCustomerDietPlanType());
    }

    @Override
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    @Override
    public String getCustomerName() {
        return this.customerName;
    }

    @Override
    public void setCustomerDietPlanType(String dietPlanType) {
        this.dietPlanType = dietPlanType;
    }
    @Override
    public String getCustomerDietPlanType() {
        return this.dietPlanType;
    }

    @Override
    public HashMap<Integer, String> getCustomerDietPlanItems() {
        this.customerDietPlanItems = this.dietPlanGenerator.getRandomDietPlan();
        return this.customerDietPlanItems;
    }
}
