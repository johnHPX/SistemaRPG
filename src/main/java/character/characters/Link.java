package character.characters;

import entity.Personagem;
import mechanics.attacksArmas.ataquesEspadas.CorteHorizontal;
import style.Guerreiro;
import weapon.swords.EspadaComum;

public final class Link extends Personagem{

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
