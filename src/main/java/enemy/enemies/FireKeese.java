package enemy.enemies;

import entity.Inimigo;

public class FireKeese extends Inimigo {
    public FireKeese(){
        setNome("FireKeese");
        setDescricao("Inimigo voador");
        setPv(300);
        setMp(50);
        setNivel(1);
        setTipo("Voador");
    }

    @Override
    public void executarAcao() {
        System.out.println(this.getClass().getSimpleName()+ " Atacou!");
    }
}
