package Command;

import org.junit.jupiter.api.Test;
import command.LamparaReceptor;
import command.SwitchInvocador;

public class CommandTest {


  @Test
  public void testCommandCliente() {

    LamparaReceptor lampara = new LamparaReceptor();

    lampara.estado();

    SwitchInvocador tecla = new SwitchInvocador(lampara);
    tecla.switchUp();

    lampara.estado();

    tecla.switchDown();

    lampara.estado();


  }

}
