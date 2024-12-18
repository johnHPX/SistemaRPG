package mechanics.spells;

import entity.Entidade;

public class Trovao implements Feitico{
    private int dano = 350;

    @Override
    public void lancar(String nome, Entidade entity) {
        System.out.println(nome+" laçou trovão em "+entity.getNome());
        entity.setPv(entity.getPv() - dano);
        System.out.println("Feitiço bem sucedido");
    }
}
