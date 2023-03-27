package templatemethod;

public abstract class PergolaTemplate {

    public void construir() {
        this.prepararTerreno();
        this.ponerCimientos();
        this.ponerTecho();
        this.armar();
        this.pintar();
        this.finalizar();
    }

    public void prepararTerreno() {
        imprimir("Limpiando y alisando terreno");
    }

    public abstract void ponerCimientos();

    public abstract void ponerTecho();

    public  void armar() {
        this.armar();
        imprimir("Techo con cimientos");
    }

    public abstract void pintar();

    public abstract String getMaterial();

    public void finalizar(){
        imprimir("Pergola de <" + this.getMaterial()+"> Finalizada");
    }

    public void imprimir(String msg) {
        System.out.println(msg);
    }

}
