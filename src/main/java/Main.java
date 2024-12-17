import battlefield.Arena1;
import character.factorys.FabricaGuerreiro;
import character.factorys.FabricaPersonagem;
import character.personas.Link;
import enemy.enemies.Lizalfos;
import enemy.factorys.FabricaInimigo;
import enemy.factorys.FabricaTerrestre;
import entity.Inimigo;
import entity.Personagem;
import mechanics.AtaquesArcos.TiroRapido;
import weapon.arcos.Arco;
import weapon.arcos.ArcoComum;

public class Main {
    public static void main(String []args) throws InterruptedException {
//        Arena1 a1 = new Arena1();
//        a1.iniciarBatalha();
        teste();

    }


    public static void teste(){
        Personagem p;
        FabricaPersonagem fp = new FabricaGuerreiro();

        p = fp.criar(Link.class);
        p.getStatus();

        // ------------------------------
        Inimigo i;
        FabricaInimigo fi = new FabricaTerrestre();
        i = fi.criar(Lizalfos.class, "lizalfo");
        i.getStatus();
        p.executarAtaque(i);
        i.getStatus();
        System.out.println("-------------------------");

        p.setArma(new ArcoComum());
        p.setAtaque(new TiroRapido());
        p.executarAtaque(i);

        System.out.println("===============================");
        System.out.println("Decorator");
    }
}
