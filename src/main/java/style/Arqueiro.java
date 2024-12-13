package style;

import weapon.flechas.Flecha;

import java.util.ArrayList;

public class Arqueiro extends Estilo {

    private ArrayList<Flecha> aljava;

    public void addFlecha(Flecha flecha){
        aljava.add(flecha);
    }

    public void removeFlecha(Flecha flecha){
        aljava.remove(flecha);
    }

    public ArrayList<Flecha> getAljava() {
        return aljava;
    }

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
