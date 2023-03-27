package command;

public class ComandoPrender implements Comandos {

  private LamparaReceptor lampara;

  public ComandoPrender(LamparaReceptor lampara) {
    this.lampara = lampara;
  }

  @Override
  public void execute() {
    lampara.prender();
  }
}
