package enemy.enemies;

import entity.Inimigo;

public class BatEye extends Inimigo {
    public BatEye(String apelido){
        setNome("Bat Eye");
        setApelido(apelido);
        setDescricao("Inimigo voador");
        setPv(400);
        setMp(50);
        setNivel(1);
        setTipo("Voador");
    }
}
