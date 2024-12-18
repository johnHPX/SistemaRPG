package character.characters;

import entity.Personagem;
import mechanics.attacksArmas.ataquesArcos.TiroRapido;
import style.Arqueiro;
import weapon.bows.ArcoComum;

public final class Wander extends Personagem {

    public Wander(){
        setNome("Wander");
        setDescricao("Um heroi desconhecido. Em busca de revivier sua amada.");
        setNivel(1);
        setPv(400);
        setMp(50);
        setEstilo(new Arqueiro());
        setArma(new ArcoComum());
        setAtaque(new TiroRapido());
    }

}
