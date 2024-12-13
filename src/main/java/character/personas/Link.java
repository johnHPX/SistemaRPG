package character.personas;

import entity.Personagem;
import style.Guerreiro;
import weapon.espadas.Normal;

public class Link extends Personagem {

    public Link(){
        setNome("Link");
        setDescricao("Hero do tempo");
        setNivel(1);
        setPv(450);
        setMp(100);
        setEstilo(new Guerreiro());
        setArma(new Normal());
    }

}
