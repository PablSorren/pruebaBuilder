package factoryMethod;

import org.junit.jupiter.api.Test;

public class FactoryMethodTest {

    @Test
    public void factoryMethod() {

        this.testearTipoBarista(new BaristaClasico());

        this.testearTipoBarista(new BaristaStarbucks());

        this.testearTipoBarista(new BaristaProfesional());
    }

    private void testearTipoBarista(Barista barista) {
        Cafe cafe = barista.servirCafe();
        cafe.detalles();
        System.out.println("===============================");

    }


}
