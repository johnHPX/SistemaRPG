package character.personas;

import entity.Personagem;
import mechanics.AtaquesEspadas.CorteHorizontal;
import style.Guerreiro;
import weapon.espadas.EspadaComum;

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
