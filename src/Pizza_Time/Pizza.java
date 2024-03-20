package Pizza_Time;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Pizza {
    private String restaurantName;
    private String pizzaSize;
    private ArrayList<String> chosenToppings = new ArrayList<>();

    public Pizza(PizzaBuilder pizzaBuilder){
        this.restaurantName = pizzaBuilder.restaurantName;
        this.pizzaSize = pizzaBuilder.pizzaSize;
        this.chosenToppings = pizzaBuilder.chosenToppings;
    }
    public void eat(){
        System.out.println("Pizza_Time.Pizza Chain: " + this.restaurantName);
        System.out.println("Size: " + this.pizzaSize);
        System.out.print("Ingredients: ");
        for (String chosenTopping : this.chosenToppings) {
            System.out.print(chosenTopping + ", ");
        }
        System.out.println("and of course LOVE.\nBon appétit!\n");
    }

    public static class PizzaBuilder{
        private String restaurantName;
        private String pizzaSize;
        private ArrayList<String> chosenToppings = new ArrayList<>();
        public PizzaBuilder(String pizzaSize, String chainName, int numOfIngredients){
            this.setSize(pizzaSize);
            this.setRestaurantName(chainName);

            List<String> allToppings = Arrays.asList("Pepperoni", "Sausage", "Mushrooms", "Bacon", "Onions",
                    "Extra Cheese", "Peppers", "Chicken", "Olives", "Spinach", "Tomato and Basil", "Beef",
                    "Ham", "Pesto", "Spicy Pork", "Ham and Pineapple");

            HashMap<Integer, String> allToppingsMap = new HashMap<>();
            for (int i = 0; i < allToppings.size(); i++) {
                allToppingsMap.put(i, allToppings.get(i));
            }

            this.addRandomToppings(allToppingsMap, numOfIngredients);
        }
        public PizzaBuilder addTopping(String toppingToBeAdded){
            this.chosenToppings.add(toppingToBeAdded);
            return this;
        }
        public PizzaBuilder addRandomToppings(HashMap<Integer,String> randomToppings, int numOftoppings){
            for(int i = 0; i < numOftoppings; i++){
                this.addTopping(randomToppings.get(i));
            }
            return this;
        }
        public PizzaBuilder setSize(String pizzaSize){
            this.pizzaSize = pizzaSize;
            return this;
        }
        public PizzaBuilder setRestaurantName(String restaurantName){
            this.restaurantName = restaurantName;
            return this;
        }
        public Pizza constructPizza(){
            return new Pizza(this);
        }
    }
}
