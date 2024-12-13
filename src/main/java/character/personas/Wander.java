package character.personas;

import entity.Personagem;
import style.Arqueiro;
import weapon.arcos.ArcoComum;

public final class Wander extends Personagem {

    public Wander(){
        setNome("Wander");
        setDescricao("Um heroi desconhecido. Em busca de revivier sua amada.");
        setNivel(1);
        setPv(400);
        setMp(50);
        setEstilo(new Arqueiro());
        setArma(new ArcoComum());
    }

}
