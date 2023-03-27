package strategy;

public class ExpressoCoffee implements CoffeeStrategy{

    @Override
    public void makeCoffeThisWay() {
        this.typeOfCoffee();
        System.out.println("10% water");
        System.out.println("90% coffee");
        System.out.println("====================");
    }

    @Override
    public void typeOfCoffee() {
        System.out.println("MAKING AN EXPRESSO COFFEE");
    }
}
