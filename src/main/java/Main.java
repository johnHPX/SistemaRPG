import character.factorys.FabricaArqueiro;
import character.factorys.FabricaGuerreiro;
import character.factorys.FabricaPersonagem;
import character.personas.Link;
import character.personas.Wander;

import enemy.enemies.BatEye;
import enemy.factorys.FabricaInimigo;
import enemy.factorys.FabricaVoador;
import entity.Inimigo;
import entity.Personagem;
import mechanics.Acoes.Fugir;
import mechanics.AtaquesArcos.TiroRapido;
import mechanics.AtaquesEspadas.CorteVertical;
import weapon.arcos.ArcoComum;
import weapon.espadas.Normal;


public class Main {
    public static void main(String []args){
        System.out.println("GAME START!");

        FabricaPersonagem fabGue = new FabricaGuerreiro();
        Personagem link = fabGue.criar(Link.class);

        FabricaPersonagem fabArq = new FabricaArqueiro();
        Personagem wander = fabArq.criar(Wander.class);

        link.getStatus();
        wander.getStatus();

        link.setAcao(new Fugir());
        link.executar();

        FabricaInimigo fabIni = new FabricaVoador();
        Inimigo batEye1 = fabIni.criar(BatEye.class);

        batEye1.getStatus();
        wander.setArma(new Normal());
        wander.setAtaque(new CorteVertical());
        wander.executarAtaque(batEye1);

        batEye1.getStatus();

        wander.setArma(new ArcoComum());
        wander.setAtaque(new TiroRapido());
        wander.executarAtaque(batEye1);
        batEye1.getStatus();

    }
}
