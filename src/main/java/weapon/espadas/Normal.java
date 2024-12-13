package weapon.espadas;

public class Normal extends Espada{

    public Normal(){
        setNome("Normal");
        setDescription("Uma espada normal...");
        setNivel(1);
        setDano(120);
    }

    @Override
    public void ataqueCritico() {
        System.out.println("Ataque crítico");
    }
}
