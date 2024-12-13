package enemy.enemies;

import entity.Inimigo;

public class Lizalfos extends Inimigo {
    public Lizalfos(String apelido){
        setNome("Lizalfos");
        setApelido(apelido);
        setDescricao("Inimigo terrestre");
        setPv(500);
        setMp(0);
        setNivel(1);
    }


}
