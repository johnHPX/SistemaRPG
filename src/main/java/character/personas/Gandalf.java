package character.personas;

import entity.Personagem;
import mechanics.AtaquesArcos.TiroRapido;
import style.Mago;
import weapon.cajados.CajadoComum;

public final class Gandalf extends Personagem {
    public Gandalf(){
        setNome("Gandalf");
        setDescricao("Um Mago da terra-média.");
        setNivel(1);
        setPv(340);
        setMp(300);
        setEstilo(new Mago());
        setArma(new CajadoComum());
        setAtaque(new TiroRapido());
    }
}
