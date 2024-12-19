package mechanics.spells;

import entity.Entidade;

public class Cura implements Feitico{
    private int cura = 50;

    @Override
    public void lancar(String nome, Entidade entity) {
        System.out.println(nome+" laçou cura em "+entity.getNome());
        entity.setPv(entity.getPv() + cura);
        System.out.println(entity.getNome()+" ganhou "+cura+" de PV.");
        System.out.println("Feitiço bem sucedido");
    }
}
