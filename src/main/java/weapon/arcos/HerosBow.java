package weapon.arcos;

public class HerosBow implements Arco{
    @Override
    public void ataqueDistante() {
        System.out.println("Ataque a distancia por "+this.getClass().getName());
    }
}
