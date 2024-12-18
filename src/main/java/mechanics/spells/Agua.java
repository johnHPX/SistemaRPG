package mechanics.spells;

import entity.Entidade;

public class Agua implements Feitico{

    private int dano = 270;

    @Override
    public void lancar(String nome, Entidade entity) {
        System.out.println(nome+" laçou agua em "+entity.getNome());
        entity.setPv(entity.getPv() - dano);
        System.out.println("Feitiço bem sucedido");
    }
}
