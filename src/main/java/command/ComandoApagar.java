package command;

public class ComandoApagar implements Comandos {

  private LamparaReceptor lampara;

  public ComandoApagar(LamparaReceptor lampara) {
    this.lampara = lampara;
  }

  @Override
  public void execute() {
    lampara.apagar();
  }
}
