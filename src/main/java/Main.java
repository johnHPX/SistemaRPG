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

public class Main {
    public static void main(String []args){
        System.out.println("GAME START!");

        FabricaPersonagem fabGue = new FabricaGuerreiro();
        Personagem link = fabGue.criar(Link.class);

        FabricaPersonagem fabArq = new FabricaArqueiro();
        Personagem wander = fabArq.criar(Wander.class);

        System.out.println(link.getEstilo());
        link.executarAcao();

        System.out.println(wander.getEstilo());
        wander.executarAcao();

        System.out.println("======================================");
        FabricaInimigo fabVod = new FabricaVoador();
        Inimigo fireKeese = fabVod.criar(FireKeese.class);
        Inimigo batEye = fabVod.criar(BatEye.class);
        System.out.println(batEye.getTipo());
        batEye.executarAcao();
        System.out.println(fireKeese.getTipo());
        fireKeese.executarAcao();

    }
}
