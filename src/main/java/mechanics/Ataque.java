package mechanics;

import entity.Inimigo;
import style.Estilo;
import weapon.Arma;

public interface Ataque {
    void executarAtaque(String nome, Estilo estilo, Arma arma, Inimigo inimigo);
    boolean verificarArma(Arma arma);
}
