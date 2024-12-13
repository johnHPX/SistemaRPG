package character.personas;

import entity.Personagem;
import estilo.Guerreiro;

public class Link extends Personagem {

    public Link(){
        setNome("Link");
        setDescricao("Hero do tempo");
        setNivel(1);
        setPv(450);
        setMp(100);
        setEstilo(new Guerreiro());
    }

    @Override
    public void executarAcao() {
        System.out.println("Link está executando uma ação...");
    }
}
