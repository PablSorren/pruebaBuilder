package factoryMethod;

public class BaristaProfesional extends Barista{
    @Override
    public Cafe prepararCafe() {
        return new Cafe(TipoGrano.COLOMBIANO);
    }

    @Override
    public void cortarConLeche(Cafe cafe) {
        cafe.cortarConLeche();
    }
}
