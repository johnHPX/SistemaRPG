package mechanics.spells;

import entity.Entidade;

public class Gelo implements Feitico{
    private int dano = 250;

    @Override
    public void lancar(String nome, Entidade entity) {
        System.out.println(nome+" laçou gelo em "+entity.getNome());
        entity.setPv(entity.getPv() - dano);
        System.out.println("Feitiço bem sucedido");
    }
}
