package enemy.enemies;

import entity.Inimigo;
import mechanics.attacksEnimies.GolpeRapido;
import mechanics.spells.Fogo;
import mechanics.spells.Gelo;

public class Ork extends Inimigo {
    public Ork(String apelido){
        setNome("Ork");
        setApelido(apelido);
        setDescricao("Inimigo terrestre");
        setPv(550);
        setMp(50);
        setNivel(1);
        setTipo("Terrestre");
        setFeitico(new Gelo());
        setAtaque(new GolpeRapido());
    }

}
