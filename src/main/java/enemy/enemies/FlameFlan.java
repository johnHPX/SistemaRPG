package enemy.enemies;

import entity.Inimigo;
import mechanics.attacksEnimies.GolpeRapido;
import mechanics.spells.Fogo;

public class FlameFlan extends Inimigo {
    public FlameFlan(String apelido){
        setNome("Flame Flan");
        setApelido(apelido);
        setDescricao("Inimigo terrestre");
        setPv(600);
        setMp(50);
        setNivel(1);
        setTipo("Terrestre");
        setFeitico(new Fogo());
        setAtaque(new GolpeRapido());
    }


}
