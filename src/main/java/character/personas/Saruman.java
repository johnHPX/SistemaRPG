package character.personas;

import entity.Personagem;
import mechanics.AtaquesEspadas.CorteHorizontal;
import style.Mago;
import weapon.cajados.CajadoComum;

public final class Saruman extends Personagem {
    public Saruman(){
        setNome("Saruman");
        setDescricao("Lider da ordem dos magos da terra-média.");
        setNivel(1);
        setPv(400);
        setMp(350);
        setEstilo(new Mago());
        setArma(new CajadoComum());
        setAtaque(new CorteHorizontal());
    }
}
