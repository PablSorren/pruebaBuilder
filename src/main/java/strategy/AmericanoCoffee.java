package strategy;

public class AmericanoCoffee implements CoffeeStrategy{

    @Override
    public void makeCoffeThisWay() {
        this.typeOfCoffee();
        System.out.println("20% milk");
        System.out.println("60% coffee");
        System.out.println("5% cream");
        System.out.println("15% sugar");
        System.out.println("====================");
    }

    @Override
    public void typeOfCoffee() {
        System.out.println("MAKING AN AMERICANO COFFEE");
    }

}
