package decorator;

public class Barco implements Embarcacion{

  @Override
  public void estado() {
    System.out.println(" navegando en un barquito");
  }
}
