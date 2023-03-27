package decorator;

//CONCRETE DECORATOR CLASS
public class BarcoBatalla extends BarcoDecorator{

  public BarcoBatalla(Embarcacion embarcacion) {
    super(embarcacion);
  }

  @Override
  public void estado() {
    super.estado();
    System.out.println(" a los tiros y bombazos");
    this.disparar();
  }

  public void disparar(){
    System.out.println(" BOOOOM");
  }

}
