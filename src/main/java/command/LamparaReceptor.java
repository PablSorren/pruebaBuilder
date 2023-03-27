package command;

//Receptor de comandos
public class LamparaReceptor {

  private Boolean estaPrendida = false;

  public LamparaReceptor() {
  }

  public void prender() {
    this.estaPrendida = true;
  }

  public void apagar() {
    this.estaPrendida = false;
  }

  public void estado() {
    String estado = estaPrendida ? "prendida" : "apagada";
    System.out.println("La lampara esta " + estado);
  }

}
