package enemy.enemies;

import entity.Inimigo;

public class BatEye extends Inimigo {
    public BatEye(){
        setNome("BatEye");
        setDescricao("Inimigo voador");
        setPv(400);
        setMp(50);
        setNivel(1);
        setTipo("Voador");
    }

    @Override
    public void executarAcao() {
        System.out.println(this.getClass().getSimpleName()+ " Atacou!");
    }
}
