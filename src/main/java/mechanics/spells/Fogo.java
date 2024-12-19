package mechanics.spells;

import entity.Entidade;

public class Fogo implements Feitico{
    private int dano = 350;

    @Override
    public void lancar(String nome, Entidade entity) {
        System.out.println(nome+" laçou fogo em "+entity.getNome());
        entity.setPv(entity.getPv() - dano);
        System.out.println(entity.getNome()+" perdeu "+dano+" de PV.");
        System.out.println("Feitiço bem sucedido");
    }
}
