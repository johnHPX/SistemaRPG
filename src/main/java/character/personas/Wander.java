package character.personas;

import entity.Personagem;
import estilo.Arqueiro;

public class Wander extends Personagem {

    public Wander(){
        setNome("Wander");
        setDescricao("Um heroi desonhecido");
        setNivel(1);
        setPv(400);
        setMp(50);
        setEstilo(new Arqueiro());
    }

    @Override
    public void executarAcao() {
        System.out.println("Wander está execuntando uma ação");
    }
}
