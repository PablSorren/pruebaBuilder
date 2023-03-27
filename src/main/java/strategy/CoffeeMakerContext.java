package strategy;

public class CoffeeMakerContext {

    private CoffeeStrategy coffeeStrategy;


    public CoffeeMakerContext(CoffeeStrategy coffeeStrategy) {
        this.coffeeStrategy = coffeeStrategy;
    }


    public void makeCoffee(){
        this.coffeeStrategy.makeCoffeThisWay();
    }
}
