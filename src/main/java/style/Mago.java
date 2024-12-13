package style;

public class Mago extends Estilo {
    public Mago(){
        setNome("Mago");
        setBonusDano(10);
        setResistencia("");
        setBonusResistencia(40);
    }

    @Override
    public void status() {
        System.out.println("Estilo: "+getNome());
        System.out.println("Bonus(%) de ataque para espadas: "+getBonusDano());
        System.out.println("Resistencia: "+getResistencia());
        System.out.println("Bonus(%) de resistencia: "+getBonusResistencia());
    }
}
