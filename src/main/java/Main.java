import character.factorys.FabricaArqueiro;
import character.factorys.FabricaGuerreiro;
import character.factorys.FabricaPersonagem;
import character.personas.Link;
import character.personas.Wander;
import enemy.enemies.BatEye;
import enemy.enemies.FireKeese;
import enemy.factorys.FabricaInimigo;
import enemy.factorys.FabricaVoador;
import entity.Inimigo;
import entity.Personagem;
import mechanics.CorteHorizontal;
import mechanics.Fugir;

public class Main {
    public static void main(String []args){
        System.out.println("GAME START!");
        System.out.println("-------------------------------------------------");

        FabricaPersonagem fabGue = new FabricaGuerreiro();
        Personagem link = fabGue.criar(Link.class);

        FabricaPersonagem fabArq = new FabricaArqueiro();
        Personagem wander = fabArq.criar(Wander.class);

        link.getStatus();
        System.out.println("_____________________________________________________");
        wander.getStatus();

        FabricaInimigo fabVod = new FabricaVoador();
        Inimigo fireKeese = fabVod.criar(FireKeese.class);
        Inimigo batEye = fabVod.criar(BatEye.class);

        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        fireKeese.getStatus();
        System.out.println("_______________________________________________________");
        batEye.getStatus();

        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        link.setAtaque(new CorteHorizontal());
        link.executarAtaque(batEye);
        System.out.println("________________________________________________________");
        batEye.getStatus();
        System.out.println("===================");
        link.setAcao(new Fugir());
        link.executar();

    }
}
