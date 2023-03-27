package templatemethod;

public class PergolaMetal extends PergolaTemplate{
    @Override
    public void ponerCimientos() {
        imprimir("Clavando cimientos de caño metalico");
    }

    @Override
    public void ponerTecho() {
        imprimir("Armando el recuadro del techo de metal y clavandole chapas");
    }

    @Override
    public void pintar() {
        imprimir("Pintando con antioxido negro matae");
    }

    @Override
    public void armar(){
        imprimir(" Soldando recuadro techo de metal con columnas metalicas");
    }

    @Override
    public String getMaterial() {
        return "Metal";
    }
}
