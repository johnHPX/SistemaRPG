import armor.helmets.ElmoDeFerro;
import armor.helmets.ElmoDeJavaliPresa;
import armor.gloves.LuvasDeFerro;
import armor.gloves.LuvasDePedreiro;
import armor.pectorals.ArmaduraDeEspinhos;
import armor.pectorals.TunicaVerde;
import armor.legs.PerneirasDeFerro;
import armor.legs.PerneirasDeSmough;
import character.characters.Wakkar;
import character.factorys.FabricaArqueiro;
import character.factorys.FabricaGuerreiro;
import character.factorys.FabricaPersonagem;
import character.characters.Link;
import character.characters.Wander;
import enemy.enemies.Dodongo;
import enemy.enemies.Lizalfos;
import enemy.factorys.FabricaInimigo;
import enemy.factorys.FabricaTerrestre;
import entity.Inimigo;
import entity.Personagem;
import entity.SistemaCombate;
import mechanics.attacksArmas.ataquesArcos.TiroRapido;
import mechanics.attacksArmas.ataquesEspadas.CorteHorizontal;
import mechanics.spells.Cura;
import mechanics.spells.Trovao;
import weapon.bows.ArcoComum;
import weapon.bows.ChamaDeFenix;
import weapon.swords.MasterSword;

public class Main {

    public static void main(String []args) throws InterruptedException {
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
        System.out.println("--------------------------------------");

        Inimigo i;
        FabricaInimigo fabTer = new FabricaTerrestre();
        i = fabTer.criar(Lizalfos.class, "lizalfo 01");
        i.getStatus();

        System.out.println("===================================");
        System.out.println("\t\t\tStrategy");
        System.out.println("===================================");

        p.setArma(new ArcoComum());
        // Strategy here
        p.setAtaque(new TiroRapido());
        p.executarAtaque(i);
        System.out.println("--------------------------------------");
        i.getStatus();
        System.out.println("--------------------------------------");
        // Strategy here
        p.setFeitico(new Trovao());
        p.lancarFeitico(i);
        System.out.println("--------------------------------------");
        i.getStatus();

        System.out.println("===================================");
        System.out.println("\t\t\tDecorator");
        System.out.println("===================================");

        p = new ElmoDeFerro(p);
        p = new TunicaVerde(p);
        p = new PerneirasDeFerro(p);
        p = new LuvasDeFerro(p);

        p.getStatus();

        System.out.println("---------------Teste--------------");
        FabricaPersonagem fabArq = new FabricaArqueiro();
        Personagem wander = fabArq.criar(Wander.class);
        wander.getStatus();
        System.out.println("------------------------");
        wander = new ElmoDeJavaliPresa(wander);
        wander = new LuvasDePedreiro(wander);
        wander = new ArmaduraDeEspinhos(wander);
        wander = new PerneirasDeSmough(wander);
        wander.setAtaque(new TiroRapido());
        wander.getStatus();
        System.out.println("--------------------------------------");
        wander.setFeitico(new Cura());
        Personagem wakkar = fabArq.criar(Wakkar.class);
        wander.lancarFeitico(wakkar);
        System.out.println("--------------------------------------");
        wakkar.getStatus();

        System.out.println("===================================");
        System.out.println("\t\t\tObserver");
        System.out.println("===================================");

        SistemaCombate sysFight = new SistemaCombate();

        sysFight.addObserver(p);
        sysFight.addObserver(wander);

        p.setArma(new MasterSword());
        p.setAtaque(new CorteHorizontal());

        wander.setArma(new ChamaDeFenix());
        wander.setAtaque(new TiroRapido());

        sysFight.acionarStatus();
        System.out.println("------------------------");
        Inimigo dodongo = fabTer.criar(Dodongo.class, "Dodongo 1");
        dodongo.getStatus();
        System.out.println("------------------------");
        sysFight.acionarAtaqueCombinado(dodongo);
        System.out.println("------------------------");
        dodongo.getStatus();
        System.out.println("------------------------");
        sysFight.acionarFuga();
    }
}
