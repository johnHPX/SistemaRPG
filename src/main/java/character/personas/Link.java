package character.personas;

import entity.Personagem;
import mechanics.AtaquesEspadas.CorteHorizontal;
import style.Guerreiro;
import weapon.espadas.EspadaComum;

public final class Link extends Personagem {

    public Link(){
        setNome("Link");
        setDescricao("Hero do tempo");
        setNivel(1);
        setPv(450);
        setMp(100);
        setEstilo(new Guerreiro());
        setArma(new EspadaComum());
        setAtaque(new CorteHorizontal());
    }

}
