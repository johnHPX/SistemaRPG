package enemy.enemies;

import entity.Inimigo;

public class Ork extends Inimigo {
    public Ork(String apelido){
        setNome("Ork");
        setApelido(apelido);
        setDescricao("Inimigo terrestre");
        setPv(550);
        setMp(50);
        setNivel(1);
    }

}
