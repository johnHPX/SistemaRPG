package battlefield;

import character.factorys.FabricaArqueiro;
import character.factorys.FabricaGuerreiro;
import character.factorys.FabricaMago;
import character.factorys.FabricaPersonagem;
import character.personas.Cloud;
import character.personas.Gandalf;
import character.personas.Link;
import character.personas.Wander;
import enemy.enemies.Dodongo;
import enemy.enemies.Lizalfos;
import enemy.enemies.Ork;
import enemy.factorys.FabricaInimigo;
import enemy.factorys.FabricaTerrestre;
import entity.Inimigo;
import entity.Personagem;
import weapon.espadas.BusterSword;
import weapon.espadas.EspadaComum;
import weapon.espadas.MasterSword;

import java.util.ArrayList;
import java.util.Scanner;

public class Arena1 {

    private ArrayList<Personagem> aliados = new ArrayList<Personagem>();
    private ArrayList<Inimigo> inimigos = new ArrayList<Inimigo>();


    private void setupAliados(){
        Personagem p;
        FabricaPersonagem f = new FabricaGuerreiro();
        p = f.criar(Link.class);
        aliados.add(p);
        p = f.criar(Cloud.class);
        aliados.add(p);
        f = new FabricaArqueiro();
        p = f.criar(Wander.class);
        aliados.add(p);
        f = new FabricaMago();
        p = f.criar(Gandalf.class);
        aliados.add(p);
    }

    private void setuoInimigos(){
        Inimigo i;
        FabricaInimigo f = new FabricaTerrestre();
        i = f.criar(Lizalfos.class, );
        inimigos.add(i);
        i = f.criar(Ork.class, );
        inimigos.add(i);
        i = f.criar(Dodongo.class, );
        inimigos.add(i);
    }

    public void sair() throws InterruptedException {
        Thread.sleep(500);
        System.exit(0);
    }


    public void iniciarBatalha() throws InterruptedException {
        setupAliados();
        setuoInimigos();
        Scanner leia = new Scanner(System.in);

        // pc é o personagem controlado no momento
        Personagem pc = this.aliados.getFirst();
        // op é a opção escolhida
        int op;

        String linha = "=".repeat(60);

        System.out.println(linha);
        System.out.printf("%" + (30 + "ARENA 01".length() / 2) + "s%n", "ARENA 01");
        System.out.println(linha);

        while (true){
            System.out.println("Você está no controle de "+pc.getNome());
            System.out.println("MENU DE BATALHA");
            System.out.println("-".repeat(60));
            System.out.println("[1] ATACAR");
            System.out.println("[2] USAR MAGIA");
            System.out.println("[3] DEFENDER");
            System.out.println("[4] AÇOES");
            System.out.println("[5] TROCAR DE ARMAR");
            System.out.println("[6] VER STATUS");
            System.out.println("[0] SAIR");
            System.out.println("_".repeat(60));
            System.out.print("O que vai fazer? ");
            op = leia.nextInt();
            switch (op){
                case 5:
                    int op1;
                    System.out.println("-".repeat(60));
                    System.out.println("MENU DE ARMAS");
                    System.out.println("-".repeat(60));
                    System.out.println("[1] MasterSword");
                    System.out.println("[2] BusterSword");
                    System.out.println("[3] Espada Comum");
                    System.out.println("[0] Voltar");
                    op1 = leia.nextInt();
                    switch (op1){
                        case 1:
                            pc.setArma(new MasterSword());
                            System.out.println(pc.getNome()+" trocou sua arma para a MasterSword.");
                            break;
                        case 2:
                            pc.setArma(new BusterSword());
                            System.out.println(pc.getNome()+" trocou sua arma para a BusterSword.");
                            break;
                        case 3:
                            pc.setArma(new EspadaComum());
                            System.out.println(pc.getNome()+" trocou sua arma para uma Espada comum.");
                            break;
                        default:
                            break;
                    }
                    break;
                case 6:
                    pc.getStatus();
                    break;
                default:
                    sair();
            }

        }

    }

    public void verTodosStatus(){
        System.out.println("Status dos aliados");
        for (Personagem p: aliados){
            p.getStatus();
        }
        System.out.println("-".repeat(60));
        System.out.println("Status dos inimigos");
        for (Inimigo i: inimigos){
            i.getStatus();
        }
    }
}
