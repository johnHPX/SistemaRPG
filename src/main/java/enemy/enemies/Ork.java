package enemy.enemies;

import entity.Inimigo;

public class Ork extends Inimigo {
    public Ork(){
        setNome("Ork");
        setDescricao("Inimigo terrestre");
        setPv(550);
        setMp(50);
        setNivel(1);
    }

    @Override
    public void executarAcao() {
        System.out.println(this.getClass().getSimpleName()+ " Atacou!");
    }
}
