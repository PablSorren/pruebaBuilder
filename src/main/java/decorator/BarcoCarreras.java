package decorator;

//CONCRETE DECORATOR CLASS
public class BarcoCarreras extends  BarcoDecorator{

  public BarcoCarreras(Embarcacion embarcacion) {
    super(embarcacion);
  }

  @Override
  public void estado() {
    embarcacion.estado();
    System.out.println(" a toda velocidad");
    this.acelerar();
  }

  public void acelerar(){
    System.out.println("niiiiiiiiummm");
  }

}
