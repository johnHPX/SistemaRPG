package enemy.enemies;

import entity.Inimigo;

public class Dodongo extends Inimigo {
    public Dodongo(){
        setNome("Dodongo");
        setDescricao("Inimigo terrestre");
        setPv(800);
        setMp(50);
        setNivel(1);
    }

    @Override
    public void executarAcao() {
        System.out.println(this.getClass().getSimpleName()+ " Atacou!");
    }
}