package character.personas;

import entity.Personagem;
import style.Arqueiro;
import weapon.arcos.ArcoComum;
import weapon.espadas.Normal;

public class Wander extends Personagem {

    public Wander(){
        setNome("Wander");
        setDescricao("Um heroi desonhecido");
        setNivel(1);
        setPv(400);
        setMp(50);
        setEstilo(new Arqueiro());
        setArma(new ArcoComum());
    }

}
