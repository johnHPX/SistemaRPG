package enemy.enemies;

import entity.Inimigo;

public class Dodongo extends Inimigo {
    public Dodongo(String apelido){
        setNome("Dodongo");
        setApelido(apelido);
        setDescricao("Inimigo terrestre");
        setPv(800);
        setMp(50);
        setNivel(1);
        setTipo("Terrestre");
    }


}
