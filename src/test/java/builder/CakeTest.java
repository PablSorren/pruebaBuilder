package builder;

import builder.Cake;
import builder.CakeBuilder;
import factoryMethod.Cafe;
import org.junit.jupiter.api.Test;

public class CakeTest {

    @Test
    public void normalCakeTest() {
        Cake cake = new Cake()
                .setSugar(24)
                .setColor("VERDE")
                .setEggs(8)
                .setMilk(100);

        cake
                .setFlour(324)
                .cookCake();

        System.out.println(cake.toString());
    }

    @Test
    public void cakeBuilderTest() {

        CakeBuilder builder = new CakeBuilder();

        builder.setColor("amarillo");
        builder.setEggs(1350);

        Cake cake = builder.build();
        System.out.println(cake.toString());
    }

    @Test
    public void insideBuilderCakeTest() {

        Cake cake = Cake
                .builder()
                .setSugar(24)
                .setColor("violeta")
                .setEggs(15)
                .setMilk(1000)
                .setFlour(350)
                .setCooked(true)
                .build();

        System.out.println(cake.toString());
    }

}
