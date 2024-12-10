package weapon.adagas;

public class DenteDoAbismo implements Adaga {
    @Override
    public void cortefurtivo() {
        System.out.println("corte furtivo de "+this.getClass().getName());
    }
}
