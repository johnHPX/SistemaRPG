package enemy.enemies;

import entity.Inimigo;

public class FlameFlan extends Inimigo {
    public FlameFlan(){
        setNome("FlameFlan");
        setDescricao("Inimigo terrestre");
        setPv(600);
        setMp(50);
        setNivel(1);
    }

    @Override
    public void executarAcao() {
        System.out.println(this.getClass().getSimpleName()+ " Atacou!");
    }
}
