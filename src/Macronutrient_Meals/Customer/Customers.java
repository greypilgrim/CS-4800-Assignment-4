package Macronutrient_Meals.Customer;

import java.util.HashMap;

public interface Customers {
    public void setCustomerName(String customerName);
    public String getCustomerName();
    public void setCustomerDietPlanType(String dietPlanType);
    public String getCustomerDietPlanType();
    public HashMap<Integer, String> getCustomerDietPlanItems();
}
