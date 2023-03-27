package decorator;

import org.junit.jupiter.api.Test;

public class BarcoDecoratorTest {


  @Test
  public void barcoDecorator(){

    Embarcacion barcoNormal = new Barco();
    Embarcacion barcoCarreras = new BarcoCarreras(barcoNormal);
    Embarcacion barcoBatallasYCarreras = new BarcoBatalla(barcoCarreras);
    Embarcacion barcoBatallas = new BarcoBatalla(barcoNormal);

    barcoNormal.estado();
    System.out.println("---------------------------");
    barcoCarreras.estado();
    System.out.println("---------------------------");
    barcoBatallas.estado();
    System.out.println("---------------------------");
    barcoBatallasYCarreras.estado();

  }

}
