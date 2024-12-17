import armor.capacetes.ElmoDeFerro;
import armor.luvas.LuvasDeFerro;
import armor.peitorais.TunicaVerde;
import armor.pernas.PerneirasDeFerro;
import character.factorys.FabricaGuerreiro;
import character.factorys.FabricaPersonagem;
import character.personas.Link;
import enemy.enemies.Lizalfos;
import enemy.factorys.FabricaInimigo;
import enemy.factorys.FabricaTerrestre;
import entity.Inimigo;
import entity.Personagem;
import mechanics.AtaquesArcos.TiroRapido;
import weapon.arcos.ArcoComum;

public class Main {
    public static void main(String []args) throws InterruptedException {
//        Arena1 a1 = new Arena1();
//        a1.iniciarBatalha();
        teste();

    }


    public static void teste(){
        System.out.println("===================================");
        System.out.println("\t\t\tFactory");
        System.out.println("===================================");

        Personagem p;
        FabricaPersonagem fabGue = new FabricaGuerreiro();

        p = fabGue.criar(Link.class);
        p.getStatus();

        Inimigo i;
        FabricaInimigo fabTer = new FabricaTerrestre();
        i = fabTer.criar(Lizalfos.class, "lizalfo");
        i.getStatus();

        System.out.println("===================================");
        System.out.println("\t\t\tStrategy");
        System.out.println("===================================");

        p.setArma(new ArcoComum());
        p.setAtaque(new TiroRapido());
        p.executarAtaque(i);

        System.out.println("===================================");
        System.out.println("\t\t\tDecorator");
        System.out.println("===================================");

        p = new ElmoDeFerro(p);
        p = new TunicaVerde(p);
        p = new PerneirasDeFerro(p);
        p = new LuvasDeFerro(p);

        p.getStatus();
    }
}
