package battlefield;

import character.factorys.FabricaArqueiro;
import character.factorys.FabricaGuerreiro;
import character.factorys.FabricaMago;
import character.factorys.FabricaPersonagem;
import character.characters.Cloud;
import character.characters.Gandalf;
import character.characters.Link;
import character.characters.Wander;
import enemy.enemies.Dodongo;
import enemy.enemies.Lizalfos;
import enemy.enemies.Ork;
import enemy.factorys.FabricaInimigo;
import enemy.factorys.FabricaTerrestre;
import entity.Inimigo;
import entity.Personagem;
import weapon.swords.BusterSword;
import weapon.swords.EspadaComum;
import weapon.swords.MasterSword;

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
        i = f.criar(Lizalfos.class, "Lizalfos");
        inimigos.add(i);
        i = f.criar(Ork.class, "Ork");
        inimigos.add(i);
        i = f.criar(Dodongo.class, "Dodongo");
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
            System.out.println("\t\t\tVocê está no controle de "+pc.getNome());
            System.out.println("-".repeat(60));
            System.out.println("\t\t\t\t\tMENU DE BATALHA");
            System.out.println("-".repeat(60));
            System.out.println("[1] ATACAR INIMIGO ->");
            System.out.println("[2] USAR MAGIA ->");
            System.out.println("[3] DEFENDER");
            System.out.println("[4] AÇÕES ->");
            System.out.println("[5] TROCAR DE ARMAR ->");
            System.out.println("[6] VER STATUS");
            System.out.println("[0] SAIR");
            System.out.println("_".repeat(60));
            System.out.print("O que vai fazer? ");
            op = leia.nextInt();
            int opSecond;
            switch (op){
                case 1:
                    System.out.println("-".repeat(60));
                    int count = 1;
                    for (Inimigo i: inimigos){
                        System.out.printf("[%d] %s PV:%d PV:%d\n", count, i.getApelido(), i.getPv(), i.getMp());
                        count++;
                    }
                    System.out.println("-".repeat(60));
                    System.out.print("Qual é o seu alvo: ");
                    opSecond = leia.nextInt();
                    pc.executarAtaque(inimigos.get(opSecond - 1));
                    System.out.println("-".repeat(60));
                    break;
                case 5:
                    System.out.println("-".repeat(60));
                    System.out.println("\t\t\t\t\tMENU DE ARMAS");
                    System.out.println("-".repeat(60));
                    System.out.println("[1] MasterSword");
                    System.out.println("[2] BusterSword");
                    System.out.println("[3] Espada Comum");
                    System.out.println("[0] Voltar");
                    System.out.println("-".repeat(60));
                    System.out.print("Por qual arma você quer trocar? ");
                    opSecond = leia.nextInt();
                    System.out.println("-".repeat(60));
                    switch (opSecond){
                        case 1:
                            pc.setArma(new MasterSword());
                            System.out.println("\t\t"+pc.getNome()+" trocou sua arma para a MasterSword.");
                            break;
                        case 2:
                            pc.setArma(new BusterSword());
                            System.out.println("\t\t"+pc.getNome()+" trocou sua arma para a BusterSword.");
                            break;
                        case 3:
                            pc.setArma(new EspadaComum());
                            System.out.println("\t\t"+pc.getNome()+" trocou sua arma para uma Espada comum.");
                            break;
                        default:
                            break;
                    }
                    System.out.println("-".repeat(60));
                    break;
                case 6:
                    pc.getStatus();
                    System.out.println("-".repeat(60));
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
