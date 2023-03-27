package command;


//El invocador del patron command y el cliente es el test que lo utiliza.
public class SwitchInvocador {

  Comandos estrategiaPrender;
  Comandos estrategiaApagar;

  public SwitchInvocador(LamparaReceptor lampara) {
    this.estrategiaPrender = new ComandoPrender(lampara);
    this.estrategiaApagar = new ComandoApagar(lampara);
  }

  public void switchUp(){
    this.estrategiaPrender.execute();
  }

  public void switchDown(){
    this.estrategiaApagar.execute();
  }

}
