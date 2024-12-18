package character.characters;

import entity.Personagem;
import mechanics.attacksArmas.ataquesArcos.TiroRapido;
import style.Arqueiro;
import weapon.bows.ArcoComum;

public final class Wakkar extends Personagem {
    public Wakkar(){
        setNome("Wakkar");
        setDescricao("Capitão de um dos 3 maiores times de Blizball de Spira.");
        setNivel(1);
        setPv(450);
        setMp(100);
        setEstilo(new Arqueiro());
        setArma(new ArcoComum());
        setAtaque(new TiroRapido());
    }
}
