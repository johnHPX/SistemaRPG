package enemy.enemies;

import entity.Inimigo;
import mechanics.attacksEnimies.GolpeRapido;
import mechanics.spells.Fogo;
import mechanics.spells.Trovao;

public class BatEye extends Inimigo {
    public BatEye(String apelido){
        setNome("Bat Eye");
        setApelido(apelido);
        setDescricao("Inimigo voador");
        setPv(400);
        setMp(50);
        setNivel(1);
        setTipo("Voador");
        setFeitico(new Trovao());
        setAtaque(new GolpeRapido());
    }
}
