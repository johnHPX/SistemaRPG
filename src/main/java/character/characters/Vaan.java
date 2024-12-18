package character.characters;

import entity.Personagem;
import mechanics.attacksArmas.ataquesEspadas.CorteHorizontal;
import style.Ladrao;
import weapon.daggers.AdagaComum;

public final class Vaan extends Personagem {

    public Vaan(){
        setNome("Vaan");
        setDescricao("Personagem de Final Fantasy XII");
        setNivel(1);
        setPv(410);
        setMp(70);
        setEstilo(new Ladrao());
        setArma(new AdagaComum());
        setAtaque(new CorteHorizontal());
    }

}
