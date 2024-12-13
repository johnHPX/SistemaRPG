package estilo;

import entity.Inimigo;
import entity.Entidade;

public class Guerreiro extends Estilo {
    @Override
    public void habilidadeEspecial(Class<Inimigo> alvo) {
        System.out.println("Usa habilidade de guerreiro");
    }

    @Override
    public void ataqueNomal(Class<Inimigo> alvo) {
        System.out.println("Ataque normal");
    }

    @Override
    public void usarMagia(Class<Entidade> alvo) {
        System.out.println("Ataque magico");
    }
}
