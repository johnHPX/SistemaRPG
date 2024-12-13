package estilo;

import entity.Inimigo;
import entity.Entidade;

public abstract class Estilo {

    public abstract void habilidadeEspecial(Class<Inimigo> alvo);
    public abstract void ataqueNomal(Class<Inimigo> alvo);
    public abstract void usarMagia(Class<Entidade> alvo);

}
