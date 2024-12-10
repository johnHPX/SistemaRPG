package weapon.espadas;

public class Rebellion implements Espada{
    @Override
    public void corteLongo() {
        System.out.println("Corte longo de"+this.getClass().getName());
    }
}
