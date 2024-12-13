package weapon.espadas;

public class BusterSword extends Espada{

    public BusterSword(){
        setNome("BusterSword");
        setDano(320);
        setDescription("Espada longa");
        setNivel(1);
    }

    @Override
    public void ataqueCritico() {
        System.out.println("Ataque crítico");
    }
}
