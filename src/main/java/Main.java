import armor.helmets.ElmoDeFerro;
import armor.helmets.ElmoDeJavaliPresa;
import armor.gloves.LuvasDeFerro;
import armor.gloves.LuvasDePedreiro;
import armor.pectorals.ArmaduraDeEspinhos;
import armor.pectorals.TunicaVerde;
import armor.legs.PerneirasDeFerro;
import armor.legs.PerneirasDeSmough;
import character.characters.*;
import character.factorys.FabricaArqueiro;
import character.factorys.FabricaGuerreiro;
import character.factorys.FabricaMago;
import character.factorys.FabricaPersonagem;
import enemy.enemies.AquaFlan;
import enemy.enemies.BatEye;
import enemy.enemies.Dodongo;
import enemy.enemies.Lizalfos;
import enemy.factorys.FabricaInimigo;
import enemy.factorys.FabricaTerrestre;
import enemy.factorys.FabricaVoador;
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

    public static void teste2(){
        FabricaPersonagem fabgue = new FabricaGuerreiro();
        FabricaPersonagem fabArq = new FabricaArqueiro();
        FabricaPersonagem fabMag = new FabricaMago();

        var cloud = fabgue.criar(Cloud.class);
        var wakkar = fabArq.criar(Wakkar.class);
        var saruma = fabMag.criar(Saruman.class);

        FabricaInimigo fabTer = new FabricaTerrestre();
        FabricaInimigo fabVoa = new FabricaVoador();

        var batEye1 = fabVoa.criar(BatEye.class, "Bat Eye 1");
        var batEye2 = fabVoa.criar(BatEye.class, "Bat Eye 2");
        var dodongo = fabTer.criar(Dodongo.class, "Dodongo 1");
        var aquaFlan = fabTer.criar(AquaFlan.class, "Aqua Flan 1");

        cloud.getStatus();
        dodongo.getStatus();

        System.out.println("----------------");

        cloud.executarAtaque(dodongo);
        dodongo.atacar(cloud);

        System.out.println("----------------");
        cloud.getStatus();
        dodongo.getStatus();

        System.out.println("----------------");
        dodongo.lancarFeitico(cloud);
        cloud.getStatus();
    }


    public static void main(String []args) {
//        teste();
        teste2();
    }

    public static void teste(){
        System.out.println("===================================");
        System.out.println("\t\t\tFactory");
        System.out.println("===================================");

        FabricaPersonagem fabGue = new FabricaGuerreiro();

        Personagem link = fabGue.criar(Link.class);
        link.getStatus();
        System.out.println("--------------------------------------");

        Inimigo i;
        FabricaInimigo fabTer = new FabricaTerrestre();
        i = fabTer.criar(Lizalfos.class, "lizalfo 01");
        i.getStatus();

        System.out.println("===================================");
        System.out.println("\t\t\tStrategy");
        System.out.println("===================================");

        link.setArma(new ArcoComum());
        // Strategy here
        link.setAtaque(new TiroRapido());
        link.executarAtaque(i);
        System.out.println("--------------------------------------");
        i.getStatus();
        System.out.println("--------------------------------------");
        // Strategy here
        link.setFeitico(new Trovao());
        link.lancarFeitico(i);
        System.out.println("--------------------------------------");
        i.getStatus();

        System.out.println("===================================");
        System.out.println("\t\t\tDecorator");
        System.out.println("===================================");

        link = new ElmoDeFerro(link);
        link = new TunicaVerde(link);
        link = new PerneirasDeFerro(link);
        link = new LuvasDeFerro(link);

        link.getStatus();

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

        sysFight.addObserver(link);
        sysFight.addObserver(wander);

        link.setArma(new MasterSword());
        link.setAtaque(new CorteHorizontal());

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
