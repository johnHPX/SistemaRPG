package character.characters;

import entity.Personagem;
import mechanics.attacksArmas.ataquesEspadas.CorteHorizontal;
import style.Ladrao;
import weapon.daggers.AdagaComum;

public final class Rikku extends Personagem {
    public Rikku(){
        setNome("Rikku");
        setDescricao("Personagem de Final Fantasy X");
        setNivel(1);
        setPv(350);
        setMp(150);
        setEstilo(new Ladrao());
        setArma(new AdagaComum());
        setAtaque(new CorteHorizontal());
    }
}
