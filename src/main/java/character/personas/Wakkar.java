package character.personas;

import entity.Personagem;
import style.Arqueiro;
import weapon.arcos.ArcoComum;

public final class Wakkar extends Personagem {
    public Wakkar(){
        setNome("Wakkar");
        setDescricao("Capitão de um dos 3 maiores times de Blizball de Spira.");
        setNivel(1);
        setPv(450);
        setMp(100);
        setEstilo(new Arqueiro());
        setArma(new ArcoComum());
    }
}
