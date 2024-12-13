package estilo;

import entity.Inimigo;
import entity.Entidade;

public class Lutador extends Estilo {
    @Override
    public void habilidadeEspecial(Class<Inimigo> alvo) {
        System.out.println("Usa a habiliadade de Lutador");
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
