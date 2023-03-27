package decorator;

public class BarcoDecorator implements Embarcacion{

  protected Embarcacion embarcacion;

  public BarcoDecorator(Embarcacion embarcacion) {
    this.embarcacion = embarcacion;
  }

  @Override
  public void estado() {
   embarcacion.estado();
  }
}
