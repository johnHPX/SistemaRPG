package character.characters;

import entity.Personagem;
import mechanics.attacksArmas.ataquesEspadas.CorteHorizontal;
import style.Guerreiro;
import weapon.swords.EspadaComum;

public final class Cloud extends Personagem {
    public Cloud(){
        setNome("Cloud");
        setDescricao("Ex-Soldado da Shira.");
        setNivel(1);
        setPv(500);
        setMp(150);
        setEstilo(new Guerreiro());
        setArma(new EspadaComum());
        setAtaque(new CorteHorizontal());
    }
}
