package style;

public final class Ladrao extends Estilo {
    public Ladrao(){
        setNome("Ladrão");
        setBonusDano(10);
        setResistencia("Escuridão");
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
