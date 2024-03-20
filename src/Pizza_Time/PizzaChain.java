package Pizza_Time;

public class PizzaChain {
    public String chainName;

    public PizzaChain(String chainName) {
        this.setChainName(chainName);
    }
    public void setChainName(String chainName){
        this.chainName = chainName;
    }
    public String getChainName(){
        return this.chainName;
    }

    public Pizza orderPizza(String size, int numOfIngredients){
        return new Pizza.PizzaBuilder(size, chainName, numOfIngredients).constructPizza();
    }
}

