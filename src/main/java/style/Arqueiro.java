package style;

public class Arqueiro extends Estilo {

    public Arqueiro(){
        setNome("Arqueiro");
        setBonusDano(10);
        setResistencia("vento");
        setBonusResistencia(40);
    }

    @Override
    public void status() {
        System.out.println("Estilo: "+getNome());
        System.out.println("Bonus(%) de ataque para arcos: "+getBonusDano());
        System.out.println("Resistencia: "+getResistencia());
        System.out.println("Bonus(%) de resistencia: "+getBonusResistencia());
    }
}
