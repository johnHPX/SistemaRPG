package enemy.enemies;

import entity.Inimigo;

public class FireKeese extends Inimigo {
    public FireKeese(String apelido){
        setNome("Fire Keese");
        setApelido(apelido);
        setDescricao("Inimigo voador");
        setPv(300);
        setMp(50);
        setNivel(1);
        setTipo("Voador");
    }

}
