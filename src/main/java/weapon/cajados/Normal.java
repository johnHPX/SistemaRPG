package weapon.cajados;

public class Normal implements Cajado{
    @Override
    public void ataqueMagico() {
        System.out.println("Ataque mágico por "+this.getClass().getName());
    }
}
