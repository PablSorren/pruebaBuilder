package factoryMethod;

/**
 * Clase padre donde se definen los pasos para construir
 * En las clases hijos se define los detalles de la construccion de cada objeto Cafe
 */
public abstract class Barista {


    public Cafe servirCafe() {
        Cafe cafe = this.prepararCafe();
        cafe.endulzar(2);
        this.cortarConLeche(cafe);
        return cafe;
    }


    public abstract Cafe prepararCafe();

    public abstract void cortarConLeche(Cafe cafe);

}
