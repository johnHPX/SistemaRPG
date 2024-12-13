package enemy.enemies;

import entity.Inimigo;

public class Lizalfos extends Inimigo {
    public Lizalfos(){
        setNome("Lizalfos");
        setDescricao("Inimigo terrestre");
        setPv(500);
        setMp(0);
        setNivel(1);
    }

    @Override
    public void executarAcao() {
        System.out.println(this.getClass().getSimpleName()+ " Atacou!");
    }
}
