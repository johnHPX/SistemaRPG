package style;

public class Mago extends Estilo {
    public Mago(){
        setNome("Mago");
        setBonusDano(10);
        setResistencia("Trovão");
        setBonusResistencia(40);
    }

    @Override
    public void status() {
        System.out.println("Estilo: "+getNome());
        System.out.println("Bonus(%) de ataque para cajados: "+getBonusDano());
        System.out.println("Resistencia: "+getResistencia());
        System.out.println("Bonus(%) de resistencia: "+getBonusResistencia());
    }
}
