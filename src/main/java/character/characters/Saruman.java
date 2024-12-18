package character.characters;

import entity.Personagem;
import mechanics.attacksArmas.ataquesEspadas.CorteHorizontal;
import style.Mago;
import weapon.staffs.CajadoComum;

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
