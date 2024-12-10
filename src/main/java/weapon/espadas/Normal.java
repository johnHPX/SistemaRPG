package weapon.espadas;

public class Normal implements Espada{
    @Override
    public void corteLongo() {
        System.out.println("Corte longo de"+this.getClass().getName());
    }
}
