package mechanics.attacksArmas;

import entity.Inimigo;
import style.Estilo;
import weapon.Arma;

public interface AtaquePersonagem {
    void executarAtaque(String nome, Estilo estilo, Arma arma, Inimigo inimigo);
}
