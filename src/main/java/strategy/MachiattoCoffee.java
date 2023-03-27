package strategy;

public class MachiattoCoffee implements CoffeeStrategy{

    @Override
    public void makeCoffeThisWay() {
        this.typeOfCoffee();
        System.out.println("10% water");
        System.out.println("20% caramel");
        System.out.println("60% coffee");
        System.out.println("5% cream");
        System.out.println("5% ice");
        System.out.println("====================");
    }

    @Override
    public void typeOfCoffee() {
        System.out.println("MAKING A MACHIATTO COFFEE");
    }
}
