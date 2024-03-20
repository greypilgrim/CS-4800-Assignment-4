package Pizza_Time;
// This driver has random toppings being added to the pizza for convenience and ease of use.
// This code, as well as the two files being used, could easily be altered to allow an interactive driver instead,
// Where the user would be able to pick and choose specific toppings.
public class PizzaDriver {
    public static void main(String[] args) {

        // First three Pizza_Time.Pizza Hut pizzas
        PizzaChain firstHut = new PizzaChain("Pizza_Time.Pizza Hut");
        Pizza small = firstHut.orderPizza("small", 3);
        Pizza medium = firstHut.orderPizza("medium", 6);
        Pizza large = firstHut.orderPizza("large", 9);
        small.eat();
        medium.eat();
        large.eat();

        // Create three different pizza chain restaurants and their pizzas
        PizzaChain pizzaHut = new PizzaChain("Pizza_Time.Pizza Hut");
        Pizza pizzaHutLarge = pizzaHut.orderPizza("large", 3);
        Pizza pizzaHutSmall = pizzaHut.orderPizza("small", 2);

        PizzaChain littleCaesars = new PizzaChain("Little Caesars");
        Pizza littleCaesarsMedium = littleCaesars.orderPizza("large", 8);
        Pizza littleCaesarsSmall = littleCaesars.orderPizza("small", 6);

        PizzaChain dominos = new PizzaChain("Dominos");
        Pizza dominosSmall = dominos.orderPizza("large", 1);
        Pizza dominosLarge = dominos.orderPizza("small", 6);
    }
}
