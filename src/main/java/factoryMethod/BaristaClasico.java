package factoryMethod;

public class BaristaClasico extends Barista{

    @Override
    public Cafe prepararCafe() {
        return new Cafe(TipoGrano.NORMAL);
    }

    @Override
    public void cortarConLeche(Cafe cafe) {

    }

}
