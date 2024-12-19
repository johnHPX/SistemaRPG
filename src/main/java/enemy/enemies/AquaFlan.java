package enemy.enemies;

import entity.Inimigo;
import mechanics.attacksEnimies.GolpeRapido;
import mechanics.spells.Agua;

public class AquaFlan extends Inimigo {
    public AquaFlan(String apelido) {
        setNome("Aqua Flan");
        setApelido(apelido);
        setDescricao("Inimigo terrestre");
        setPv(500);
        setMp(70);
        setNivel(1);
        setTipo("Terrestre");
        setFeitico(new Agua());
        setAtaque(new GolpeRapido());
    }
}
