package style;

public class Guerreiro extends Estilo {
    public Guerreiro(){
        setNome("Guerreiro");
        setBonusDano(10);
        setResistencia("gelo");
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
