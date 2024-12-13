package estilo;

import entity.Inimigo;
import entity.Entidade;

public class Ladrao extends Estilo {
    @Override
    public void habilidadeEspecial(Class<Inimigo> alvo) {
        System.out.println("Usa a habiliadade de Ladrão");
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
