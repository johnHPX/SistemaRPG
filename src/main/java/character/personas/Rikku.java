package character.personas;

import entity.Personagem;
import style.Ladrao;
import weapon.adagas.AdagaComum;

public final class Rikku extends Personagem {
    public Rikku(){
        setNome("Rikku");
        setDescricao("Personagem de Final Fantasy X");
        setNivel(1);
        setPv(350);
        setMp(150);
        setEstilo(new Ladrao());
        setArma(new AdagaComum());
    }
}
