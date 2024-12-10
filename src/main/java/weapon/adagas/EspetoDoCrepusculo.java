package weapon.adagas;

public class EspetoDoCrepusculo implements Adaga {
    @Override
    public void cortefurtivo() {
        System.out.println("corte furtivo de "+this.getClass().getName());
    }
}
