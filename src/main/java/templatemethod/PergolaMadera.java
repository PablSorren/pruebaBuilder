package templatemethod;

public class PergolaMadera extends PergolaTemplate{
    @Override
    public void ponerCimientos() {
        imprimir("Poniendo columnas de madera de pino");
    }

    @Override
    public void ponerTecho() {
        imprimir("Poniendo techo de madera de eucalipto");
    }

    @Override
    public void pintar() {
        imprimir("Pintando con barniz");
    }

    @Override
    public String getMaterial() {
        return "madera";
    }


    @Override
    public void armar(){
        imprimir(" Clavando techo con columnas de madera");
    }
}
