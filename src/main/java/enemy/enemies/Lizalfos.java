package enemy.enemies;

import entity.Inimigo;
import mechanics.attacksEnimies.GolpeRapido;
import mechanics.spells.Fogo;

public class Lizalfos extends Inimigo {
    public Lizalfos(String apelido){
        setNome("Lizalfos");
        setApelido(apelido);
        setDescricao("Inimigo terrestre");
        setPv(500);
        setMp(0);
        setNivel(1);
        setTipo("Terrestre");
        setFeitico(new Fogo());
        setAtaque(new GolpeRapido());
    }


}
