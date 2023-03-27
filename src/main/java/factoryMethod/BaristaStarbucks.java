package factoryMethod;

public class BaristaStarbucks extends Barista{


    @Override
    public Cafe prepararCafe() {
        return new Cafe(TipoGrano.TOSTADO);
    }

    @Override
    public void cortarConLeche(Cafe cafe) {
        cafe.cortarConLeche();
    }
}
