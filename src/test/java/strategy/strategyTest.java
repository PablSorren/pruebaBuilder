package strategy;

import org.junit.jupiter.api.Test;

public class strategyTest {

    @Test
    public void strategyTst() {

        CoffeeMakerContext coffeMaker = new CoffeeMakerContext(new AmericanoCoffee());

        coffeMaker.makeCoffee();

        coffeMaker = new CoffeeMakerContext(new MachiattoCoffee());

        coffeMaker.makeCoffee();

        coffeMaker = new CoffeeMakerContext(new ExpressoCoffee());
        coffeMaker.makeCoffee();
    }

}
