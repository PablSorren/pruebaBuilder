package templatemethod;

import org.junit.jupiter.api.Test;

import javax.swing.*;

public class TemplateMethodTest {


    @Test
    public void templateTst() {

        PergolaTemplate pergolaMadera = new PergolaMadera();

        pergolaMadera.construir();

        System.out.println(" ========================== ");

        PergolaTemplate pergolaMetal = new PergolaMetal();

        pergolaMetal.construir();

    }

}
