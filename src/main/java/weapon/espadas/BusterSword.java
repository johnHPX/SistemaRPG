package weapon.espadas;

public class BusterSword implements Espada{
    @Override
    public void corteLongo() {
        System.out.println("Corte longo de"+this.getClass().getName());
    }
}
