package factoryMethod;

import com.sun.javafx.binding.StringFormatter;

public class Cafe {

    private TipoGrano tipoGrano ;

    private int cantidadAzucar;

    private Boolean conLeche;


    public Cafe(TipoGrano tipoGrano) {
        this.tipoGrano = tipoGrano;
        this.cantidadAzucar = 0;
        conLeche = false;
    }

    public TipoGrano getTipoGrano() {
        return tipoGrano;
    }

    public void endulzar(int cantidadAzucar) {
        this.cantidadAzucar += cantidadAzucar;
    }

    public void cortarConLeche() {
        this.conLeche = true;
    }

    public void detalles() {
        String msg = StringFormatter.format("El cafe usa\n granos : %s \n azucar : %d \n leche: %s\n", this.tipoGrano, this.cantidadAzucar, (this.conLeche ? "SI" : "NO")).get();
        System.out.println(msg);
    }

}
